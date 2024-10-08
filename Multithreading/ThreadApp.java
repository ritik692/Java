// threadX.join() -> Calling Thread's execeution is stopped until ThreadX has completed its execution
// and joined the Calling Thread


package Multithreading;

public class ThreadApp {
    public static void main(String[] args) throws InterruptedException {

        // Thread.currentThread().join();  -> Deadlock

        MyThread thread0 = new MyThread();
        MyThread thread1 = new MyThread();

//        thread0.join(); -> join called before start

//        It means thread was not present in Thread Pool Executor, thus "main" thread
//        execution would not get affected
//        If it was present in TPE, then "main" execution would have stopped until "thread0"
//        goes into Terminated state

        thread0.start();
        thread1.start();



        for(int i=1;i<=10;i++)
        {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }


    }
}
