package java_basic;

public class StringDemo {
    public static void main(String[] args) {
        String s1= "Nadim Hossain";
        String s2= new String("Nadim Bin Hossain");
//        System.out.println(s1);
//        System.out.println(s2);

       String []s3={"Apple", "Banana", "Dalim", "Guava"};
//        for(String s:s3){
//            System.out.println(s);
//        }

        char []s4={'a', 'b', 'c', 'd'};
//        for(char c: s4){
//            System.out.println(c);
//        }
//        int len= s4.length;
//        System.out.println(len);
//        int len1=s1.length();
//        System.out.println(len1);
//        int len3=s3.length;
//        System.out.println(len3);

        // equal...............
        String s5="Nadim Hossain";
        String s6="Nadim Hossain";
        if(s5==s6){
            System.out.println("Equal");
        }
        else {
            System.out.println("Not equal");
        }
        // s1.equals(s2), s1.contains(s2)
        // s1.equalsIgnoreCase(s2), isEmpty()

        //length(), equals(), equalsIgnoreCase(), contains(), isEmpty(), concat(), toUppercase(), toLowerCase(), startsWiths(), endsWith()
        //charAt(0): return 0th index value
        // codePointAt(0):return 0th index ASCII value
        //indexOf('n'): first position of n
        // lastIndexOf('n'): last position of n
        // trim(): remove space from beginning and last, not from middle
        //s1.replace('n','m')
        // s1.split(" ")

        // types of string
        // 1. String : not dynamic
        // 2. StringBuffer: dynamic: add, append, reverse, replace.....
        //3. StringBuilder: same as buffer

        // ===== Wrapper class ============
        // Wrapper class: Conversion between primitive data type to object and object to primitive
        // boolean = Boolean
        // char = Character
        // byte = Byte
        // short = Short
        // int = Integer
        // long = Long
        // float = Float
        // double = Double
        // Autoboxing: primitive to object
        // Unboxing: object to primitive

        // primitive to object(Autoboxing)
        int x=5;
        Integer y = Integer.valueOf(x);
        Integer z = x;

        // object to primitive (Unboxing)
       // Double d= new Double(6.25);
       // double e = d.doubleValue();
       // double e = d

        // ===== Primitive to String ==========
        int i = 100;
        String s = Integer.toString(i);

        String st = "20";
        int i1 = Integer.parseInt(st);
        int i2 = Integer.valueOf(st);










    }
}
