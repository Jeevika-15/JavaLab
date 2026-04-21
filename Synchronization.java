//10. Using the concept of multithreading the output of all three threads must be synchronised(use join method).

class MyThread extends Thread {
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println(i);
        }
    }
}

class Synchronization {
    public static void main(String[] args) throws Exception {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t1.join();   

        t2.start();
    }
}