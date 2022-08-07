package Recursion;

public class P1_TypeOfRec {
    static void tail(int n) {
        // Termination / Base Case
        if(n == 0) {
            return;
        }
        // Processing Logic
        System.out.println(n);
        // Small Problem
        tail(n-1);
    }    

    static void head(int n) {
        // Termination / Base Case
        if(n == 0) {
            return;
        }
        // Small Problem
        head(n-1);
        // Processing Logic
        System.out.println(n);
    }   

    static void linear(int n) {
        // Termination / Base Case
        if(n == 0) {
            return;
        }
        // Processing Logic
        // System.out.println(n);
        if(n % 2 != 0){
            System.out.println(n);
        }

        // Small Problem
        linear(n-1);
        
        // Processing Logic
        // System.out.println(n);
        if(n % 2 == 0){
            System.out.println(n);
        }
    }
    
    public static void main(String[] args) {
        tail(5);
        System.out.println("===============");
        head(5);
        System.out.println("===============");
        linear(5);
    }
}
