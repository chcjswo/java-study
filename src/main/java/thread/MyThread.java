package thread;

/**
 * Created by chcjswo on 2020-02-29
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
public class MyThread {
    static long startTime = 0;

    public static void main(String[] args) {
        //        Thread_Test_01 t1 = new Thread_Test_01();
        //        Thread t2 = new Thread(new Thread_Test_02());
        //
        //        t1.start();
        //        t2.start();
        //        Thread_Test_03 t3 = new Thread_Test_03();
        //        t3.start();
        //
        //        for (int i = 0; i < 300; i++) {
        //            System.out.printf("%s", "=");
        //        }
        //        System.out.print("소요시간1: " + (System.currentTimeMillis() - MyThread.startTime));

        Thread_04 t4 = new Thread_04();
        Thread_05 t5 = new Thread_05();

        //        t5.setPriority(Thread.MAX_PRIORITY);

        System.out.println("h4 priority: " + t4.getPriority());
        System.out.println("h5 priority: " + t5.getPriority());
        t4.start();
        t5.start();
        startTime = System.currentTimeMillis();
        try {
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("소요시간: " + (System.currentTimeMillis() - startTime));
    }
}

class Thread_Test_01 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + ": " + (i + 1));
        }
    }
}

class Thread_Test_02 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + (i + 1));
        }
    }
}

class Thread_Test_03 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", "|");
        }
        System.out.print("소요시간2: " + (System.currentTimeMillis() - MyThread.startTime));
    }
}

class Thread_04 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("=");
            //            try {
            //                Thread.sleep(500);
            //            } catch (InterruptedException e) {
            //                e.printStackTrace();
            //            }
        }
    }
}

class Thread_05 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
            //            try {
            //                Thread.sleep(500);
            //            } catch (InterruptedException e) {
            //                e.printStackTrace();
            //            }
        }
    }
}
