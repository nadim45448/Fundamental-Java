package stringmanipulation;

public class DigitExtraction_5 {
    public static void main(String[] args) {
        String message="Your secret code is 1234. don’t share with anybody.\r\nBvwt3fpjs2S";
        String code=message.replaceAll("[^0-9]", "").substring(0, 4);
        System.out.println(code);

    }


}
