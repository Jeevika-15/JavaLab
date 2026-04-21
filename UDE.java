//20. To test the range of age of one student. Write a program using user defined exception.

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