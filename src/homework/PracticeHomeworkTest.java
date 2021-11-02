package homework;

public class PracticeHomeworkTest {

    public static void main(String[] args) {
        PracticeHomework test = new PracticeHomework();
        System.out.println(test.convert(14));
        System.out.println(test.calcAge(5));
        System.out.println(test.nextNumber(10));
        System.out.println(test.isSameNum(4, 6));
        System.out.println(test.lessThenOrEqualToZero(-10));
         int [] array ={10,15,12,14,19,15,14,13,25};
         int [] array1 ={1,2,23,5,8,4,8,4541,51,55,5,11,51};
        System.out.println(test.maxLength(array, array1) );
    }
}
