package arrayManipulation;

public class Basic_1 {
    public static void main(String[] args) {
        String str="Hello Java";
        char [] arr = str.toCharArray();

//        System.out.println(str.length());
//        System.out.println(arr.length);

     //   System.out.println(arr[0]);
       // System.out.println(String.valueOf(arr[0]).toLowerCase()); // convert a char from string lowercase

        //System.out.println(arr[arr.length-1]);

//        System.out.println(str.charAt(2));

//        System.out.println(str.contains("Java"));
//        System.out.println(str.equals("hello Java"));
//        System.out.println(str.replace("Java", "JavaScript"));

//        String []words= str.split(" ");
//        System.out.println(words[0]);

       // ==========split and parsing==================
        String money = "100.50";
//        String [] m= money.split(".");
        String [] m= money.split("\\.");
//        System.out.println(m[0]);
//        String note1=m[0];
//        String note2= m[1];
//        int n1=Integer.parseInt(note1);
//        int n2=Integer.parseInt(note2);
//        int note1=Integer.parseInt(m[0]);
//        int note2=Integer.parseInt(m[1]);
//        System.out.println(note1+note2);

        // ===== substring/Crop =====
        String str1="I live in Mirpur, Dhaka";

//        System.out.println(str1.substring(10));
//        System.out.println(str1.substring(10, 15));

        //System.out.println(str1.indexOf("M"));
//        int beginningIndex = str1.indexOf("M");
//        int endingIndex =(beginningIndex+5);
//        System.out.println(str1.substring(beginningIndex,endingIndex));

//        String s4="    Dhaka    ";
//        System.out.println(s4.trim());

        // ====== String builder============
        // string to array, array to string
        StringBuilder sb= new StringBuilder();
        String st="Hello Java";
        char [] ar = str.toCharArray();
        sb.append(ar);
        System.out.println(sb);






    }
}
