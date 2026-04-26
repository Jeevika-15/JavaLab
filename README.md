# JavaLab

## Program List

* [Program-1 Addition, Subtraction, Multiplication, Division](#program-1-addition-subtraction-multiplication-division)
* [Program-2 WAP for addition of two distance where each distance is given in m, cm, mm](#program-2-WAP-for-addition-of-two-distance-where-each-distance-is-given-in-m-cm-mm)
* [Program-3 Test the result by creation of object in main class where each distance is given in m,cm](#program-3-Test-the-result-by-creation-of-object-in-main-class-where-each-distance-is-given-in-m-cm)
* [Program-4 Similarly for time given in hours, min and seconds](#program-4-Similarly-for-time-given-in-hours-min-and-seconds)
* [Program-5 Time given in hours and minutes](#program-5-Time-given-in-hours-and-minutes)
* [Program-6 Collect the code from internet for any 5 programs of c language](#program-6-Collect-the-code-from-internet-for-any-5-programs-of-c-language)
* [Program-7 WAP that is having four method for 1-D array](#program-7-WAP-that-is-having-four-method-for-1-D-array)
* [Program-8 WAP with multiple methods to perform matrix operations](#program-8-WAP-with-multiple-methods-to-perform-matrix-operations)
* [Program-9 WAP using three classes to print 1-100 with and without thread and analyse the output and repeat the same program using runnable interface](#program-9-WAP-using-three-classes-to-print-1-100-with-and-without-thread-and-analyse-the-output-and-repeat-the-same-program-using-runnable-interface)
* [Program-10 Using the concept of multithreading the output of all three threads must be synchronised](#program-10-Using-the-concept-of-multithreading-the-output-of-all-three-threads-must-be-synchronised)
* [Program-11 Addition of 2 numbers using swing.](#program-11-Addition-of-2-numbers-using-swing)
* [Program-12 Make a registration form with 10 elements and send the data into database](#program-12-Make-a-registration-form-with-10-elements-and-send-the-data-into-database)
* [Program-13 Make one calculator in swing](#program-13-Make-one-calculator-in-swing)
* [Program-14 Matrix Addition using swing class](#program-14-Matrix-Addition-using-swing-class)
* [Program-15 Create one jframe apply 10 buttons on that after clicking on each button a new structure is created](#program-15-Create-one-jframe-apply-10-buttons-on-that-after-clicking-on-each-button-a-new-structure-is-created)
* [Program-16 Just using mouse event create a frame like paint brush with selection of colour and width](#program-16-Just-using-mouse-event-create-a-frame-like-paint-brush-with-selection-of-colour-and-width)
* [Program-19 Create one small array of size 5 apply array out of bounds exception using try catch give a proper message in catch and demonstrate the exception exactly in the same fashion demonstrate arithmetic exception](#program-19-Create-one-small-array-of-size-5-apply-array-out-of-bounds-exception-using-try-catch-give-a-proper-message-in-catch-and-demonstrate-the-exception-exactly-in-the-same-fashion-demonstrate-arithmetic-exception)
* [Program-20 To test the range of age of one student. Write a program using user defined exception.](#program-20-To-test-the-range-of-age-of-one-student-Write-a-program-using-user-defined-exception.)

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
## Program-2 WAP for addition of two distance where each distance is given in m cm mm

```java
class Distance {
    int m, cm, mm;

    Distance(int m, int cm, int mm) {
        this.m = m;
        this.cm = cm;
        this.mm = mm;
    }

    void add(Distance d2) {
        int totalMM = this.mm + d2.mm;
        int carryCM = totalMM / 10;
        int mm = totalMM % 10;

        int totalCM = this.cm + d2.cm + carryCM;
        int carryM = totalCM / 100;
        int cm = totalCM % 100;

        int m = this.m + d2.m + carryM;

        System.out.println("Total Distance = " + m + "m " + cm + "cm " + mm + "mm");
    }

    public static void main(String[] args) {
        Distance d1 = new Distance(2, 50, 5);
        Distance d2 = new Distance(3, 70, 8);
        d1.add(d2);
    }
}
```
---
##Program-3 Test the result by creation of object in main class where each distance is given in m cm.

```java
public class Distance2 {
    int m, cm;

    Distance2(int m, int cm) {
        this.m = m;
        this.cm = cm;
    }

    void add(Distance2 d) {
        int cmSum = this.cm + d.cm;
        int mCarry = cmSum / 100;
        cmSum = cmSum % 100;

        int mSum = this.m + d.m + mCarry;

        System.out.println("Result = " + mSum + "m " + cmSum + "cm");
    }

    public static void main(String[] args) {
        Distance2 d1 = new Distance2(3, 80);
        Distance2 d2 = new Distance2(2, 40);
        d1.add(d2);
    }
}
```
---
## Program-4 Similarly for time given in hours, min and seconds

```java
public class Time {
    int h, m, s;

    Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    void add(Time t) {
        int sec = this.s + t.s;
        int carryMin = sec / 60;
        sec = sec % 60;

        int min = this.m + t.m + carryMin;
        int carryHr = min / 60;
        min = min % 60;

        int hr = this.h + t.h + carryHr;

        System.out.println("Time = " + hr + ":" + min + ":" + sec);
    }

    public static void main(String[] args) {
        Time t1 = new Time(2, 45, 50);
        Time t2 = new Time(1, 20, 30);
        t1.add(t2);
    }
}
```
---
## Program-5 Time given in hours and minutes.

```java
public class Time2 {
    int h, m;

    Time2(int h, int m) {
        this.h = h;
        this.m = m;
    }

    void add(Time2 t) {
        int min = this.m + t.m;
        int carry = min / 60;
        min = min % 60;

        int hr = this.h + t.h + carry;

        System.out.println("Time = " + hr + ":" + min);
    }

    public static void main(String[] args) {
        Time2 t1 = new Time2(3, 50);
        Time2 t2 = new Time2(2, 30);
        t1.add(t2);
    }
}
```
---
## Program-6 Collect the code from internet for any 5 programs of c language.

```java
//Factorial of a no.
#include <stdio.h>

int main() {
    int n, i;
    long long fact = 1;

    printf("Enter a number: ");
    scanf("%d", &n);

    for(i = 1; i <= n; i++) {
        fact = fact * i;
    }

    printf("Factorial = %lld", fact);

    return 0;
}

//Armstrong number
#include <stdio.h>

int main() {
    int n, temp, rem, sum = 0;

    printf("Enter a number: ");
    scanf("%d", &n);

    temp = n;

    while(temp != 0) {
        rem = temp % 10;
        sum = sum + (rem * rem * rem);
        temp = temp / 10;
    }

    if(sum == n)
        printf("Armstrong number");
    else
        printf("Not an Armstrong number");

    return 0;
}

//Palindrome no.
#include <stdio.h>

int main() {
    int n, rev = 0, rem, temp;

    printf("Enter a number: ");
    scanf("%d", &n);

    temp = n;

    while(n != 0) {
        rem = n % 10;
        rev = rev * 10 + rem;
        n = n / 10;
    }

    if(temp == rev)
        printf("Palindrome number");
    else
        printf("Not a palindrome");

    return 0;
}

//Fibonacci series
#include <stdio.h>

int main() {
    int n, i;
    int a = 0, b = 1, c;

    printf("Enter number of terms: ");
    scanf("%d", &n);

    printf("Fibonacci series:\n");

    for(i = 1; i <= n; i++) {
        printf("%d ", a);
        c = a + b;
        a = b;
        b = c;
    }

    return 0;
}

//Pattern(Triangle)
#include <stdio.h>

int main() {
    int i, j, n;

    printf("Enter number of rows: ");
    scanf("%d", &n);

    for(i = 1; i <= n; i++) {
        for(j = 1; j <= i; j++) {
            printf("* ");
        }
        printf("\n");
    }

    return 0;
}
```
---
## Program-7 WAP that is having four method for 1-D array

```java
import java.util.Scanner;

class Array1D {
    int arr[] = new int[5];

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void output() {
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void reverse() {
        for (int i = 4; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Array1D obj = new Array1D();
        obj.input();
        obj.output();
        obj.reverse();
    }
}
```

---
##Program-8 WAP with multiple methods to perform matrix operations.

```java
public class Matrix {
    int a[][] = {{1,2},{3,4}};
    int b[][] = {{5,6},{7,8}};
    int c[][] = new int[2][2];

    void add() {
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    void transpose() {
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }

    void diagonalSum() {
        int sum = 0;
        for(int i=0;i<2;i++){
            sum += a[i][i];
        }
        System.out.println("Diagonal Sum = " + sum);
    }

    public static void main(String[] args) {
        Matrix obj = new Matrix();
        obj.add();
        obj.transpose();
        obj.diagonalSum();
    }
}
```
---
##Program-10 Using the concept of multithreading the output of all three threads must be synchronised.
```java
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
```
---
## Program-11 Addition of 2 numbers using swing

```java
import javax.swing.*;
import java.awt.event.*;

class AddSwing {
    public static void main(String[] args) {
        JFrame f = new JFrame("Addition");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();

        JButton b = new JButton("Add");

        t1.setBounds(50,50,100,30);
        t2.setBounds(50,100,100,30);
        t3.setBounds(50,150,100,30);
        b.setBounds(50,200,100,30);

        f.add(t1); f.add(t2); f.add(t3); f.add(b);

        b.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b1 = Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(a+b1));
        });

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
```

---
##Program-12 Make a registration form with 10 elements and send the data into database

```java
import java.sql.*;

class DBExample {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test","root","");

            Statement st = con.createStatement();
            st.executeUpdate("insert into student values(1,'ABC')");

            System.out.println("Inserted");

            con.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
```
---

##Program-13 Make one calculator in swing

```java
import javax.swing.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener {
    JTextField t1, t2, t3;
    JButton add, sub, mul, div;

    Calculator() {
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();

        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");

        t1.setBounds(50, 30, 100, 30);
        t2.setBounds(50, 70, 100, 30);
        t3.setBounds(50, 110, 100, 30);

        add.setBounds(30, 160, 50, 30);
        sub.setBounds(90, 160, 50, 30);
        mul.setBounds(30, 200, 50, 30);
        div.setBounds(90, 200, 50, 30);

        add(t1); add(t2); add(t3);
        add(add); add(sub); add(mul); add(div);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setSize(250, 300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int result = 0;

        if (e.getSource() == add)
            result = a + b;
        else if (e.getSource() == sub)
            result = a - b;
        else if (e.getSource() == mul)
            result = a * b;
        else if (e.getSource() == div)
            result = a / b;

        t3.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
```
---
##Program-14 Matrix Addition using swing class.

```java
import javax.swing.*;
import java.awt.event.*;

class MatrixAdd extends JFrame implements ActionListener {
    JTextField a1, a2, a3, a4;
    JTextField b1, b2, b3, b4;
    JTextField r1, r2, r3, r4;
    JButton addBtn;

    MatrixAdd() {
        a1 = new JTextField(); a2 = new JTextField();
        a3 = new JTextField(); a4 = new JTextField();

        b1 = new JTextField(); b2 = new JTextField();
        b3 = new JTextField(); b4 = new JTextField();

        r1 = new JTextField(); r2 = new JTextField();
        r3 = new JTextField(); r4 = new JTextField();

        addBtn = new JButton("Add");

        // Set bounds (Matrix A)
        a1.setBounds(50,50,40,30); a2.setBounds(100,50,40,30);
        a3.setBounds(50,90,40,30); a4.setBounds(100,90,40,30);

        // Matrix B
        b1.setBounds(200,50,40,30); b2.setBounds(250,50,40,30);
        b3.setBounds(200,90,40,30); b4.setBounds(250,90,40,30);

        // Result
        r1.setBounds(350,50,40,30); r2.setBounds(400,50,40,30);
        r3.setBounds(350,90,40,30); r4.setBounds(400,90,40,30);

        addBtn.setBounds(200,150,80,30);

        add(a1); add(a2); add(a3); add(a4);
        add(b1); add(b2); add(b3); add(b4);
        add(r1); add(r2); add(r3); add(r4);
        add(addBtn);

        addBtn.addActionListener(this);

        setSize(500,300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int A[][] = new int[2][2];
        int B[][] = new int[2][2];
        int C[][] = new int[2][2];

        A[0][0] = Integer.parseInt(a1.getText());
        A[0][1] = Integer.parseInt(a2.getText());
        A[1][0] = Integer.parseInt(a3.getText());
        A[1][1] = Integer.parseInt(a4.getText());

        B[0][0] = Integer.parseInt(b1.getText());
        B[0][1] = Integer.parseInt(b2.getText());
        B[1][0] = Integer.parseInt(b3.getText());
        B[1][1] = Integer.parseInt(b4.getText());

        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        r1.setText(String.valueOf(C[0][0]));
        r2.setText(String.valueOf(C[0][1]));
        r3.setText(String.valueOf(C[1][0]));
        r4.setText(String.valueOf(C[1][1]));
    }

    public static void main(String[] args) {
        new MatrixAdd();
    }
}
```
---
##Program-15 Create one jframe apply 10 buttons on that after clicking on each button a new structure is created.

```java
import javax.swing.*;

class Shapes {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        for(int i=1;i<=10;i++){
            JButton b = new JButton("B"+i);
            b.setBounds(50*i,50,60,30);
            f.add(b);
        }

        f.setSize(600,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
```
---
##Program-16 Just using mouse event create a frame like paint brush with selection of colour and width.
```java
import javax.swing.*;
import java.awt.event.*;

class PaintExample extends JFrame implements MouseMotionListener {
    PaintExample() {
        addMouseMotionListener(this);
        setSize(400,400);
        setVisible(true);
    }

    public void mouseDragged(MouseEvent e) {
        getGraphics().fillOval(e.getX(), e.getY(), 5, 5);
    }

    public void mouseMoved(MouseEvent e) {}

    public static void main(String[] args) {
        new PaintExample();
    }
}
```
---
##Program-19 Create one small array of size 5 apply array out of bounds exception using try catch give a proper message in catch and demonstrate the exception exactly in the same fashion demonstrate arithmetic exception.

```java
class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[10] = 50;   // error
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Error");
        }

        try {
            int x = 10/0;
        } catch(ArithmeticException e) {
            System.out.println("Divide by zero error");
        }
    }
}
```
---
##Program-20 To test the range of age of one student. Write a program using user defined exception.

```java
class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}

class UDE {
    static void check(int age) throws AgeException {
        if(age < 18)
            throw new AgeException("Not valid age");
        else
            System.out.println("Valid age");
    }

    public static void main(String[] args) {
        try {
            check(16);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
```
---
