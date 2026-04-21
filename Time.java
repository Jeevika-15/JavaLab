//4. Similarly for time given in hours, min and seconds.

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