using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace app.Domain
{
    [Serializable]
    public class Race: Entity<long>
    {
        public Engine Engine { get; set; }
        public DateTime Date { get; set; }

       public int NoRacers { get; set; }

        public Race(Engine engine,DateTime date)
        {
            this.Engine = engine;
            this.Date = date;
        }
        public Race(long id,Engine engine, DateTime date)
        {
            this.id = id;
            this.Engine = engine;
            this.Date = date;
        }
        public Race(long id, Engine engine, DateTime date,int no)
        {
            this.id = id;
            this.Engine = engine;
            this.Date = date;
            this.NoRacers = no;
        }


        public override string ToString()
        {
            return "Engine:"+Engine.ToString()+" Date:"+Date.Date.ToString();
        }

        public override bool Equals(object obj)
        {
            return base.Equals(obj);
        }

        public override int GetHashCode()
        {
            return base.GetHashCode();
        }
    }
}
