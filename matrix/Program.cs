int[,] mat1 = new int[2,2];
int[,] mat2 = new int[2,2];

Console.WriteLine("Enter Elements for First Matrix");
for (int i = 0; i < mat1.GetLength(0); i++)
{
    for (int j = 0; j < mat1.GetLength(1); j++)
    {
        Console.Write("Enter value of row {0} and column {1}: ", i+1, j+1);
        mat1[i,j] = Int32.Parse(Console.ReadLine());
    }
}
Console.Clear();
Console.WriteLine("Enter Elements for Second Matrix");
for (int i = 0; i < mat2.GetLength(0); i++)
{
    for (int j = 0; j < mat2.GetLength(1); j++)
    {
        Console.Write("Enter value of row {0} and column {1}: ", i+1, j+1);
        mat2[i,j] = Int32.Parse(Console.ReadLine());
    }
}
Console.Clear();

int[,] res = new int[mat1.GetLength(0), mat2.GetLength(1)];
for (int i = 0; i < res.GetLength(0); i++) // Used for rows of mat1
{
    for (int j = 0; j < res.GetLength(1); j++) // Used for mat2's column
    {
        int tot = 0;
        for (int k = 0; k < mat2.GetLength(0); k++) // Used for mat1's colums and mat2's row
        {
            tot += (mat1[i, k]*mat2[k,j]);    
            // Console.WriteLine("{0}*{1}={2}",mat1[i, j],mat2[k,j],tot);
        }
        
        res[i, j] =tot;
    }
}

Console.WriteLine("Answer:");
for (int i = 0; i < res.GetLength(0); i++)
{
    for (int j = 0; j < res.GetLength(1); j++)
    {
        Console.Write("{0}\t", res[i,j]);
    }
    Console.Write("\n");
}