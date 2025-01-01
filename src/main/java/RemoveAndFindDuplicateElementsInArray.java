import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveAndFindDuplicateElementsInArray {
    public static void main(String[] args){
        int [] arraylist = {1,2,3,4,2,5,6,1,3};
//        ArrayList<Integer> duplicates = remove_find_Duplicates(arraylist);
//        System.out.println(duplicates);
        findRemoveDuplicates(arraylist);
    }

//    public static ArrayList<Integer> remove_find_Duplicates( int [] array){
//        ArrayList<Integer> removeDuplicates = new ArrayList<>();
//        ArrayList<Integer> findDuplicate = new ArrayList<>();
//        for(int num: array){
//            if (!removeDuplicates.contains(num)) {
//                removeDuplicates.add(num);
//            }
//            else {
//                findDuplicate.add(num);
//            }
//        }
//        return findDuplicate;
//    }
    public static void findRemoveDuplicates(int[] arr){
        HashSet<Integer> uniqueList = new HashSet<>();
//        for(int num:arr){
//            if(uniqueList.add(num)==false){
//                System.out.println("duplicates " +num);
//            }
//        }
//        System.out.println("After Remove Duplicates "+uniqueList);

        // only asking for remove duplicates
        for (int num:arr){
            uniqueList.add(num);
        }
        System.out.println("After Remove Duplicates "+uniqueList);
    }
}
