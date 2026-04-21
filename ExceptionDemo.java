//19. Create one small array of size 5 apply array out of bounds exception using try catch give a proper message in catch and demonstrate the exception exactly in the same fashion demonstrate arithmetic exception.

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