/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Fibonacci {
    
    static int fib(int num){
        if(num <= 1){
            return num;
        }
        return fib(num -1 ) + fib(num - 2);
    }
   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = sc.nextInt();
        System.out.println("Fibonacci number of "+num +" is: " +fib(num));
    }
    
}
