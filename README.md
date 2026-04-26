# JavaLab

## Program List

* [Program-1 Addition, Subtraction, Multiplication, Division](#program-1-addition-subtraction-multiplication-division)
* [Program-2 Hello World](#program-2-wap-to-demonstrate-hello-world)
* [Program-3 Distance Addition](#program-3-addition-of-distance)
* [Program-4 Time Addition](#program-4-time-addition)

# JavaLab

## Program-1 Addition, Subtraction, Multiplication, Division

```java
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
```

---

## Program-2 WAP TO DEMONSTRATE HELLO WORLD

```java
class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

---

## Program-3 Addition of Distance

```java
// your code here
```


