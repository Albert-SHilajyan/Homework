package homework.file;

import java.util.Scanner;

    public class FileUtilTest {
        static Scanner scanner = new Scanner(System.in);
        static FileUtil fileUtil = new FileUtil();


        public static void main(String[] args) {

            System.out.println("Please input package name");
            String packageName = scanner.nextLine();
            System.out.println("Please input file name");
            String fileName = scanner.nextLine();
            System.out.println("Please input content");
            String content = scanner.nextLine();
            fileUtil.createFileWithContent(packageName, fileName, content);
        }
    }

