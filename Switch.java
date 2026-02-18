import java.util.Scanner;
public class Switch{
     public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        switch(a){
        case 1:
           System.out.println("Number is 1");
           break;
        case 2:
           System.out.println("Number is 2");
           break;
        case 3:
           System.out.println("Number is 3");
           break;
        default:
           System.out.println("Invalid number");
         }
     }
 }