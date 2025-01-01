public class SumOfArrayElements {
    public static void main(String[] args){
        int a[] = {5,1,2,3,4,6};
        int sum = 0;

//        for (int i=0; i<=a.length-1; i++){ // a.length - 1 = 5
//            sum =sum + a[i];
//        }
//        System.out.println(sum);

        // using for each loop
        for(int value: a){
            sum = sum + value;
        }
        System.out.println(sum);
    }
}
