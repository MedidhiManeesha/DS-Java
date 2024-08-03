import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class PracticeDS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number");
        int num = sc.nextInt();
        System.out.println("Select an option");
        System.out.println("1. Print all digits");
        System.out.println("2. Print no.of digits");
        System.out.println("3. Print reverse number");
        System.out.println("4. Palindrome or not");
        System.out.println("5. Print all divisor");
        System.out.println("6. Armstrong or not");
        int type = sc.nextInt();
        switch (type) {
            case 1:
                printAllDigits(num);
                break;
            case 2:
                printTotalDigits(num);
                break;
            case 3:
                printReverseNum(num);
                break;
            case 4:
                printPalindrome(num);
                break;
            case 5:
                printAllDivisors(num);
                break;
            case 6:
                printArmstrong(num);
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

    public static int printReverseNum(int n){
        if(n==0){
            return 0;
        }
        if(n<0){
            System.out.println("please enter a positive number");
        }
        int digit = 0;
        int reverseNum = 0;
        while(n>0){
            digit = n%10;
            if(reverseNum > Integer.MAX_VALUE / 10 || reverseNum < Integer.MIN_VALUE){
                return 0;
            }
            if(reverseNum > Integer.MAX_VALUE /10 && digit > 7){
                return 0;
            }
            if(reverseNum < Integer.MIN_VALUE /10 && digit < -8){
                return 0;
            }
            reverseNum = reverseNum * 10 + digit;
            n/=10;
        }
        System.out.println(reverseNum);
        return reverseNum;
    }

    public static void printPalindrome(int n){
        if(n == 0){
            System.out.println("0");
        }
        int digit = 0;
        int original = n;
        int reverse = 0;
        while(n>0){
            digit = n%10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
            if(original == reverse){
                System.out.println("it is palindrome");
            }else{
                System.out.println("not a palindrome");
            }
    }

    public static List<Integer> printAllDivisors(int n){
        List<Integer> arr = new ArrayList<>();
        int num = (int) Math.sqrt(n);
        for(int i=1; i<=num; i++){
            if(n%i == 0){
                arr.add(i);
            
            if(i != n/i){
                arr.add(n/i);
            }
        }
        }
        Collections.sort(arr);
        System.out.println(arr);
        return arr;
    }

    public static void printArmstrong(int n){
        if(n==0){
            System.out.println("0 is Armstrong");
        }
        if(n<0){
            System.out.println("not an armstrong");
        }
        int digit =0;
        int original = n;
        int arm =0;
        while (n>0) {
            digit = n % 10;
            arm  += digit * digit * digit;
            n /= 10;
        }
            if(arm == original){
                System.out.println("It is armstrong");
            }else{
                System.out.println("Not an armstrong");
            }
        
    }

    

}
