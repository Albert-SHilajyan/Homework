package homework;

public class ArrayExample {

    public static void main(String[] args) {

        int[] array = {3, 6, 9, 7, 14, 24, 35, 33, 48, 45};

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j -1] = tmp ;

                }


            }


        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +  " ");

        }
    }
}

