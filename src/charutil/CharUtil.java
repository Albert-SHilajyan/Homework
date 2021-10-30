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
//            if (bolola[bolola.lenght -1] == 'l' && bolola[bolola.lent - 2] == 'y') {
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
//        System.out.print(bolola[bolola.length / 2 - 1]);
//        System.out.println(bolola[bolola.length / 2]);

//
//        char[] babola = {'b', 'a', 'b', 'o', 'l', 'a'};
//        boolean isbob = false;
//        for (int i = 0; i < babola.length -2; i++) {
//            if (babola[i] == 'b' && babola[i + 2] == 'b') {
//                isbob = true;
//
//            }
//        }System.out.println(isbob);

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};

        int startindex = 0;

        int endindex = text.length - 1;

        while (startindex < endindex && startindex == ' ') {
            startindex++;
        }
        while (startindex < endindex && endindex == ' ') {
            endindex--;
        }
        char[] result = new char[(endindex - startindex) + 1];

        int index = 0;
        for (int i = startindex; i <= endindex; i++) {
            result[index++] = text[i];

        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

        }

    }
}

