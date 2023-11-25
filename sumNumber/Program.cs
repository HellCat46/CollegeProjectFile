Console.Write("How many numbers do you want enter:");
int len = Int32.Parse(Console.ReadLine());
int sum = 0;

for (int i = 0; i < len; i++)
{
    Console.Write("Enter {0}th number:", i+1);
    sum += Int32.Parse(Console.ReadLine());
}

Console.WriteLine("\nSum of all the provided numbers : " + sum);