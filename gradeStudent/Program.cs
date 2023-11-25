using System.Collections;

Console.Write("Enter Percentage: ");
int percentage = Int32.Parse(Console.ReadLine());
Hashtable gradelist = new Hashtable();
gradelist.Add(10, "A");
gradelist.Add(9, "A");
gradelist.Add(8, "B");
gradelist.Add(7, "C");
gradelist.Add(6, "D");

var grade = gradelist[(percentage / 10)];
Console.Write("Grade: {0}{1}",  (grade != null ? grade : "F"), Getop(percentage));


string Getop(int per)
{
    int grade = per - ((per / 10) * 10);
    if (grade > 7)
        return "+";
    else if (grade > 3 || per < 60)
        return "";
    else
        return "-";
}`