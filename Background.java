/*
С помощью циклов нарисовать «обои». Причем количество полос должно вводиться с клавиатуры. В примере 7 полос.
***+++***+++***+++***
***+++***+++***+++***
***+++***+++***+++***
***+++***+++***+++***
***+++***+++***+++***
 */

package HW2;

import java.util.Scanner;

public class Background {

    public static void main(String[] args) {
        int row = 5;
        String result = "";

        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter number of colomns:");
        int col = reader.nextInt();
        reader.close();


        for (int j = 0; j < col; j++) {
            if (j % 2 == 0) {
                result += "***";
            } else {
                result += "+++";
            }
        };

        for (int i = 0; i < row; i++) {
            System.out.println(result);
        }

    }
}
