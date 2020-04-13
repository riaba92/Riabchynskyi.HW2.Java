/*
7.Введите строку текста с клавиатуры — реализуйте программу для
возможности подсчета количества символа — 'b' в этой строке, с выводом результат на экран.
 */
package HW2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;

public class FindB {
    public static void main(String[] args) {
        int counter = 0;
        String text = new String();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your text here:");
        text = scan.nextLine();
        scan.close();

        char [] charText = text.toCharArray();

        for (int i = 0; i < charText.length; i++ ) {
            if (charText[i] == 'b' || charText[i] == 'B') {
                counter += 1;
            };
        };
        System.out.println("Your text contains " + counter + " 'b' symbols!");
    }
}
