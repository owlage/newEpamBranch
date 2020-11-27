package vouchers;

public class DescriptionVouchers implements Comparable<DescriptionVouchers>{

    private String transport;
    private boolean food;
    private int numbersOfDay;

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public int getNumbersOfDay() {
        return numbersOfDay;
    }

    public void setNumbersOfDay(int numbersOfDay) {
        this.numbersOfDay = numbersOfDay;
    }

    public DescriptionVouchers(String transport, boolean food, int numbersOfDay) {
        this.transport = transport;
        this.food = food;
        this.numbersOfDay = numbersOfDay;
    }

    public String toString(){
        return "Transport: " + getTransport()+ "| Food: " + isFood() + "| Num of day: " + getNumbersOfDay();
    }

    @Override
    public int compareTo(DescriptionVouchers o) {
        return this.transport.compareTo(o.getTransport());
    }
}
