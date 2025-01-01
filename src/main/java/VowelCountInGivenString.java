public class VowelCountInGivenString {
    //find the number of vowels in given string
    //input = "Learn Automation"
    //output= 8

    //first assume vowel count is 0
    //change the string to uniform case
    //take the length of string
    //iterate character until the length of string
    //inside the loop check if the char is any of vowel character
    //if so increment the count +1

    public static void main(String[] args){
        String givenText = "Learn Automation";
        int count = 0;

        givenText = givenText.toLowerCase();

        for (int i =0; i<givenText.length(); i++){
            if(givenText.charAt(i) == 'a' || givenText.charAt(i) == 'e'|| givenText.charAt(i) == 'i' || givenText.charAt(i) == 'o' || givenText.charAt(i) == 'u'){
                count++;
            }
        }
        System.out.println("Mentioned sentence have " +count +" vowels");
    }

}
