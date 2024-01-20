import java.io.*;
import java.util.*;
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        sc.close();

        int fac = 1;
        for(int idx =2; idx<=num; idx++){
            fac *= idx;
        }
        System.out.printf("Factorial of %d is %d", num, fac);
    }
}
