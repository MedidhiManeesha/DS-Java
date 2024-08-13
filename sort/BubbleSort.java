public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {13,46,20,24,52,9};
        createBubbleSort(array);
        PrintBubble(array);
        
    }
    public static void SwapNums(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void createBubbleSort(int[] arr){
        int n = arr.length;
        int didSwap = 0;
        for(int i = n-1; i>=1; i--){
            for(int j=0; j<= i-1; j++){
                if(arr[j] > arr[j+1]){
                    SwapNums(arr,j, j+1);
                    didSwap = 1;
                }
            }
            if(didSwap == 0){
                break;
            }
            
        }
        

    }
    public static void PrintBubble(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
