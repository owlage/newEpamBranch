package time;

public class Time {

    private int hh;
    private int mm;
    private int sec;

    public int getHh() {
        return hh;
    }

    public void setHh(int hh) {
        this.hh = hh;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public Time(int hh, int mm, int sec) {
        this.hh = hh;
        this.mm = mm;
        this.sec = sec;
    }

    public Time() {
        this(0, 0, 0);
    }

    public void set_hh(int hh) {
        if (hh < 0 || hh > 23) {
            this.hh = 0;
        } else {
            this.hh = hh;
        }
    }

    public void set_mm(int mm) {
        if (mm < 0 || mm > 59) {
            this.mm = 0;
        } else {
            this.mm = mm;
        }
    }

    public void set_ss(int ss) {
        if (ss < 0 || ss > 59) {
            sec = 0;
        } else {
            sec = ss;
        }
    }

    public void print() {
        System.out.println(toString());
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hh, mm, sec);
    }

    public void add_seconds(int ss_) {
        sec += ss_;
        mm += sec / 60;
        sec = sec % 60;
        hh += mm / 60;
        mm = mm % 60;
        hh = hh % 24;
    }

    public void add_minutes(int mm_) {
        add_seconds(mm_ * 60);
    }

    public void add_hours(int hh_) {
        add_seconds(hh_ * 60 * 60);
    }
}
