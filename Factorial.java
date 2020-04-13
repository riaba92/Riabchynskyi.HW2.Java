/*
Вычислить с помощью цикла факториал числа - n введенного с клавиатуры (4<n<16).
Факториал числа это произведение всех чисел от этого числа до 1. Например 5!=5*4*3*2*1=120
 */


package HW2;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your number");
        int number = in.nextInt();
        in.close();

        getFactorial(number);
    }

    ;

    static int getFactorial(int x) {
        int result = 1;

        if (x < 4 || x > 15) {
            System.out.println("Please try another number.");
            return 0;
        }
        ;

        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        ;

        System.out.println(result + " is a factorial of " + x);
        return 0;
    };
}