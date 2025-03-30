package arrayManipulation;

import java.util.HashSet;

public class DuplicateCountUsingHashSet_3 {
    public static void main(String[] args) {
        int [] number = {1, 2,5, 3, 4, 2, 3, 6,5,8, 2, 8, 5};
        HashSet hash= new HashSet<>();
        for(int i=0;i<number.length;i++)
        {
            if(hash.contains(number[i])){
                continue;
            }
            int count =1;
            for(int j=i+1;j<number.length;j++){
                if(number[i]==number[j]){
                    count++;
                }
            }
            if(count>1){
                System.out.println(number[i]+" found "+count+" times");
            }
            hash.add(number[i]); // add only unique value
        }
        System.out.println();
        System.out.println(hash);
    }
}
