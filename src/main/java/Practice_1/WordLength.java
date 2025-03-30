package Practice_1;

public class WordLength {
    public static void main(String[] args) {
        String mystr="This is my country";
        //count string length
        System.out.println(mystr.length());
        String[] str= mystr.split(" ");
        //count word length
        for (String s : str){
            System.out.println(s.length());
        }

    }

}
