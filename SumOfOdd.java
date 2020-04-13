/*
4.Дан массив {0,5,2,4,7,1,3,19} — написать программу для подсчета нечетных цифр в нем.
 */

package HW2;

public class SumOfOdd {
    public static void main(String[] args) {
        int sum = 0;
        int array[] = {0,5,2,4,7,1,3,19};

        for (int i = 0; i < 8; i++) {
            if (array[i] % 2 != 0) {
                sum += array[i];
            };
        };
        System.out.println(sum);
    }
}
