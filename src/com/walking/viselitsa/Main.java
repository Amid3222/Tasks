package com.walking.viselitsa;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ViselitsaService viselitsa = new ViselitsaService();

        System.out.println("Слово: " + viselitsa.createLines());
        System.out.println(viselitsa.word);//убрать строку и поменять приватность переменной ворд

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите букву:");
        viselitsa.setCharacter(scanner.next());
        viselitsa.checkWordChar();
        System.out.println(viselitsa.viewLines());


    }
}
