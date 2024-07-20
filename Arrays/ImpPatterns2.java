import java.util.Scanner;
public class ImpPatterns2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 25");
        int n = sc.nextInt();

        System.out.println("Select any patternType");
        System.out.println("12.NumberCrown");
        System.out.println("13.NumberPyramid");
        System.out.println("14.AlphaPyramid");
        System.out.println("15.AlphaRevPyramid");
        System.out.println("16.AlphaSameRevPyramid");
        System.out.println("17.AlphaSymmetryPyramid");
        System.out.println("18.NAlphaTriangle");
        System.out.println("19.HallowDiamond");
        int patternType = sc.nextInt();

        switch (patternType) {
            case 12:
                printNumberCrown(n);
                break;
            case 13:
                printNumberPyramid(n);
                break;
            case 14:
                printAlphaPyramid(n);
                break;
            case 15:
                printAlphaRevPyramid(n);
                break;
            case 16:
                printAlphaSameRevPyramid(n);
                break;
            case 17:
                printAlphaSymmetryPyramid(n);
                break;
            case 18:
                printNAlphaTriangle(n);
                break;
            case 19:
                printHallowDiamond(n);
                break;
            default:
            System.out.println("Invalid PatternType");
                break;
        }
    }
    public static void printNumberCrown(int n){
        int space = 2*(n-1);
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(j+1);
            }
            for(int k=0; k<=space; k++){
                System.out.print(" ");
            }
            for(int j=i; j>=0; j--){
                System.out.print(j+1);
            }
            System.out.println();
            space -= 2;
        }
    }

    public static void printNumberPyramid(int n){
        int start = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(start+" ");
                start += 1;
            }
            System.out.println();
        }
    }

    public static void printAlphaPyramid(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print((char)('A' + j )+" ");

            }
            System.out.println();
        }
    }
    public static void printAlphaRevPyramid(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print((char)('A'+j)+" ");
            }
            System.out.println();
        }
    }

    public static void printAlphaSameRevPyramid(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print((char)('A'+i)+" ");
            }
            System.out.println();
        }
    }


    public static void printAlphaSymmetryPyramid(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            char ch='A';
            int breakpoint =(2*i+1)/2; 
            for(int j=1; j<=2*i+1; j++){
                System.out.print(ch+" ");
                if(j<=breakpoint){
                    ch++;
                }else{
                    ch--;
                }
            }
            System.out.println();
        }
    }

    public static void printNAlphaTriangle(int n){
        
        for(int i=0; i<n; i++){
            for(char ch = (char)('A'+ n-1);  ch >= 'A'+n-i-1; ch--){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void printHallowDiamond(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            for(int k=0; k<2*i; k++){
                System.out.print(" ");
            }
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n-1; i>=0; i--){
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            for(int k=0; k<2*i; k++){
                System.out.print(" ");
            }
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
