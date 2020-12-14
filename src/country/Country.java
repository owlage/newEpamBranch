package country;

/*
 Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль столицу,
 количество областей, площадь, областные центры.
 */

import java.util.ArrayList;
import java.util.List;

public class Country {
    private String countryName;
    private String capitalName;
    private List<Region> regions;

    public Country(String countryName, String capitalName) {
        this.countryName = countryName;
        this.capitalName = capitalName;
        this.regions = new ArrayList<>();
    }

    public double squareSum() {
        double sum = 0;
        for (Region region : regions) {
            sum += region.getSquare();
        }
        return sum;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

}
