package arrayManipulation;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int [] num ={4,9,2,1,12,7,5};
        for(int i=0;i<num.length;i++){
            for(int j=i+1; j<num.length;j++){
                if(num[i]>num[j]){
                    int temp = num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }

        }
        System.out.println(Arrays.toString(num));

    }
}
