int[][] arr = new int[3][];

arr[0] = new[] { 1, 2, 3, 4, 5 };
arr[1] = new []{1};
arr[2] = new []{ 3, 4, 2, 1, 5, 3 };

for (int i =0; i<arr.Length; i++)
{
    Console.Write("{0}th Row: ", i+1);
    foreach(int ele in arr[i])
    {
        Console.Write(ele+",");
    }
    Console.WriteLine();
}