public class CountEvenAndOddDigits {
    public static void main(String[] args){
        int num = 4567852;
        int oddCount = 0;
        int evenCount = 0;

        while (num > 0){
            int reminder = num%10;
            if(reminder%2 ==0){
                evenCount++;
            }
            else {
                oddCount++;
            }
            num = num/10;
        }
        System.out.println(evenCount);
        System.out.println(oddCount);
    }
}
