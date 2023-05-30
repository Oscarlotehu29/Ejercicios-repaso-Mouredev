using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProblemOne
{
    class Program
    {
        static void Main(string[] args)
        {
            FIZZBUZZ();
        }
        public static void FIZZBUZZ()
        {
            for (int i = 0; i < 101; i++)
            {
                if (i % 3 == 0 && i % 5 == 0) Console.WriteLine("FIZZBUZZ");
                else if (i % 3 == 0) Console.WriteLine("FIZZ");
                else if (i % 5 == 0) Console.WriteLine("BUZZ");
                else Console.WriteLine(i);
            }
            Console.ReadKey();
        }
    }

    
}
