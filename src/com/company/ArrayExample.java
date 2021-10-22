package com.company;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = {3, 6, 9, 7, 14, 24, 35, 33, 48, 45};
        int tmp = array[0];



        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[i + 1]) {
                i = i + 1;

            }

            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    j = j + 1;
                    tmp = array[j];

                }


            }

            System.out.println(array[i]);
        }
    }
}

