public class ReverseWordInSentence {
    public static void main(String[] args) {
        String sentence = "Learn Automation in Sinhala";
        String rev = "";

        String[] splitWord = sentence.split(" ");
        int count = splitWord.length;
        System.out.println(count);

        for (int i=splitWord.length -1; i>=0; i--){
            rev= rev+ splitWord[i] + " ";
        }
        System.out.println(rev);

    }
}
