import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Preferred number");
        int num = sc.nextInt();

        //1) using algorithm
//        int rev = 0;
//        while (num !=0){
//            rev = rev*10 + num%10; //0+4 = 4  // 40+3 = 43 // 430+2 = 432  //4320+ 1 = 4321
//            num = num/10; // 1234/10 = 123    // 123/10 = 12   // 12/10 = 1    //1/10 = 0
//        }
//        System.out.println(rev);

        //2) using StringBuffer
        StringBuffer rev;

        StringBuffer sb = new StringBuffer(String.valueOf(num));
        rev = sb.reverse();
        System.out.println("Reverse num:" +rev);
    }
}
