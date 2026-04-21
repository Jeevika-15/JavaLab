//2. WAP for addition of two distance where each distance is given in m, cm, mm.

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