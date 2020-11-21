package program;

import country.City;
import country.Country;
import country.District;
import country.Region;

import java.util.Scanner;

public class Program {

    public static String readStringFromConsole() {
        String str = "";
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            str = scanner.nextLine();
        } else {
            System.out.println("Неверный ввод, повторите попытку");
            readStringFromConsole();
        }
        return str;
    }

    public static double readDoubleFromConsole() {
        double numDouble = 0;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()) {
            numDouble = scanner.nextDouble();
        } else {
            System.out.println("Неверный ввод, повторите попытку");
            readDoubleFromConsole();
        }
        return numDouble;
    }

    public static int readIntFromConsole() {
        int numInt = 0;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            numInt = scanner.nextInt();
        } else {
            System.out.println("Неверный ввод, повторите попытку");
            readIntFromConsole();
        }
        return numInt;
    }


    private void showMenu() {

        System.out.println("Введите название страны и столицу через enter");
        Scanner sc = new Scanner(System.in);
        Country country = new Country(readStringFromConsole(), readStringFromConsole());
        while (true) {
            System.out.println("Выберите команду:\n" +
                    "0 - выход\n" +
                    "1 - заполнить страну областями\n" +
                    "2 - вывести на консоль столицу\n" +
                    "3 - количество областей\n" +
                    "4 - площадь\n" +
                    "5 - областные центры");

            int choice = readIntFromConsole();
            if (choice == 0) {
                break;
            }
            if (choice < 1 || choice > 5) {
                System.out.println("Повторите ввод");
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println("Введите название области и площадь через enter");
                    country.getRegions().add(new Region(readStringFromConsole(), readDoubleFromConsole()));
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
                    for (Region region:country.getRegions()) {
                        for (District district:region.getDistricts()) {
                            for (City city:district.getCities()) {
                                System.out.println(city.getCityName());
                            }
                        }

                    }
            }
        }
    }

    public static void main(String[] args) {
        Program program = new Program();
        program.showMenu();
    }
}
