import java.io.*;
import java.util.*;
public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amount of Number you want to add: ");
        int count = sc.nextInt();

        int tot = 0;
        for(int idx = 0; idx < count; idx++){
            System.out.printf("Enter %d'th number: ", idx+1);
            tot += sc.nextInt();
        }
        sc.close();

        System.out.println("Total of All Numbers: "+tot);
    }
}
