package main;

import service.Palindrom;

import java.util.Scanner;

/**
 * Created by Kamil on 2016-11-20.
 */
public class Main {

    public static void main(String[] args) {


        System.out.print("Podaj słowo które chcesz odwrócić: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        if (word.contains(" ")) {
            System.out.println("Słowo nie może zawierać spacji");
            System.exit(0);
        }
        Palindrom palindrom = new Palindrom();
        System.out.print("Twoje odwrócone słowo to: ");
        System.out.print(palindrom.reverse(word));


    }


}
