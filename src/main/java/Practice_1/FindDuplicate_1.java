package Practice_1;

public class FindDuplicate_1 {
    public static void main(String[] args) {
        int [] arr ={1, 2,5, 3, 4, 2, 3, 6,5,8};

        for (int i = 0; i< arr.length; i++){
            for (int j = i+1; j< arr.length; j++){
                if(arr[i]== arr[j]){
                    System.out.println(arr[i] + " duplicates found");
                    break;
                }
            }
        }

    }
}
