public class Insertion {
    public static void main(String[] args) {
        int[] array = {6,7,4,2,45,3,6};
        createInsertionSort(array);
        PrintSort(array);
        
    }
    public static void SwapNums(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void createInsertionSort(int[] arr){
        int n = arr.length -1;
        for(int i=0; i<=n; i++){
            int j = i;
            while (j>0 && arr[j-1] > arr[j]) {
                SwapNums(arr, j, j-1);
                j--;
            }
        }
    }
    public static void PrintSort(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
