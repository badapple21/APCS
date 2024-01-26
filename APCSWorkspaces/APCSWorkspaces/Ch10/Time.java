public class Time {
    private int hours;
    private int mins;

    public Time(int h, int m) {
        if (!(h <= 24 && h >= 0 && m >= 0 && m < 60)) {
            throw new IllegalArgumentException(
                    "Not Valid time!! " + m + ", " + h);
        }
        hours = h;
        mins = m;
    }

    private int toMins() {
        return hours * 60 + mins;
    }

    public boolean lessThan(Time t) {
        int t1 = this.toMins();
        int t2 = t.toMins();
        return this.toMins() < t.toMins();
    }

    public int elapsedSince(Time t) {
        int t1 = this.toMins();
        int t2 = t.toMins();
        if (t2 > t1) {
            t1 += 1440;
        }
        return t1 - t2;
    }

    public String toString() {
        return "" + hours + ":" + mins;
    }

    public static void main(String[] args) {
        Time t1 = new Time(22, 45);
        Time t2 = new Time(8, 30);

        System.out.println(t2.lessThan(t1));
    }

}
