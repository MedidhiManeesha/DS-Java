public class RecursionProblems {

    public static void Recursion(int count){ 
        if(count == 4){
            System.out.println("Done");
            return;
        }
        
        System.out.println("Hello Recursion"+ count);
        count++;
        Recursion(count);
        
        
    }

    
    public static void main(String[] args) {
        Recursion(0);
    }
}
