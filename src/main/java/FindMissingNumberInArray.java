public class FindMissingNumberInArray {
    public static void main(String[] args){
        //Array should not have duplicates
        //Sorted order is not mandatory
        //Value should in a range

        int a[] = {1,2,4,5};

        //1+2+4+5 = sum1
        //1+2+3+4+5 = sum2
        //sum2-sum1 = missing number
        int sum1=0;
        int sum2=0;

        for(int i = 0; i<a.length; i++){
            sum1 = sum1 + a[i];
        }
        System.out.println("Sum of elements in given Array " +sum1);

        for (int i=0; i<=5;i++){
            sum2 = sum2 + i;
        }
        System.out.println("Sum of range of elements in array " +sum2);

        System.out.println("Missing Number is " +(sum2-sum1));


    }
}
