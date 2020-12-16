package client;

import builder.CandyPresentBuilder;
import builder.PresentDirector;
import customer.Customer;
import sweets.Candy;
import sweets.CandyType;
import sweets.Present;
import sweets.Product;
import wrap.Wrap;
import wrap.WrapType;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Client {

    private static Scanner scanner = new Scanner(System.in);
    private static Customer customer = new Customer();

    public void run() {
        System.out.println("Добрый день! Как я могу называть тебя?");
        customer.setName(checkInputName());

        PresentDirector presentDirector = new PresentDirector();
        presentDirector.setPresentBuilder(new CandyPresentBuilder());
        System.out.println(customer.getName() + ", Кому вы хотите сделать подарок?");
        customer.setPresent(presentDirector.buildPresent());
        customer.getPresent().setProducts(fillProducts());

        System.out.println("Ваш подарок для " + customer.getPresent().getName() + " готов!");
        printPresent(customer.getPresent());
    }


    public static String checkInputName() {
        Pattern pattern = Pattern.compile("[\\D\\w ]{2,30}");
        scanner.useDelimiter("[\r\n]");
        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
            System.out.println("Неправильный ввод. Убедитесь, что имя состоит от 2 до 30 символов.");
        }
        return scanner.nextLine();
    }

    public static double checkInputPrice() {
        Pattern pattern = Pattern.compile("[\\d ]{1,5}");
        scanner.useDelimiter("[\r\n]");
        while (true) {
            while (!scanner.hasNext(pattern)) {
                scanner.nextLine();
                System.out.println("Стоимость товара может быть от 5 до 10000");
            }
            double input = scanner.nextDouble();
            if (input >= 5 && input <= 10000) {
                return input;
            } else {
                System.out.println("Стоимость товара может быть от 5 до 10000");
            }
        }
    }

    public static Wrap chooseWrap() {
        System.out.println(customer.getName() + ", Вы можете выбрать один из видов обертывания:");
        System.out.println(String.format("1. Cardboard box (price: %.2f);\n2. Metal Box (price: %.2f);\n" +
                        "3. Foil Pouch (price: %.2f);\n4. Plastic Bag (price: %.2f).",
                WrapType.CARDBOARD_BOX.getPrice(), WrapType.METAL_BOX.getPrice(),
                WrapType.FOIL_POUCHES.getPrice(), WrapType.PLASTIC_BAG.getPrice()));
        System.out.println("Введите номер варианта упаковки");
        int option = checkInputOption();
        Wrap wrap = null;
        switch (option) {
            case 1: wrap = new Wrap(WrapType.CARDBOARD_BOX);
                break;
            case 2: wrap = new Wrap(WrapType.METAL_BOX);
                break;
            case 3: wrap = new Wrap(WrapType.FOIL_POUCHES);
                break;
            case 4: return new Wrap(WrapType.PLASTIC_BAG);
        }
        return wrap;
    }

    private static int checkInputOption() {
        Pattern pattern = Pattern.compile("[1-4]");
        scanner.useDelimiter("[\r\n]");
        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
            System.out.println("Неправильный ввод. Введите 1, 2, 3 или 4");
        }
        return scanner.nextInt();
    }

    private static List<Product> fillProducts() {
        List<Product> products;
        products = randomFill();
        return products;
    }

    private static List<Product> randomFill() {
        List<Product> productsList = readCandyFile();
        List<Product> candyForPresent = new ArrayList<>();
        int presentsWeight = 0;
        double minPrice = 0.99;
        Random random = new Random();

        double restOfMoney = customer.getPresent().getPrice() - customer.getPresent().getWrap().getPrice();
        while (restOfMoney > 0) {
            Product candy = productsList.get(random.nextInt(productsList.size()));
            double candyPrice = candy.getPrice();
            int candyWeight = candy.getWeight();

            if (restOfMoney - candyPrice > 0) {
                candyForPresent.add(candy);
                presentsWeight += candyWeight;
                restOfMoney -= candyPrice;
            } else if (minPrice > restOfMoney) {
                break;
            }
        }
        customer.getPresent().setPrice(customer.getPresent().getPrice() - restOfMoney);
        customer.getPresent().setWeight(presentsWeight);
        return candyForPresent;
    }

    private static List<Product> readCandyFile() {
        List<Product> candies = new ArrayList<>();
        String filePath = "src/resources/candies.txt";
        try {
            FileReader fileReader = new FileReader(filePath);
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                String[] productLine = scanner.nextLine().split(" - ");
                try {
                    String productName = productLine[0];
                    int weight = Integer.parseInt(productLine[1]);
                    double price = Double.parseDouble(productLine[2]);
                    CandyType candyType;
                    switch (productLine[3]) {
                        case "Caramel": candyType = CandyType.CARAMEL;
                            break;
                        case  "Chocolate": candyType = CandyType.CHOCOLATE;
                            break;
                        case "Gummies": candyType = CandyType.GUMMIES;
                            break;
                        case "Licorice": candyType = CandyType.LICORICE;
                        default: candyType = CandyType.CARAMEL;
                    }
                    candies.add(new Candy(productName, weight, price, candyType));
                } catch (NullPointerException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл с информацией о товарах не найден.");
        }
        return candies;
    }

    private void printPresent(Present present) {
        System.out.println(present);
    }
}
