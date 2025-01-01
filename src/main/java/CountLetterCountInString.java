public class CountLetterCountInString {
    public static void main(String[] args){
        String input = "ThathsaraniNayanathara";
        char letterToFind = 'a';

        int count = 0;
        input= input.toLowerCase();

        for (int i=0; i<input.length(); i++){
            if(input.charAt(i)==letterToFind){  // charAt method is use to take one character at time
                count =count + 1;
            }
        }
        System.out.println(letterToFind + " present in " +count + " time in the word");

    }
}
