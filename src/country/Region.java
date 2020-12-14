package country;

import java.util.ArrayList;
import java.util.List;
import util.Util;

public class Region {
    private String regionName;
    private double square;
    private List<District> districts;
    final Util util = new Util();

    public Region(String regionName, double square) {
        this.regionName = regionName;
        this.square = square;
        this.districts = new ArrayList<>();
        System.out.println("Введите название района");
        districts.add(new District(util.readStringFromConsole()));
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

}
