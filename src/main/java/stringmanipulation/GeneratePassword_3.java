package stringmanipulation;

import java.util.Random;

public class GeneratePassword_3 {
    public static String generatePassword(int length){
        String st="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<length;i++)
        {
            char c= st.charAt(random.nextInt(st.length()));
            sb.append(c);


        }
        return  sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(generatePassword(8));

    }
}
