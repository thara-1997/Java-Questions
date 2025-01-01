public class CountSumOfDigitsInNum {
    public static void main(String[] args){
        int num = 1234;
        int sum=0;

        while(num>0) {
            sum = sum + num % 10; // extract the last digit of number user modular(%)
            num = num / 10; // to eliminate the last digit from number devide from 10
        }
        System.out.println(sum);
    }

}
