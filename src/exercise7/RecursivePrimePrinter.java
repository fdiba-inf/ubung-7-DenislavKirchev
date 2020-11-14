package exercise7;

import java.util.Scanner;

public class RecursivePrimePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        printPrimes(n);
    }

    public static void printPrimes(int n) {
      if(n==2){
        System.out.println(n);
        printPrimes(n-1);
      }else if(n==1){
        System.out.println(n);
      }else{ 
          if(isPrime(n)){
            System.out.println(n);
          }
        
        printPrimes(n-1);
      }
      
      
        // Implement recursive method
    }

    public static boolean isPrime(int n) {
      int divider = 2;
      int maxDivider = (int) Math.sqrt(n);
      boolean prime = true;
      while(prime && (divider <= maxDivider)){
        if (n % divider == 0){
          prime = false;
        }
      divider++;
      }
      return prime;
    }
}
