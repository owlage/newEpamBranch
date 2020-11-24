public class Decimal {

    private int count;
    private int min;
    private int max;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public Decimal() {
        min = 0;
        max = 10;
        count = 0;
    }

    public Decimal(int min, int max) {
        this.min = min;
        this.max = max;
        count = min;
    }

    public void low() {
        count--;
        if (count < min) {
            count = max;
        }
    }

    public void increase() {
        count++;
        if (count > max) {
            count = min;
        }
    }
}

