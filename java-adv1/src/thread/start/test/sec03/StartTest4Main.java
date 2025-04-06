package thread.start.test.sec03;


import static util.MyLogger.log;

public class StartTest4Main {

    public static void main(String[] args) {
        createThread("Thread-A", "A", 1000);
        createThread("Thread-B", "B", 500);
    }

    public static void createThread(String threadName, String threadType, int sleepTime) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    log(threadType);
                    try {
                        Thread.sleep(sleepTime);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }, threadName);

        thread.start();
    }
}