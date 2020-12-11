package country;

import program.Program;
import util.Util;

import java.util.ArrayList;
import java.util.List;

public class District {

    private String districtName;
    private List<City> cities;
    final Util util = new Util();

    public District(String districtName) {
        this.districtName = districtName;
        this.cities = new ArrayList<>();
        System.out.println("Введите название города");
        cities.add(new City(util.readStringFromConsole()));
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
