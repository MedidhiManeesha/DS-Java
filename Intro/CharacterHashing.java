import java.util.HashMap;
public class CharacterHashing {
    public static void main(String[] args) {
        String str = "abcdabcs hello world";
        createCharHash(str);
    }

    public static void createCharHash(String s){
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            Integer count = hmap.get(c);
            if(count == null){
                hmap.put(c,1);
            }else{
                hmap.put(c, ++count);
            }
        }
        System.out.println(hmap);
    }
}
