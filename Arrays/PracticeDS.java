import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;


public class PracticeDS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number");
        int num = sc.nextInt();
        System.out.println("Select an option");
        System.out.println("1. Print all digits");
        System.out.println("2. Print no.of digits");
        int type = sc.nextInt();
        switch (type) {
            case 1:
                printAllDigits(num);
                break;
            case 2:
                printTotalDigits(num);
                break;
        
            default:
            System.out.println("Invalid type");
                break;
        }
        sc.close();
    }    

    public static int printAllDigits(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        int digit = 0;
        int divisor = 1;
        while(n/divisor >= 10){
            divisor*=10;
        }
        if(n == 0){
        System.out.println("Please enter numbers greater than zero");
        }
        while(n>0){
            digit = n/divisor;
            arr.add(digit);
            n %= divisor;
            divisor /= 10;
        }

        if(arr.size() > 0 ){
            Collections.sort(arr);
            System.out.println(arr);
        }
        return digit;
    }

    public static int printTotalDigits(int n){
        if(n == 0){
            System.out.println("1");
        }
        int count = 0;
        int num = n;
        while(n > 0){
        int digit = n % 10;
        
            count++;
        
            n /= 10;
        }
        System.out.println("No.of digits in "+ num+ " is "+count);
        return count;
    }

}
