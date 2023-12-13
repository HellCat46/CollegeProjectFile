Console.Write("Enter Starting Range:");
int srange = Int32.Parse(Console.ReadLine());
Console.Write("Enter Ending Range:");
int erange = Int32.Parse(Console.ReadLine());

List<int> primenums = new List<int>();
for (; srange <= erange; srange++)
{
    bool prime = true;
    for (int i = 2; i < srange; i++)
    {
        if (srange % i == 0)
            prime = false;
    }

    if (prime)
        primenums.Add(srange);
}

Console.Write("Prime number in the given range : [");
foreach (int ele in primenums)
{
    Console.Write(ele + ",");
}
Console.Write("]");