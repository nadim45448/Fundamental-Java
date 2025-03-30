package arrayManipulation;

import java.util.HashSet;

public class PrintOnlyDuplicateValue_4 {
    public static void main(String[] args) {
        int [] num={1, 2, 3, 2, 5, 4, 5, 3, 7,8, 1,5};
        HashSet uniqueHashSet = new HashSet();
        HashSet duplicateHashSet = new HashSet<>();
        HashSet nonDuplicate = new HashSet<>();
    // unique and duplicate................
//        for(int c: num){
//            if(!uniqueHashSet.add(c)){
//                duplicateHashSet.add(c);
//            }
//
//
//        }
        // non duplicate...............
//        for (int ch : num){
//            if(!duplicateHashSet.contains(ch)) {
//                nonDuplicate.add(ch);
//            }
//        }
        for (int c : num) {
            if (uniqueHashSet.contains(c)) {
                duplicateHashSet.add(c);  // Mark as duplicate
                nonDuplicate.remove(c);   // Remove from non-duplicate set
            } else {
                uniqueHashSet.add(c);
                nonDuplicate.add(c);  // Add to non-duplicate set initially
            }
        }
       System.out.println(duplicateHashSet); // print only duplicate value
        System.out.println(uniqueHashSet); // print only unique value
        System.out.println(nonDuplicate); // print only non duplicate value


    }
}
