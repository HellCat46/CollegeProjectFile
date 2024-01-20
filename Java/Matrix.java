import java.io.*;
import java.util.*;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows Count in Matrix 1:");
        int rowCount1 = sc.nextInt();
        System.out.print("Enter Rows Count in Matrix 1:");
        int colCount1 = sc.nextInt();
        System.out.print("Enter Rows Count in Matrix 2:");
        int rowCount2 = sc.nextInt();
        System.out.print("Enter Rows Count in Matrix 2:");
        int colCount2 = sc.nextInt();

        if(colCount1 != rowCount2) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }

        int[][] matrix1 = new int[rowCount1][colCount1];
        for(int idx = 0; idx < rowCount1; idx++){
            for(int iidx = 0; iidx < colCount1; iidx++){
                System.out.printf("Enter Value of Row %d, Column %d: ", idx+1, iidx+1);
                matrix1[idx][iidx] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("\n\n");

        int[][] matrix2 = new int[rowCount2][colCount2];
        for(int idx = 0; idx < rowCount2; idx++){
            for(int iidx = 0; iidx < colCount2; iidx++){
                System.out.printf("Enter Value of Row %d, Column %d: ", idx+1, iidx+1);
                matrix2[idx][iidx] = sc.nextInt();
            }
            System.out.println();
        }

        int[][] answer = new int[rowCount1][colCount2];
        for (int idx = 0; idx < rowCount1; idx++)
        {
            for (int iidx = 0; iidx < colCount2 ; iidx++)
            {
                int tot = 0;
                for (int k = 0; k < rowCount2; k++)
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
