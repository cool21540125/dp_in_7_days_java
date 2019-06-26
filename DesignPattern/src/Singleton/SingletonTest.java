package Singleton;

public class SingletonTest extends Thread {
    String myId;

    public SingletonTest(String id) {
        myId = id;
    }

    public void run() {
        Singleton singleton = Singleton.getInstance();
        if (singleton != null) {
            System.out.println(myId + "產生 Singleton: " + singleton.hashCode());
        }
    }

    public static void main(String[] argv) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("s1: " + s1.hashCode() + " s2:" + s2.hashCode());
        System.out.println();

        Thread t1 = new SingletonTest("執行緒T1");
        Thread t2 = new SingletonTest("執行續T2");

        t1.start();
        t2.start();
    }
}
