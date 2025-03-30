package stringmanipulation;

public class CapitalizeEachWord_2 {
    public static void main(String[] args) {
        String st= "rahim lives in dhaka";
        // Rahim Lives In Dhaka
        String [] words=st.split(" ");
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<words.length;i++)
        {
            //System.out.println(String.valueOf(words[i].charAt(0)).toUpperCase());
            String firstLetter = String.valueOf(words[i].charAt(0)).toUpperCase();
            String otherLetter = words[i].substring(1);
            //System.out.println(firstLetter+otherLetter);
            //sb.append(firstLetter).append(otherLetter).append(" ");
            String word = firstLetter + otherLetter;
            sb.append(word).append(" ");

        }

        System.out.println(sb.toString().trim());


    }
}
