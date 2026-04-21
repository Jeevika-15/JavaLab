//9. WAP using three classes to print 1-100 with and without thread and analyse the output and repeat the same program using runnable interface.

//runnable
class A implements Runnable {
    public void run() {
        for(int i=1;i<=100;i++)
            System.out.println("A: " + i);
    }
}

class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new A());
        Thread t3 = new Thread(new A());

        t1.start();
        t2.start();
        t3.start();
    }
}