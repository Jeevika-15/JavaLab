//9. WAP using three classes to print 1-100 with and without thread and analyse the output and repeat the same program using runnable interface.

//without thread
class A {
    void print() {
        for(int i=1;i<=100;i++)
            System.out.println("A: " + i);
    }
}

class B {
    void print() {
        for(int i=1;i<=100;i++)
            System.out.println("B: " + i);
    }
}

class C {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.print();
        b.print();
    }
}