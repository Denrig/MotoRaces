using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace app.Domain
{
    [Serializable]
    public class Racer : Entity<long>
    {
        public String Name { get; set; }
        public Team Team { get; set; }
        public Engine Engine { get; set; }

        public Racer(String name,Team team,Engine engine)
        {
            this.Name = name;
            this.Team = team;
            this.Engine = engine;
            
        }

        public Racer(long id,String name, Team team, Engine engine)
        {
            this.Name = name;
            this.Team = team;
            this.Engine = engine;
            this.id = id;
        }

        public override string ToString()
        {
            return "Name:"+Name+" Team:"+Team.ToString()+" Engine:"+Engine.ToString();
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
