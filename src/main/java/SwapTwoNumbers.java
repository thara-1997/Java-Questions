public class SwapTwoNumbers {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        System.out.println("Before swapping two numbers: " +a +","+b);
       // 1)Using third variable
//        int c = a;
//        a = b;
//        b = c;

//        System.out.println("After swapping two numbers: " +a +","+b);
       //2) using + and - without using third variable
//        a = a + b;
//        b = a - b;
//        a = a - b;
//
//        System.out.println("After swapping two numbers: " +a +","+b);

        //3) using * and / without using third variable
        a = a * b; //200
        b = a/b; //200/20 = 10
        a = a/b; // 200/10 = 20

        System.out.println("After swapping two numbers: " +a +","+b);
    }
}
