using System;
//using System.Collections.Generic;
//using System.Linq;
//using System.Runtime.Serialization;
//using System.ServiceModel;
//using System.ServiceModel.Web;
//using System.Text;

namespace wcfFile
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "Service1" in code, svc and config file together.
    // NOTE: In order to launch WCF Test Client for testing this service, please select Service1.svc or Service1.svc.cs at the Solution Explorer and start debugging.
    public class Service1 : IService1
    {
        //public string GetData(int value)
        //{
        //    return string.Format("You entered: {0}", value);
        //}

        //public CompositeType GetDataUsingDataContract(CompositeType composite)
        //{
        //    if (composite == null)
        //    {
        //        throw new ArgumentNullException("composite");
        //    }
        //    if (composite.BoolValue)
        //    {
        //        composite.StringValue += "Suffix";
        //    }
        //    return composite;
        //}

        public string GetThird(int[] arr)
        {
            if (arr.Length < 3) return "Array length should be atleast 3.";
            for(int i = 0; i<arr.Length; i++)
            {
                for(int j = i+1; j<arr.Length; j++)
                {
                    if (arr[i] < arr[j])
                    {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            
            return String.Format("Third largest number is: {0}", arr[2]);
        }

        public string GetWord(int dig) 
        {
            if (dig < 0 || dig > 9) return "enter a single positive digit";
            string[] words = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
            return words[dig];
        }
    }
}
