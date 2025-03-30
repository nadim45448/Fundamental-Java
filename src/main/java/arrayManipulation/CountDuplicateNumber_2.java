package arrayManipulation;

public class CountDuplicateNumber_2 {
    public static void main(String[] args) {
        int [] number = {1, 2,5, 3, 4, 2, 3, 6,5,8, 2, 8, 5};
        for(int i =0; i<number.length;i++)
        {
            int count = 1;
            for (int j=i+1; j<number.length;j++){
                if(number[i]== number[j]){
                    count++;
                    //System.out.println(number[i]+ " found "+count+" times");


                }
            }
            if(count>1){
                System.out.println(number[i]+" found "+count+" times");
            }
        }
    }
}
