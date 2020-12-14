package ServiceMenu;

import country.City;
import country.Country;
import country.District;
import country.Region;
import util.Util;

public class Menu {

    private Util util = new Util();
    private Country country = new Country(addCountryName(), addCapital());

    public int menu() {
        System.out.println("Выберите команду:\n" +
                "0 - выход\n" +
                "1 - заполнить страну областями\n" +
                "2 - вывести на консоль столицу\n" +
                "3 - количество областей\n" +
                "4 - площадь\n" +
                "5 - областные центры");
        while (true) {
            int choice = util.readIntFromConsole();
            if (choice < 0 || choice > 5) {
                System.out.println("Повторите ввод");
                continue;
            }
            return choice;
        }
    }

    public void commandExecution(int choice){
        switch (choice) {
            case 1:
                System.out.println("Введите название области и площадь через enter");
                country.getRegions().add(new Region(util.readStringFromConsole(), util.readDoubleFromConsole()));
                break;
            case 2:
                System.out.println("Страна: " + country.getCountryName());
                System.out.println("Столица: " + country.getCapitalName());
                break;
            case 3:
                System.out.println("Кол - во областей: " + country.getRegions().size());
                break;
            case 4:
                System.out.println("Площадь всех областей: " + country.squareSum());
                break;
            case 5:
                System.out.println("Областные центры");
                for (Region region : country.getRegions()) {
                    for (District district : region.getDistricts()) {
                        for (City city : district.getCities()) {
                            System.out.println(city.getCityName());
                        }
                    }

                }
        }
    }

    public String addCountryName(){
        System.out.println("Введите название страны ");
        return util.readStringFromConsole();
    }

    public String addCapital(){
        System.out.println("Введите название страны");
        return util.readStringFromConsole();
    }


}
