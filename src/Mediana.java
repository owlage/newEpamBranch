public class Mediana {

    private double x, y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    Mediana(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Mediana point) {
        double temp = Math.pow(point.getX() - x, 2);
        temp += Math.pow(point.getY() - y, 2);
        return Math.sqrt(temp);
    }
}
