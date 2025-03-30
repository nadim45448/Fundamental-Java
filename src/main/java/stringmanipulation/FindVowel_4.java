package stringmanipulation;

import java.util.HashSet;

public class FindVowel_4 {
    public static void main(String[] args) {
        String str = "I am a SQA engineer";
        char [] chars = str.toCharArray(); // string pailei char array te convert kore felbo

        String vowel = "aeiou";
        int count=0;
        HashSet hashSet = new HashSet<>();

        for(char c : chars){
           // System.out.println(c);
           // System.out.println(vowel.indexOf(c));
            if(vowel.indexOf(c)!=-1){
                count++;
                hashSet.add(c);
            }

        }
        System.out.println(count);
        System.out.println(hashSet);
        System.out.println(hashSet.size());
    }
}
