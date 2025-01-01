import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        String str = "ABCD";
        String rev = "";
//1) using charAt and length
        //  int len = str.length();

        //    for(int i =len-1; i>=0; i--){
        //         rev = rev + str.charAt(i);
        //     }
        //      System.out.println(rev);

        // 2)using character Array
//        char[] a = str.toCharArray();
//        int len = a.length;
//
//        for (int i=len-1; i>=0; i--){
//            rev = rev + a[i];
//        }
//        System.out.println(rev);

        //3)using stringBuffer

//        StringBuffer stringBuffer = new StringBuffer(str);
//        System.out.println(stringBuffer.reverse());

        //using collection
        char[] a = str.toCharArray();

        List<Character> list = new ArrayList<Character>();

        for (Character character : a) {
            list.add(character);
        }
        Collections.reverse(list);

        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.print(listIterator.next());
        }
    }
}