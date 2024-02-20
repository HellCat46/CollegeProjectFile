import java.io.*;
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Starting Range: ");
        int sRange = sc.nextInt();
        System.out.print("Enter Ending Range: ");
        int eRange = sc.nextInt();
        sc.close();

        StringBuilder primeList = new StringBuilder("[ ");
        for(int idx = sRange; idx <= eRange;idx++){
            if(isPrime(idx)){
                primeList.append(idx).append(", ");
            }
        }
        primeList.delete(primeList.length()-2, primeList.length()-1);
        primeList.append("]");

        System.out.println("Prime Numbers in given range: "+primeList);
    }
    public static boolean isPrime(int num){
        if(num <= 3)
            return true;

        for(int idx = 2; idx <= num/2; idx++){
            if(num % idx == 0)
                return false;
        }
        return true;
    }
}
