using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace app.Domain
{
    class Program
    {
        static void Main(string[] args)
        {
            var list = new List<String> { "green", "red" };
            Console.WriteLine(list.Single(x=>x=="red"));
        }
    }
}
