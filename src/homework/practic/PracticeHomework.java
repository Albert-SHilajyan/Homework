package homework.practic;

public class PracticeHomework {

    long convert(int minutis) {

        int second = 60 * minutis;
        return second;
    }

    int calcAge(int years) {
        int days = 365 * years;
        return days;
    }

    int nextNumber(int number) {
        int next = number + 1;
        return next;
    }

    boolean isSameNum(int a, int b) {
        boolean j;
        if (a == b) {
            j = true;
        } else {
            j = false;
        }
        return j;
    }

    boolean lessThenOrEqualToZero(int number) {
        boolean b;

        if (number <= 0) {
            b = true;
        } else {
            b = false;

        }
        return b;
    }

    int maxLength(int[] array, int[] array1) {
        int max;
        if (array.length > array1.length) {
            max = array.length;
        } else {
            max = array1.length;

        }
        System.out.print("max = ");
        return max;
    }

    boolean reverseBool(boolean value) {
        boolean b;
        if (value == true) {
            b = false;
        } else {
            b = true;
        }
        return b;
    }
}