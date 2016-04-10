package Package1;

/**
 * Created by Женя on 10.04.2016.
 */
public class NewThread implements Runnable {
    boolean mySuspend;
    String itsName;
    Thread t;

    NewThread(String name) {
        itsName = name;
        mySuspend = false;
        t = new Thread(this, itsName);
        System.out.println("Дочерний поток создан: " + t);
        t.start();
    }

    public void run() {
        try {
            System.out.println("Поток запущен!");
            for (int i = 0; i < 7; i++) {
                if (mySuspend)
                    suspend();
                else {
                    System.out.println("SecondThread is working!");
                    Thread.sleep(2000);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("поток прерван!!!!");
        }
        System.out.println("дочерний поток завершен!!!");
    }

    synchronized void suspend() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("PRoCESS IS STOPPED");

    }

    synchronized void resume() {
        mySuspend = false;
        notify();
    }
}
