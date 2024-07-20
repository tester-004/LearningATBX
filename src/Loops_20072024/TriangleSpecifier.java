package Loops_20072024;

import java.util.Scanner;

public class TriangleSpecifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side");
        int first_side = sc.nextInt();

        System.out.println("Enter the second side");
        int second_side = sc.nextInt();

        System.out.println("Enter the third side");
        int third_side = sc.nextInt();

       /* if(first_side == second_side && second_side == third_side && first_side == third_side){
            System.out.println("triangle is equilateral");
        } else if (first_side != second_side && second_side== third_side && first_side != third_side) {
            System.out.println("triangle is isosceles");
        } else if {
            System.out.println("triangle is scalene");
        }*/

         if(first_side == second_side && second_side == third_side && first_side == third_side){
            System.out.println("triangle is equilateral");
        } else if (first_side == second_side || second_side== third_side || first_side == third_side) {
            System.out.println("triangle is isosceles");
        } else  {
            System.out.println("triangle is scalene");
        }
        sc.close();
    }
}
