using app.Domain;
using app.Networking.gRPC;
using Grpc.Core;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace app.ClientRPC
{
    public partial class Menu : Form
    {

        public User User { get; set; }
        public IService.IServiceClient stub { get; set; }
        BindingList<app.Domain.Racer> bindingList=new BindingList<Domain.Racer>();
        BindingList<app.Domain.Race> bidingRaces=new BindingList<Domain.Race>();
        private IClientStreamWriter<Request> streamWriter;
        private bool filterd = false;

        public Menu()
        {
            InitializeComponent();
        }

        private void Menu_Load(object sender, EventArgs e)
        {
            readRacers();
            racersData.DataSource = bindingList;
            readRaces();
            dataGridView1.DataSource = bidingRaces;
            foreach (var v in (Domain.Engine[])Enum.GetValues(typeof(Domain.Engine)))
                racerEngine.Items.Add(v);
            foreach (var v in (Domain.Team[])Enum.GetValues(typeof(Domain.Team)))
                team.Items.Add(v);

        }
        //SENDING REQUEST TO SERVER TO GET THE ARRAY OF RACERS
        private async void readRacers()
        {
            bindingList.Clear();
            try
            {
                using (var call = stub.findAllRacers(new GetRacers { }))
                {
                    var responseStream = call.ResponseStream;
                    while (await responseStream.MoveNext())
                    {
                        app.Networking.gRPC.Racer racer = responseStream.Current;
                        bindingList.Add(new Domain.Racer(racer.Id, racer.Name, (Domain.Team)Enum.Parse(typeof(Domain.Team), racer.Team.ToString(), true), (Domain.Engine)Enum.Parse(typeof(Domain.Engine), racer.Engine.ToString(), true)));
                    }

                }
            }
            catch (Exception e)
            {
                throw e;
            }

        }
        //SENDING REQUEST TO SERVER TO GET THE ARRAY OF RACES
        private async void readRaces()
        {
            bidingRaces.Clear();
            racesSelector.Items.Clear();
            try
            {

                using (var call = stub.getAvailableRaces(new GetRaces { }))
                {
                    var responseStream = call.ResponseStream;
                    while (await responseStream.MoveNext())
                    {
                        Networking.gRPC.Race race = responseStream.Current;
                        Domain.Race race1 = new app.Domain.Race(race.Id, (Domain.Engine)Enum.Parse(typeof(Domain.Engine), race.Engine.ToString(), true), DateTime.Parse(race.Date), (int)race.NoRacers);
                        bidingRaces.Add(race1);
                        racesSelector.Items.Add(race1);
                    }

                }
            }
            catch (Exception e)
            {
                throw e;
            }

        }
        //INITIALIZEIN THE BI-DIRECTIONAL STREAM OF COMMUNICATON
        public async Task initAsync()
        {
            var call = stub.makeCall();
            this.streamWriter= call.RequestStream;
          
            var responseReader = Task.Run(async () =>
            {
                while(await call.ResponseStream.MoveNext())
                {
                    handleResponse(call.ResponseStream.Current);
                }
            });
            await streamWriter.WriteAsync(new Request { Type = Request.Types.Type.Init, User = this.User.Id });
            await responseReader;
        }
        //HANDELING THE RECEIVED RESPONSES 
        private void handleResponse(Response response)
        {
            switch (response.Type)
            {
                case Response.Types.Type.Add:
                    bindingList.Add(new Domain.Racer(response.Racer.Id, response.Racer.Name, (Domain.Team)Enum.Parse(typeof(Domain.Team), response.Racer.Team.ToString(), true), (Domain.Engine)Enum.Parse(typeof(Domain.Engine), response.Racer.Engine.ToString(), true)));
                    racersData.DataSource = bindingList;
                    readRaces();
                    break;
                case Response.Types.Type.Delete:
                    Domain.Racer racer= new Domain.Racer(response.Racer.Id, response.Racer.Name, (Domain.Team)Enum.Parse(typeof(Domain.Team), response.Racer.Team.ToString(), true), (Domain.Engine)Enum.Parse(typeof(Domain.Engine), response.Racer.Engine.ToString(), true));
                    foreach (Domain.Racer racer1 in bindingList)
                    {
                        if (racer1.id == racer.id)
                        {
                            bindingList.Remove(racer1);
                            break;
                        }

                    }
                    racersData.DataSource = bindingList;
                    readRaces();
                    break;
                case Response.Types.Type.Ok:
                    break;


            }
        }


        private void racerAdd_Click(object sender, EventArgs e)
        {
            try
            {
                Networking.gRPC.Racer racer = new Networking.gRPC.Racer {Name=Nume.Text,Team=(Networking.gRPC.Team)Enum.Parse(typeof(Networking.gRPC.Team), ((Domain.Team)team.SelectedItem).ToString(), true), Engine= (Networking.gRPC.Engine)Enum.Parse(typeof(Networking.gRPC.Engine), ((Domain.Engine)racerEngine.SelectedItem).ToString(), true) };
                Domain.Race race = (Domain.Race)racesSelector.SelectedItem;
                Networking.gRPC.Race race1 = new Networking.gRPC.Race { Id = race.id, NoRacers = (uint)race.NoRacers, Date = race.Date.ToString("yyyy-MM-dd").Split()[0], Engine = (Networking.gRPC.Engine)Enum.Parse(typeof(Networking.gRPC.Engine), race.Engine.ToString(), true) };
                streamWriter.WriteAsync(new Request { Type = Request.Types.Type.Add, Race = race1, Racer = racer });
            }
            catch (NullReferenceException ex1)
            {
                Console.WriteLine(ex1.Message);
                MessageBox.Show("All input fields must be selected and completed", "Ups", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message, "Ups", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }
           
            Nume.Text = "Name";
            team.Text = "Team";
            racerEngine.Text = "Engine";
            racesSelector.Text = "Races";
        }

        private async void racerDelete_Click(object sender, EventArgs e)
        {
            try
            {
             await streamWriter.WriteAsync(new Request { Type = Request.Types.Type.Delete, Racer = new Networking.gRPC.Racer { Id = uint.Parse(racersData.CurrentCell.Value.ToString()) } });
            }
            catch (FormatException)
            {
                MessageBox.Show("If you want to delet an Racer plese select the ID column for that specific racer.", "Ups", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }
            catch (ArgumentOutOfRangeException)
            {
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message, "Ups", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }
            Nume.Text = "Name";
            team.Text = "Team";
            racerEngine.Text = "Engine";
            racesSelector.Text = "Races";
        }

        private void racerFilter_Click(object sender, EventArgs e)
        {
            try
            {
                if (team.SelectedItem != null)
                {
                    filterd = !filterd;
                    racerFilter.Text = "Filterd=" + filterd.ToString();
                    if (filterd == true)
                        racersData.DataSource = bindingList.ToList().FindAll(x => x.Team == (Domain.Team)team.SelectedItem);
                    else racersData.DataSource = bindingList;
                }

            }
            catch (Exception ex)
            {
                racersData.DataSource = bindingList;
            }
            Nume.Text = "Name";
            team.Text = "Team";
            racerEngine.Text = "Engine";
            racesSelector.Text = "Races";
        }

        private void exit_Click(object sender, EventArgs e)
        {
            try
            {
               
                stub.logout(new LogRequest { Type = LogRequest.Types.Type.Out, User = User.Id });
                Application.Exit();
            }
            catch (Exception ee) { Console.WriteLine(ee.Message);
               Application.Exit();
            }
           
        }

        private void racerEngine_SelectedIndexChanged(object sender, EventArgs e)
        {
            racesSelector.Items.Clear();
            racesSelector.Items.AddRange(bidingRaces.ToList().FindAll(x => x.Engine == (Domain.Engine)racerEngine.SelectedItem).ToArray());
        }
    }
}
