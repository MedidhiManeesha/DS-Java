public class ReverseString {
    public static void main(String[] args) {
        String str = "Manisha";
        char[] input = str.toCharArray();
        char[] reversedStr = new char[input.length];
        int j=0;
        for(int i=input.length-1; i>=0; i--){
            reversedStr[j] = input[i];
            j++;
        }

        String reversed = new String(reversedStr);
        System.out.println(reversed.toLowerCase());
        System.out.println(reverseBuilder(str));
    }

    static String reverseBuilder(String s){
        StringBuilder sb = new StringBuilder(s);
        String reverseStr = sb.reverse().toString();
        return reverseStr;
    }
}
