package country;

import program.Program;

import java.util.ArrayList;
import java.util.List;

public class District {

    private String districtName;
    private List<City> cities;

    public District(String districtName) {
        this.districtName = districtName;
        this.cities = new ArrayList<>();
        System.out.println("Введите название города");
        cities.add(new City(Program.readStringFromConsole()));
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
