/*
5.Написать код для возможности создания массива целых чисел
(размер вводиться с клавиатуры) заполнените элементы произвольными числами.
Выведите этот массив на экран.
 */
package HW2;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ArrayOfIntegers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter array length:");
        int length = in.nextInt();
        in.close();

        int [] array = new int [length];
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            array[i] = rand.nextInt();
        };
        System.out.println(Arrays.toString(array));
    }
}
