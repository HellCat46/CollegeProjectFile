import java.io.*;
import java.util.*;

public class Grade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Percentage: ");
        float percentage = sc.nextFloat();
        sc.close();

        char grade = switch ((int) percentage / 10) {
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };

        System.out.println("Grade: "+grade);
    }
}
