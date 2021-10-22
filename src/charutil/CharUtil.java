package charutil;

import javax.swing.*;

public class CharUtil {

    public static void main(String[] args) {
//        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
//        char c = 'o';
//        int countC = 0;
//        for (int i = 0; i < bolola.length; i++) {
//            if (bolola[i] == c) {
//                countC++;
//
//            }
//
//
//        }
//        System.out.println("countc = " + countC);

//        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
//
//        int endLy = bolola[0];
//
//        for (int i = 0; i < bolola.length; i++) {
//
//            if (bolola[4] == 'l' & bolola[5] == 'y') {
//
//                System.out.println("true");
//            } else {
//
//            }
//
//        }
//        System.out.println("false");
//
//        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
//        int lo = bolola[1];
//        for (int i = 2; i < bolola.length - 2; i++) {
//            if (bolola[i] > lo) {
//
//            }
//            System.out.println(bolola[i]);
//        }
//        char[] babola = {'b', 'a', 'b', 'o', 'l', 'a'};
//        int bob = 0;
//        for (int i = 0; i < babola.length - 2; i++) {
//            if (bob > i + 2) {
//
//
//            } else {
//            }
//
//        }System.out.println("true");
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};

        char[] result = new char[text.length];
        for (int i = 0; i < text.length; i++)
            if (text[i] == ' ') {
                text[i] =text [i + 1];
                for (int j = 0; j < result.length; j++) {
                    if (result[i] == 'b') {
                        j = j + 1;

                    }
                }

                System.out.println(result[i]);
            }
    }
}
