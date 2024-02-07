import java.util.Scanner;

public class function{
    public static int PrintHelloWorld(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        return  3;
    }
    public static int claculateSum(int a, int b){  //parameter or formal parameter
      
       int sum = a+b;
       return sum;
      
    }
    public static int Product(int a, int b){
        int pro = a*b;
        return pro;
    }
    public static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static int binCoffecient(int n , int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoffe = fact_n / (fact_r * fact_nmr);
        return binCoffe;
    }
    //function to claculate sum of two numbers 
    // public static int sum(int a, int b){
    //     return a+b;
    // }
    // function to calculate summ of three numbers
    // public static int sum(int a , int b , int c){
    //     return a+b+c;
    // }
    //function to claculate sum using data type
    public static int sum (int a , int b){
        return a+b;
    }
    public static float sum(float a , float b){
        return a+b;
    }
    // public static boolean isPrime(int n){
    //    boolean isPrime = true;

    //     for(int i=2; i<=n-1; i++){
    //         if(n%i==0){
    //             isPrime=false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }
    // public static boolean isPrime(int n){
    //     //corner case
    //     //2
    //     if(n==2){
    //         return true;
    //     }
    //     for(int i=2; i<=n-1; i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primesInRange(int n){
      for(int i=2; i<=n-1; i++){
        if(isPrime(i)){
            System.out.print(i + " ");
        }
      }
      System.out.println();
    }
    public static void main(String[] args) {
      //System.out.println(isPrime(17));
      primesInRange(20);
    }
}