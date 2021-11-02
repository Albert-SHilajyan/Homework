package arrayExample;

public class ArrayExampleTest {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int[] array = {4, 5, 6, 9, 8, 154, 5, 4, 54, 4, 84, 48, 58, 41, 4, 8, 7};
       int arrayMax = arrayExample.max(array);
        System.out.println(arrayMax);


    }
}
