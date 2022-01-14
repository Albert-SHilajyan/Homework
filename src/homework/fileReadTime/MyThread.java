package homework.fileReadTime;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {
    public static AtomicInteger countOfKeyWord = new AtomicInteger();
    private List<String> treadList;
    private String keyWord;

     public MyThread(List<String> treadList, String keyWord) {
        this.treadList=treadList;
        this.keyWord=keyWord;
//        super();
        start();
    }

    public void run() {
        for (String s : treadList) {
            if (s.contains(keyWord)) {
                countOfKeyWord.incrementAndGet();
            }
        }
    }


}
