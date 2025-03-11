public class RunnableThreads implements Runnable{

    public static void main(String[] args){
        RunnableThreads runnableThreads = new RunnableThreads(); //create a runnable thread
        Thread thread1 = new Thread(runnableThreads); //create a thread
        Thread thread2 = new Thread(runnableThreads);
        thread1.start();
        thread2.start();

    }

    @Override
    public void run() {
        System.out.println("Hello from thread using runnable method" + Thread.currentThread().getName());
    }
}
