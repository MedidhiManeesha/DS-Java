import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Select your solution type");
        System.out.println("1. print all Digits");
        System.out.println("2. Find no.of digits");
        System.out.println("3. Reverse the number");
        System.out.println("4. Check Palindrome number");
        System.out.println("5. Print all divisors");
        System.out.println("6. Minimum jumps");
        System.out.println("7. Prime number or not");
        int solve = sc.nextInt();
        sc.nextLine(); 

        int n = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        if (solve == 6) {
            System.out.println("Enter the array numbers, type 'done' when finished:");
            while (true) {
                String input = sc.nextLine();
                if (input.equalsIgnoreCase("done")) {
                    break;
                }
                try {
                    int num = Integer.parseInt(input);
                    arr.add(num);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter an integer or type 'done' to finish.");
                }
            }
        } else {
            System.out.println("Enter number:");
            n = sc.nextInt();
        }

        switch (solve) {
            case 1:
                printDigits(n);
                break;
            case 2:
                printFindNoDigits(n);
                break;
            case 3:
                reverseNum(n);
                break;
            case 4:
                isPalindromeNum(n);
                break;
            case 5:
                printAllDivisors(n);
                break;
            case 6:
                printMinimumJumps(arr);
                break;
            case 7:
                printPrimeNum(n);
                break;
            default:
            System.out.println("Invalid type");
                break;
        }
        sc.close();
    } 
    public static void printDigits(int n){
        int divisor = 1;
        while(n/divisor >=10){
            divisor*=10;
        }
        while(n>0){
            int digit = n/divisor;
            System.out.print(digit+", ");
            n = n%divisor;
            divisor/=10;
        }
    }

    public static int printFindNoDigits(int n){
        
        while(n == 0){
            return 0;
        }
        int count = 0;
        while(n!=0){
            int digit = n%10;
            if(digit !=0 ){
                count++;
            }
            n/=10;
        }
        System.out.println("number of digits are:"+count);
        return count;
    }

    public static int reverseNum(int x){
        if(x==0){
            return 0;
        }
        int reversed =0;
        while(x!=0){
        int digit = x%10;
        x/=10;
        if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10) {
                return 0;
            }
        if(reversed > Integer.MAX_VALUE /10 && digit > 7){
            return 0;
        }
        if(reversed < Integer.MIN_VALUE / 10 && digit < -8){
            return 0;
        }
        reversed = reversed * 10 + digit;
        }
        System.out.print(reversed);
        return reversed;  
    }

    public static boolean isPalindromeNum(int n){
        if(n==0){
            return true;
        }
        if(n<0){
            return false;
        }
        int reversed = 0;
        int num = n;
        boolean status = false;
        while(n>0){
            int digit = n%10;
            reversed = reversed* 10 +digit;
            if(reversed == num){
                status =  true;
            }else{
                status = false;
            }
            n/=10;
        }
        System.out.println(status);
        return status;
    }
    
    public static List<Integer> printAllDivisors(int n){
        List<Integer> divisors = new ArrayList<>();
        int sqrt = (int) Math.sqrt(n);
        for(int i=1; i<=sqrt; i++){
            if(n%i ==0){
                divisors.add(i);
            
            
            if(i != n/i){
                divisors.add(n/i);
            }
        }
        }
        Collections.sort(divisors);
        System.out.println(divisors);
        return divisors;
    }

    public static int printMinimumJumps(ArrayList<Integer> arr){
        System.out.println(arr);
        int n = arr.size();
        int jumps = 0;
        int currEnd = 0;
        int currFarthest = 0;
        
        for(int i=0; i<n-1; i++){
            if(n<=1){
                System.out.println("0");
                return 0;
                
            }
            currFarthest = Math.max(currFarthest, i+arr.get(i));
            if(currEnd == i){
                jumps++;
                currEnd = currFarthest;
            
            if(currEnd >= n-1){
                System.out.println("It has reached with "+jumps+" jumps");
                return jumps;
                
            }
        }
    }
    System.out.println("cannot reach to end");
    return -1;
    }

    public static void printPrimeNum(int n){
        int count = 0;
        
        for(int i=1; i*i<=n;i++){
            if(n%i == 0){
                count++;
                if((n/i) != i){
                    count++;    
                }   
            }
        }
        if(count == 2){
            System.out.println("It is a prime");
            
        }else{
            System.out.println("It is not a prime");
        }
    }
}
