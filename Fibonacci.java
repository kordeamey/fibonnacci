package Q3;

public class Fibonacci {
    public static void main(String[] args) {
      int n = 10; // number of Fibonacci numbers to print
      int[] fib = new int[n];
  
      fib[0] = 0; // setting first value as 0
      fib[1] = 1;  // setting first value as 1
  
      for (int i = 2; i < n; i++) {
        fib[i] = fib[i-1] + fib[i-2];
      }
  
      System.out.println("First " + n + " Fibonacci numbers:");
      for (int i = 0; i < n; i++) {
        System.out.print(fib[i] + " ");
      }
    }
  }

