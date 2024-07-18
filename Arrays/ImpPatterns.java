
import java.util.Scanner;
public class ImpPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a value of N between 1 to 25:");
        int n = sc.nextInt();

        if(n < 1 || n > 25){
            System.out.print("Enter a valid number between 1 to 25");
            sc.close();
            return;
        }

        System.out.println("Enter a pattern");
        System.out.println("1.NDimensionalForest");
        System.out.println("2.Nby2DimensionalForest");
        System.out.println("3.Nby2DimenForest1");
        System.out.println("4.Nby2DimenForest2");
        System.out.println("5.SeedingLeft");
        System.out.println("6.SeedingLeftNum");
        System.out.println("7.Pyramid");
        System.out.println("8.InversePyramid");
        System.out.println("9.Diamond");
        System.out.println("10.HalfDiamond");
        System.out.println("11.BinaryTree");
        int patternType = sc.nextInt();
        switch (patternType) {
            case 1:
                printNDimensionalForest(n);
                break;
            case 2:
                printNby2DimensionalForest(n);
                break;
            case 3:
                printNby2DimenForest1(n);
                break;
            case 4:
                printNby2DimenForest2(n);
                break;
            case 5:
                printSeedingLeft(n);
                break;
            case 6:
                printSeedingLeftNum(n);
                break;
            case 7:
                printPyramid(n);
                break;
            case 8:
                printInversePyramid(n);
                break;
            case 9:
                printDiamond(n);
                break;
            case 10:
                printHalfDiamond(n);
                break;
            case 11:
                printBinaryTree(n);
                break;
            default:
                System.out.println("Invalid PatternType");
                break;
        }
        sc.close();
    }
    public static void printNDimensionalForest(int n){
    for(int i = 0; i<n; i++){
        for(int j =0; j<n; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    }

    public static void printNby2DimensionalForest(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
  
    public static void printNby2DimenForest1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }

    public static void printNby2DimenForest2(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
    
    public static void printSeedingLeft(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printSeedingLeftNum(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
    
    public static void printPyramid(int n){
        for(int i=0; i<n; i++){
            for(int k=0; k<n-i-1; k++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    
    }

    public static void printInversePyramid(int n){
        for(int i=n-1; i>=0; i--){
            for(int k=0; k<n-i-1; k++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printDiamond(int n){ 
        printPyramid(n);
        printInversePyramid(n);
    }

    public static void printHalfDiamond(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printBinaryTree(int n){
        int start = 0;
        for(int i=0; i<n; i++){
            if(i%2==0){
                start =0;
            }else{
                start =1;
            }
            for(int j=0; j<=i; j++){    
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    // public static void printNumCrown(int n){

    // }

}




