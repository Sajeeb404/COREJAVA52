
package org.idb.test;
import java.util.*;
public class PrimeNumber {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your number");
        int number = input.nextInt();
        int count = 0;
        
        for (int i = 1; i <=number; i++) {
            if (number % i == 0) {
                count++;                
            }            
        }
        if (count == 2) {
            System.out.println(number + " is prime number.");
        }else{
            System.out.println(number + " is not prime number.");
        }
    }
}
