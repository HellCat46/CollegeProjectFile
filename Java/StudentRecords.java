import java.io.*;
import java.util.*;

public class StudentRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> stuList = new ArrayList<>();
        while (true)
        {
            Student student = new Student();
            System.out.println("Enter Following Information about Student:");
            System.out.print("Roll Number: ");
            student.rollNo = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            student.name = sc.nextLine();
            System.out.print("Father's Name: ");
            student.fName = sc.nextLine();
            System.out.print("Division: ");
            student.div = sc.next();
            System.out.print("Total Marks: ");
            student.tot_marks = sc.nextInt();
            stuList.add(student);

            System.out.println("\n");
            System.out.print("Do you want to add more data? (Y/N)");
            var input = sc.next();

            if (input.equals("N"))
                break;

            System.out.println("\n\n");
        }

        System.out.println("\n\n\n");
        System.out.println("Roll No. \t|\t Name \t|\t Father's Name \t|\t Division \t|\t Total Marks");
        for(Student student : stuList)
            System.out.printf("%d \t|\t %s \t|\t %s \t|\t %s \t|\t %d\n", student.rollNo, student.name, student.fName,
                student.div, student.tot_marks);
    }
}

class Student {
    public int rollNo, tot_marks;
    public String name, fName, div;
}