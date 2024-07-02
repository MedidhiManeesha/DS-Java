public class LeftRbyD2 {
        // Function to reverse an array in the range [start, end]
        static void reverse(int[] arr, int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    
        // Function to left rotate the array by d places
        static void leftRotate(int[] arr, int d) {
            int n = arr.length;
            // Normalize d in case it's larger than array length
            d = d % n;
            
            // Reverse the first d elements
            reverse(arr, 0, d - 1);
            // Reverse the remaining elements
            reverse(arr, d, n - 1);
            // Reverse the entire array
            reverse(arr, 0, n - 1);
        }
        
        // Utility function to print an array
        static void printArray(int[] arr) {
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        
        public static void main(String[] args) {
            int[] arr = {10, 15, 20, 25, 30};
            int d = 2; // Number of rotations
            
            System.out.println("Original array:");
            printArray(arr);
            
            leftRotate(arr, d);
            
            System.out.println("Array after left rotation by " + d + " places:");
            printArray(arr);
        }
}
