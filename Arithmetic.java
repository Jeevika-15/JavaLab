//1. WAP for addition, subtraction, multiplication, division using object and classes.

public class Arithmetic {
    int a, b;

    Arithmetic(int x, int y) {
        a = x;
        b = y;
    }

    void add() {
        System.out.println("Addition = " + (a + b));
    }

    void sub() {
        System.out.println("Subtraction = " + (a - b));
    }

    void mul() {
        System.out.println("Multiplication = " + (a * b));
    }

    void div() {
        System.out.println("Division = " + (a / b));
    }

    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic(10, 5);
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
    }
}
