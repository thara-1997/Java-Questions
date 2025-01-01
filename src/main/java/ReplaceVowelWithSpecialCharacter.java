public class ReplaceVowelWithSpecialCharacter {
    public static void main(String[] args){
        //approach01
        /*1) input = "I want to Learn Automation"
          2) Convert string into character Array
          3)calculate the length of string and iterate
          4)inside the loop check char(index) == vowel
          5)if found vowel assign value *
          6)outside the loop iterate again and print new value


          Approach 02
          1)using replaceAll string method
         */


        String givenValue = "I want to Learn Automation";
        //givenValue = givenValue.toLowerCase();
        /*char[] charArray = givenValue.toCharArray();
        for(int i=0; i<givenValue.length(); i++){
            if(givenValue.charAt(i) == 'A' || givenValue.charAt(i) == 'E'|| givenValue.charAt(i) == 'I'|| givenValue.charAt(i) == 'O'|| givenValue.charAt(i) == 'U'|| givenValue.charAt(i) == 'a'
            || givenValue.charAt(i) == 'e' || givenValue.charAt(i) == 'i' || givenValue.charAt(i) == 'o'|| givenValue.charAt(i) == 'u'){
                charArray[i] = '*';
            }
        }
        for (int i=0; i<givenValue.length(); i++){
            System.out.print(charArray[i]);
        }

         */

        String replacedText = givenValue.replaceAll("[AEIOUaeiou]","#");
        System.out.println(replacedText);
    }
}
