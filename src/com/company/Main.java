package com.company;

import java.util.Arrays;

public class Main {
    public static int[] charCount = new int[26];

    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String words = "We're no strangers to love\n" +
                "You know the rules and so do I\n" +
                "A full commitment's what I'm thinking of\n" +
                "You wouldn't get this from any other guy\n" +
                "I just wanna tell you how I'm feeling\n" +
                "Gotta make you understand\n" +
                "Never gonna give you up\n" +
                "Never gonna let you down\n" +
                "Never gonna run around and desert you\n" +
                "Never gonna make you cry\n" +
                "Never gonna say goodbye\n" +
                "Never gonna tell a lie and hurt you\n" +
                "We've known each other for so long\n" +
                "Your heart's been aching but you're too shy to say it\n" +
                "Inside we both know what's been going on\n" +
                "We know the game and we're gonna play it\n" +
                "And if you ask me how I'm feeling\n" +
                "Don't tell me you're too blind to see\n" +
                "Never gonna give you up\n" +
                "Never gonna let you down\n" +
                "Never gonna run around and desert you\n" +
                "Never gonna make you cry\n" +
                "Never gonna say goodbye\n" +
                "Never gonna tell a lie and hurt you\n" +
                "Never gonna give you up\n" +
                "Never gonna let you down\n" +
                "Never gonna run around and desert you\n" +
                "Never gonna make you cry\n" +
                "Never gonna say goodbye\n" +
                "Never gonna tell a lie and hurt you\n" +
                "Never gonna give, never gonna give\n" +
                "(Give you up)\n" +
                "We've known each other for so long\n" +
                "Your heart's been aching but you're too shy to say it\n" +
                "Inside we both know what's been going on\n" +
                "We know the game and we're gonna play it\n" +
                "I just wanna tell you how I'm feeling\n" +
                "Gotta make you understand\n" +
                "Never gonna give you up\n" +
                "Never gonna let you down\n" +
                "Never gonna run around and desert you\n" +
                "Never gonna make you cry\n" +
                "Never gonna say goodbye\n" +
                "Never gonna tell a lie and hurt you\n" +
                "Never gonna give you up\n" +
                "Never gonna let you down\n" +
                "Never gonna run around and desert you\n" +
                "Never gonna make you cry\n" +
                "Never gonna say goodbye\n" +
                "Never gonna tell a lie and hurt you\n" +
                "Never gonna give you up\n" +
                "Never gonna let you down\n" +
                "Never gonna run around and desert you\n" +
                "Never gonna make you cry\n" +
                "Never gonna say goodbye";
        String dash = "-";
        String full = "⣿";
        String[] graph = new String[26];
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
        System.out.println(graphString);
    }
}