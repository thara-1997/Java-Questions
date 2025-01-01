public class PrintEvenAndOddNumbersInArray {
    public static void main(String[] args){
        int a[] = {1,2,3,4,5,6};

        System.out.println("Print Even numbers");
//        for(int i=0; i<a.length; i++){
//            if(a[i]%2 ==0){
//                System.out.println( a[i]);
//            }
//        }
        for(int even:a){
            if (even%2 == 0){
                System.out.println( even);
            }
        }
        System.out.println("Print Odd numbers");
//        for(int i=0; i<a.length; i++){
//            if(a[i]%2 !=0){
//                System.out.println( a[i]);
//            }
//        }
        for (int odd: a){
            if (odd%2 != 0){
                System.out.println( odd);
            }
        }

    }
}
