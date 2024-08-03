import java.util.HashMap;
public class Hashing{
    public static void main(String[] args) {
        int[] arr = {3,4,2,3,3,4,5};
        createHashMap(arr);
    }

    public static void createHashMap(int arr[]){
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        for(int i=0; i<arr.length; i++){
            Integer c = hmap.get(arr[i]);
            if(c== null){
                hmap.put(arr[i], 1);
            }else{
                hmap.put(arr[i],++c);
            }
        }
        System.out.println(hmap);
    }
}