internal class Program
{
    public static void Main(string[] args)
    {
        List<Student> stulist = new List<Student>();
        while (true)
        {
            Student student = new Student();
            Console.Clear();
            Console.WriteLine("Enter Following Information about Student:");
            Console.Write("Roll Number: ");
            student.rollno = int.Parse(Console.ReadLine());
            Console.Write("Name: ");
            student.name = Console.ReadLine();
            Console.Write("Father's Name: ");
            student.fname = Console.ReadLine();
            Console.Write("Division: ");
            student.div = Console.ReadLine();
            Console.Write("Total Marks: ");
            student.tot_marks = int.Parse(Console.ReadLine());
            stulist.Add(student);
            
            Console.Clear();
            Console.Write("Do you want to add more data? (Y/N)");
            var input = Console.ReadLine();
            
            if (input == "N")
                break;
        }

        Console.Clear();
        Console.WriteLine("Roll No. \t|\t Name \t|\t Father's Name \t|\t Division \t|\t Total Marks");
        foreach (var student in stulist)
            Console.WriteLine("{0} \t|\t {1} \t|\t {2} \t|\t {3} \t|\t {4}", student.rollno, student.name, student.fname,
                student.div, student.tot_marks);
    }

    private struct Student
    {
        public int rollno, tot_marks;
        public string name, fname, div;
    }
}