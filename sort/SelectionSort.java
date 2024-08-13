public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {42, 13, 56, 9, 26, 34, 67};
        printSelectSort(array);
        System.out.println("Sorted array");
        printSorted(array);
    }

    public static void printSelectSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int minInd = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[minInd]){
                    minInd = j;
                }
            }
            int temp = arr[minInd];
            arr[minInd] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printSorted(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }



}
