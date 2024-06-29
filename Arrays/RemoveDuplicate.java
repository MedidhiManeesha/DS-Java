import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class RemoveDuplicate{
    public static void main(String[] args){
        Integer[] arrayDuplicate = {1,1,2,2,3,4,4,5,5,6};
        Set<Integer> setWithoutDuplicate = new HashSet<>(Arrays.asList(arrayDuplicate));
        Integer[] arrayWithoutDuplicate = setWithoutDuplicate.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arrayWithoutDuplicate));
    }
}