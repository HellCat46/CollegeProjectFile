Console.Write("Enter a number: ");
int num = Int32.Parse(Console.ReadLine());

int ans = 1;
for (int i = 2; i <= num; i++)
{
    ans *= i;
}

Console.WriteLine("Factorial of {0} is {1}", num, ans);