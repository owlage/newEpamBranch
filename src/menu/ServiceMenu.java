package menu;

import treasure.TreasureAction;
import util.Util;

import java.util.InputMismatchException;

public class ServiceMenu {

    private Util util = new Util();

    public int menu() {
        System.out.println("Выберите операцию:\n" +
                "1 - Показать все сокровища;\n" +
                "2 - Показать самое дорогое сокровище;\n" +
                "3 - Показать сокровища на заданную сумму;\n" +
                "0 - Выход.");
        while (true) {
            int choice = util.readNumberConsole();
            if (choice < 0 || choice > 3) {
                continue;
            } else {
                return choice;
            }
        }
    }

    public void programExecution(int choice) {
        TreasureAction treasureAction = new TreasureAction();
        switch (choice) {
            case 1:
                System.out.println("Список сокровищ в пещере:");
                treasureAction.showAllTreasure();
                break;
            case 2:
                System.out.println("Самое дорогое сокровище:");
                treasureAction.chooseMostExpensive();
                break;
            case 3:
                int[] valueRange = new int[2];
                boolean isValid = false;
                while (!isValid) {
                    System.out.println("Введите желаемый диапазон ценности сокровища через пробел.");
                    try {
                        valueRange[0] = util.readNumberConsole();
                        valueRange[1] = util.readNumberConsole();
                        isValid = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Неправильный ввод. Попробуй еще раз.");
                    }
                }
                System.out.println(String.format("Стоимость сокровищ от %d до %d:", valueRange[0], valueRange[1]));
                treasureAction.selectForGivenAmount(valueRange);
                break;
        }
    }
}
