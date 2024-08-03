import java.util.Scanner;
import java.util.ArrayList;

public class RecursionProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select any option");
        System.out.println("1. Recursion basic");
        System.out.println("2. Reverse an array");
        int select = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> arrNum = new ArrayList<>();
       
        if(select == 2){
            System.out.println("Enter the array numbers, type 'done' when finished:");
            while (true) {
                String input = sc.nextLine();
                if (input.equalsIgnoreCase("done")) {
                    break;
                }
                try {
                    int num = Integer.parseInt(input);
                    arrNum.add(num);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter an integer or type 'done' to finish.");
                }
            }
        }
        switch (select) {
            case 1:
            Recursion(0);
                break;
            
            case 2:
            ReverseArray(arrNum, 0, arrNum.size() -1);
            System.out.println("Reversed array"+arrNum);
            default:
                break;
        }
        
        sc.close();
    }

    public static void Recursion(int count){ 
        if(count == 4){
            System.out.println("Done");
            return;
        }
        System.out.println("Hello Recursion"+ count);
        count++;
        Recursion(count);
    }

    public static void ReverseArray(ArrayList<Integer> arr, int left, int right){
    if(left >=right){
         return;
    } 

    int temp = arr.get(left);
    arr.set(left, arr.get(right));
    arr.set(right, temp);

    ReverseArray(arr, left+1, right-1);
    }
    
}
