package com.walking.viselitsa;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ViselitsaService viselitsa = new ViselitsaService();


        System.out.println("Слово: " + viselitsa.createLines());
        System.out.println(viselitsa.word);//убрать строку и поменять приватность переменной ворд

        do {
            System.out.println("Введите букву:");
            viselitsa.setCharacter(scanner.next());
            viselitsa.checkWordChar();
            if (viselitsa.fullword) break;
            System.out.println("Слово: " + viselitsa.viewLines());
        } while (!viselitsa.finishGameStatus());


    }
}
