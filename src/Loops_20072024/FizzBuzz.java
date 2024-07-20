package Loops_20072024;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        //int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = sc.nextInt();

        if(i%3==0 && i%5==0){
            System.out.println("Fizzbuzz");
        } else if (i%3==0) {
            System.out.println("Fizz");
        }else if(i%5==0){
            System.out.println("Buzz");
        }else{
            System.out.println("Not a fizzbuzz");
        }
        sc.close();
    }
}
