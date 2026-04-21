//3. Similarly, test the result by creation of object in main class where each distance is given in m,cm.

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