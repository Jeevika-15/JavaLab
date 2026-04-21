//8. WAP with multiple methods to perform matrix operations (transpose, addition, sum of rows, sum of columns, sum of diagonal).

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