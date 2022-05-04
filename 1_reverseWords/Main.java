package com.huthefh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String reversedWords;
        //read input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("inter sentence:");
        String input = scanner.nextLine();

        Sentence sentence = new Sentence(input);
        try {
            reversedWords = sentence.reverseWords();
            System.out.println(reversedWords);
        } catch (NullPointerException e) {
            System.out.println("can't reverse null value");
        }
    }
}
