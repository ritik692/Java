package Multithreading;

public class MyThread extends Thread {
    public void run()
    {
        for(int i=1;i<=10;i++)
        {

            // Thread Class
            // public static Thread currentThread()
            // public final String thread.getName() -> method

            // Thread.sleep(x) : executing thread will go to sleep until 'x' ms.


            System.out.println(Thread.currentThread().getName() + " " + i);
//            try {
//                Thread.sleep(250);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }

        }
    }
}
