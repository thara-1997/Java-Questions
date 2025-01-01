import java.util.HashMap;

public class CountEachWord {
    public static void main(String[] args){
        countEachWord("Haashir");
    }
    public static void countEachWord(String typed_name){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] charArray = typed_name.toCharArray();
        for(Character character :charArray){
            if(map.containsKey(character)){
                map.put(character, map.get(character)+1); // put use to insert
            }
            else {
                map.put(character,1);
            }
        }
        System.out.println(map);
    }
}
