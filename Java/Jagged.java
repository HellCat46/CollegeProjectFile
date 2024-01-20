import java.io.*;
import java.util.*;

public class JaggedArray {
    public static void main(String[] args){
        int[][] arr = new int[3][];

        arr[0] = new int[]{1, 2, 3, 4, 5};
        arr[1] = new int[]{1};
        arr[2] = new int[]{ 3, 4, 2, 1, 5, 3 };

        for (int idx =0; idx<arr.length; idx++)
        {
            System.out.printf("Row %d: ", idx+1);
            for(int ele : arr[idx])
            {
                System.out.printf(ele+",");
            }
            System.out.println();
        }
    }
}
