public class Calci {
    public static int add(int a, int b){
      return a+b;
    }
   
    public static int subtract(int a, int b){
      return a-b;
    }

    public static int multiply(int a, int b){
      return a*b;
    }

    public static int division(int a, int b){
      return a/b;
    }

    public static void main(String[] args){
       int num1 = Integer.parseInt(args[0]);
       int num2 = Integer.parseInt(args[1]);

       System.out.println("Addition: " +add(num1,num2));
       System.out.println("Subtraction: " +subtract(num1,num2));
       System.out.println("Multiplication: " +multiply(num1,num2));
       System.out.println("Division: " +division(num1,num2));
}
}