import java.io.*;
import java.util.*;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[][] matrix1 = new int[2][2];
        for(int idx = 0; idx < 2; idx++){
            for(int iidx = 0; iidx < 2; iidx++){
                System.out.printf("Enter Value of Row %d, Column %d: ", idx+1, iidx+1);
                matrix1[idx][iidx] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("\n\n");

        int[][] matrix2 = new int[2][2];
        for(int idx = 0; idx < 2; idx++){
            for(int iidx = 0; iidx < 2; iidx++){
                System.out.printf("Enter Value of Row %d, Column %d: ", idx+1, iidx+1);
                matrix2[idx][iidx] = sc.nextInt();
            }
            System.out.println();
        }

        int[][] answer = new int[2][2];
        for (int idx = 0; idx < 2; idx++)
        {
            for (int iidx = 0; iidx < 2 ; iidx++)
            {
                int tot = 0;
                for (int k = 0; k < 2; k++)
                {
                    tot += (matrix1[idx][k]*matrix2[k][iidx]);
                }

                answer[idx][iidx]=tot;
            }
        }

        System.out.println("Answer:");
        for (int[] rows : answer) {
            for (int num : rows) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}
