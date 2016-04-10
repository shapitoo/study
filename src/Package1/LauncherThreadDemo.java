package Package1;

/**
 * Created by Женя on 10.04.2016.
 */
public class LauncherThreadDemo {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();
        System.out.println("Thread: " + t);
        t.setName("MainThread");
        System.out.println("Thread: " + t);
        NewThread thread1 = new NewThread("ДОЧЕРНИЙ ПОТОК");
        thread1.mySuspend=true;
        System.out.println("RETURN IT, PLEASE!!!!!");
        thread1.resume();

        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("MainTread is working...");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Error! Tread is interrupting!");
        }
        thread1.suspend();
        System.out.println("RETURN IT, PLEASE!!!!!");
        thread1.resume();
        // System.out.println("Главный поток завершен!");
    }
}
