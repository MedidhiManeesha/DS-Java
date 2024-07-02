public class LeftRbyD {
        // Function to left rotate the array by d places
        static void leftRotate(int[] arr, int d) {
            int n = arr.length;
            // Normalize d in case it's larger than array length
            d = d % n;
            
            // Temporary array to store elements to be rotated
            int[] temp = new int[d];
            
            // Store the first d elements in temp array
            for (int i = 0; i < d; i++) {
                temp[i] = arr[i];
            }
            
            // Shift the remaining elements of arr[]
            for (int i = d; i < n; i++) {
                arr[i - d] = arr[i];
            }
            
            // Store back the elements from temp[]
            for (int i = 0; i < d; i++) {
                arr[n - d + i] = temp[i];
            }
        }
        
        // Utility function to print an array
        static void printArray(int[] arr) {
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int d = 4; // Number of rotations
            
            System.out.println("Original array:");
            printArray(arr);
            
            leftRotate(arr, d);
            
            System.out.println("Array after left rotation by " + d + " places:");
            printArray(arr);
        }
    
    
}
