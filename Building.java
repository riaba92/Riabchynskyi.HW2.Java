/*
1. Есть девятиэтажный дом, в котором 4 подъезда. Номер подъезда начинается с единицы.
На одном этаже 4 квартиры. Напишите программу которая получит номер квартиры с клавиатуры,
и выведет на экран на каком этаже, какого подъезда расположенна эта квартира. Если такой квартиры нет
в этом доме то нужно сообщить об этом пользователю.
 */
package HW2;

import java.util.Scanner;

public class Building {

    static int entrances = 4;
    static int flores = 9;
    static int flatsOnFlore = 4;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter flat number:");
        int a = reader.nextInt();
        reader.close();

        flatLocation(a);

    }

    static int flatLocation(int nbr) {
        int maxNumber = entrances * flores * flatsOnFlore;

        if ( nbr < 1 || nbr > maxNumber ) {
            System.out.println("There is no flat with such number. Please try again.");
            return 0;
        };

        int flatsPerEntrance = flores * flatsOnFlore;
        int entrance = nbr / flatsPerEntrance + 1;
        int flore = (nbr % flatsPerEntrance) / flatsOnFlore + 1;
        System.out.println("To get to flat #" + nbr + " take entrance #" + entrance + ", flore #" + flore);

        return 0;
    }

}
