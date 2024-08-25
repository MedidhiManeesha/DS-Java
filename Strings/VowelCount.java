import java.util.ArrayList;
public class VowelCount {
    public static void main(String[] args) {
        String str = "Manisha";
        
        System.out.println(Counting(str.toLowerCase()));
    }

    static int Counting(String s){
        ArrayList<Character> vowels = new ArrayList<>();
        String vow = "aeiou";
        int count = 0;
        for(int i=0; i<vow.length(); i++){
            vowels.add(vow.charAt(i));
        }
        for(int i=0; i<s.length(); i++){
            if(vowels.contains(s.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
