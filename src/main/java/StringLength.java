public class StringLength {
    public static void main(String[] args){
        String givenString = "LearningAutomation";
        System.out.println(givenString.length());

        char[] charArray = givenString.toCharArray();

        int length=0;
        for(Character c: charArray){
            length++;
        }
        System.out.println(length);
    }
}
