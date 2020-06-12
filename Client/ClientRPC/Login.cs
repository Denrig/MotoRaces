using app.Networking.gRPC;
using ClientRPC;
using Grpc.Core;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Security.Authentication.ExtendedProtection;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
namespace app.ClientRPC
{
    public partial class Login : Form
    {
        Channel channel;
        Menu menu;
        public Login(Channel channel)
        {
            InitializeComponent();
            this.channel = channel;
            
        }

        private async void exec_ClickAsync(object sender, EventArgs e)
        {
            var client =new IService.IServiceClient(channel);
            Response response=new Response { };
            
           
            try
                {
                    if (User.Text != "" && Pass.Text != "")
                    response = client.login(new LogRequest { Type = LogRequest.Types.Type.In, User = this.User.Text, Pass = this.Pass.Text });
                    if (response.Type != null && response.Type == Response.Types.Type.Ok)
                {
                    menu = new Menu();
                    menu.User = new Domain.User(User.Text);
                    menu.stub = client;
                    menu.initAsync();
                    menu.Show();
                    this.Hide();
                }
            }
            catch(Exception ex)
            {
                MessageBox.Show("User already logged in OR Invalid credetials", "Ups", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }

            
        }
    }
}
