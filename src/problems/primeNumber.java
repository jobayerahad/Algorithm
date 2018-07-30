package problems;

import java.time.*;
import java.util.Scanner;

/**
 * @author Ahad
 */
public class primeNumber {
    public static void primeNumber(int n) {
        long startTime = System.nanoTime();
        int flag = 0;
        if(n == 0 || n == 1){  
            System.out.println(n+" is not prime number");      
        } else {  
            for(int i = 2; i <= n; i++){      
                if(n % i == 0){      
                    System.out.println(n+" is not prime number");      
                    flag = 1;      
                    break;      
                }      
            }      
            if(flag == 0)
                System.out.println(n+" is prime number");  
        }
        long stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);
    }
    
    public static void primeNumber2(int n) {
        long startTime = System.nanoTime();
        int flag = 1;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n % i == 0) {
                flag = 1;
                break;
            } else if(n % i != 0) {
                flag = 0;
            }
        }
        if (flag == 1) {
            System.out.println(n+" is not a prime number");
        } else {
            System.out.println(n+" is a prime number");
        }
        long stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println("Now Normal Procedure");
        primeNumber(x);
        System.out.println("Now Sqrt");
        primeNumber2(x);
    }
}
