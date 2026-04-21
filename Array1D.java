//7. WAP that is having four method for 1-D array. (Input, Output1, out2, reverse).

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