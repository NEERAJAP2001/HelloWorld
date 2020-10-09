class MyThread implements Runnable {
    private SimpleSyncThread sync;
    private String s;

    public MyThread(SimpleSyncThread sync, String s) {
        this.sync = sync;
        this.s = s;
    }

    public static void pause(long time) {
        try {Thread.sleep(time); }
        catch (InterruptedException e) {Thread.currentThread().interrupt();}
    }

    @Override
    public void run() {
        synchronized (sync) {
            for (int i = 0; i < 10; i++) {
                sync.print(s);
            }
        }
    }
}

public class SimpleSyncThread {

    public void print(String s) {
        System.out.println(s);
        MyThread.pause(200);
    }

    public static void main(String[] args) {
        SimpleSyncThread sync = new SimpleSyncThread();
        MyThread st1 = new MyThread(sync, "Hello");
        MyThread st2 = new MyThread(sync, "World");

        Thread t1 = new Thread(st1);
        Thread t2 = new Thread(st2);

        t1.start();
        t2.start();
    }
}
