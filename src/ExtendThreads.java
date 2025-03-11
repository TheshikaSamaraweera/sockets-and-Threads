public class ExtendThreads extends Thread{

    //this extends Thread class implement using runnable class.so that without @override run method also works properly

    public static void main(String[] args) throws InterruptedException {

        ExtendThreads thread1 = new ExtendThreads();
        ExtendThreads thread2 = new ExtendThreads();
        thread1.start();
        sleep(5000); //give waiting time 5 seconds for thread2
        thread2.start();

    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000); //sleep for 1 second to start all threads
            System.out.println("hello from extend thread "+ Thread.currentThread().getName() + System.currentTimeMillis());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
