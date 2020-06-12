using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace app.Domain
{ [Serializable]
   public class Pair
    {
        public Racer Racer { get; set; }
        public Race Race { get; set; }

        public Pair(Racer racer,Race race)
        {
            this.Racer = racer;
            this.Race = race;
        }
    }
}
