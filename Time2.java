//5. Time given in hours and minutes.

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