public class SumOfIntegersInAString {
    // Find numbers from given string and find sum of them
    //input = "LearnAutomation123"
    //output = 1+2+3 = 6
    //steps
    //1)assume total equal to 0
    //2) Take length of string and iterate
    //3) inside loop fetch each char in a variable
    //4) verify fetched char is numeric value by using isDigit()
    //5)if it is digit get the numeric value and add value into total

    public static void main(String[] args){
        String input = "LearnAutomation123";
        int total = 0;

        for(int i=0;i<input.length(); i++){
            char character = input.charAt(i);

            if (Character.isDigit(character)){
                total = total + Character.getNumericValue(character);

            }
        }
        System.out.println(total);
    }
}
