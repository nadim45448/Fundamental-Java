package java_basic;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] arr = new int [2][3];

        for(int i=0; i<2; i++)
        {
            for (int j=0; j<3; j++){
                arr[i][j]= input.nextInt();
            }
        }
    }

}
