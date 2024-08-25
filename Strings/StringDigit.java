public class StringDigit{
    public static void main(String[] args) {
        String s = "Manisha";
        char[] input = s.toCharArray();
        boolean result = false;
        for(char ch: input){
            if(Character.isDigit(ch)){
                result = true;
            }
        }
    System.out.println(result);
    }
}