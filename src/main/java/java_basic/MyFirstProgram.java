package java_basic;

import java.util.Scanner;

public class MyFirstProgram {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int [] arr = new int[5];
       int sum=0;
        System.out.println("Enter number:");
       for(int i=0; i<arr.length;i++){
           arr[i]=input.nextInt();
           sum+=arr[i];
       }
        System.out.println("Summation is "+sum);


    }
}
