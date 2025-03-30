package arrayManipulation;

public class FindDuplicate_1 {
    public static void main(String[] args) {
        int [] number = {1, 2,5, 3, 4, 2, 3, 6,5,8};
        for(int i =0; i<number.length;i++)
        {
            for (int j=i+1; j<number.length;j++){
                if(number[i]== number[j]){
                    System.out.println(number[i]+ " Douplicate found");


                }
            }
        }

    }
}
