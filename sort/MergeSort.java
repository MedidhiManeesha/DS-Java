import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int[] array = {4,1,3,7,5,8};
        mergeSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));

    }
    public static void merge(int arr[], int l, int m, int r)
    {
        int n1 = m-l + 1;
        int n2 = r-m;
        
        int[] left = new int[n1];
        int[] right = new int[n2];
        
         System.arraycopy(arr, l, left, 0, n1);
         System.arraycopy(arr, m+1, right, 0, n2);
         
         int leftIndex = 0, rightIndex = 0, resultIndex =l; 
         
        while(leftIndex < n1 && rightIndex < n2){
            if(left[leftIndex] <= right[rightIndex]){
                arr[resultIndex++] = left[leftIndex++];
            }else{
                arr[resultIndex++] = right[rightIndex++];
            }
        }
        
        while(leftIndex < n1){
            arr[resultIndex++] = left[leftIndex++];
        }
        
        while(rightIndex < n2){
            arr[resultIndex++] = right[rightIndex++];
        }
        
    }
    public static void mergeSort(int arr[], int l, int r)
    {
        if(l < r){
            int m = l +(r-l)/2;
            
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }
       
    }
}
