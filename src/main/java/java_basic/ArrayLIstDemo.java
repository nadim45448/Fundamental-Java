package java_basic;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLIstDemo {
    public static void main(String[] args) {
        ArrayList <Integer> num = new ArrayList<>();
        //System.out.println(num.size());

        num.add(10);
        num.add(15);
        num.add(25);
        // 1st.................
        //System.out.println(num);
        num.add(0,3);

       // System.out.println(num);
       // System.out.println(num.size());

//        // 2nd.............
//        for(int x: num){
//            System.out.print(" "+x);
//        }

//        // 3rd...........................
//        Iterator itr= num.iterator();
//        while (itr.hasNext()){
//            System.out.print(" "+itr.next());
//        }
//        boolean check = num.isEmpty();
//        System.out.println(check);
//        num.clear();
//        boolean check1 = num.isEmpty();
//        System.out.println(check1);

        //contains() true or false
        // num.indexof(15) return index no
        //set (1,50) replace 50 at index 1 (existing value k replace kora hoy)
        // get(0) return 0th index value

        // methods of array list..............
        // size ()
        // add()
        //remove()
        // removeAll()
        //clear()
        // isEmpty()
        // contains()
        // indexOf()
        //set()
        //get()
        //equals()
        //addALL()

        // Collections.sort(num)
        //Collections.sort(num, collections.reverseOrder())



   }
}
