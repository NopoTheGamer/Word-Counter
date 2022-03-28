package com.nopo;

import java.util.Scanner;

public class Main {
    public static int[] charCount = new int[26];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String full = "⣿";
        String[] graph = new String[26];
        System.out.println("What string would you like to check the char count of?");
        String words = scanner.nextLine();
        char[] wordsArray = words.toCharArray();
        char[] alphabetArray = alphabet.toCharArray();
        StringBuilder graphString = new StringBuilder();
        int i;
        int z;
        for (i = 0; i < words.length(); i++) {
            for (z = 0; z < 26; z++) {
                if (wordsArray[i] == alphabetArray[z]) {
                    charCount[z]++;
                }
            }
        }
        for (i = 0; i < 26; i++) {
            //graphString.append(alphabetArray[i]).append(" |\n");
            if (charCount[i] > 0) {
                //System.out.println(alphabetArray[i] + " " + charCount[i] + " " + (int) ((float)charCount[i] / (float) words.length() * 100) + "%");
                graph[i] = full.repeat((int) ((float)charCount[i] / (float) words.length() * 100));
                graphString.append(alphabetArray[i]).append(" | ").append(graph[i]).append(" ").append(charCount[i]).append(" ")
                        .append((int) ((float) charCount[i] / (float) words.length() * 100))
                        .append("%").append("\n");
            }
        }
        System.out.println();
        System.out.println(graphString);
    }
}