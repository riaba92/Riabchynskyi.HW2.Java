/*
6.Создать массив случайных чисел (размером 15 элементов).
Создайте второй массив в два раза больше, первые 15 элементов должны быть равны элементам первого массива,
а остальные элементы заполнить удвоенных значением начальных. Например
Было → {1,4,7,2}
Стало → {1,4,7,2,2,8,14,4}
 */

package HW2;

import java.util.Arrays;
import java.util.Random;

public class RandomIntegersArray {
    static int initialLength = 15;

    public static void main(String[] args) {
        int [] firstArray = new int[initialLength];
        int [] secondArray = new int[2 * initialLength];
        Random rand = new Random();

        for (int i = 0; i < initialLength; i++) {
            firstArray[i] = rand.nextInt() % 100;
            secondArray[i] = firstArray[i];
            secondArray[i+initialLength] = firstArray[i] * 2;
        };

        System.out.println("Initial array is: " + Arrays.toString(firstArray));
        System.out.println("Final array is: " + Arrays.toString(secondArray));

    }

}
