package service;

import java.util.*;

public class MenuService {

    public int showMenuAndMakeChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите команду:\n" +
                "1 - для сортировки абзацев по количеству предложений\n" +
                "2 - для сортировки предложений по длинным слова\n" +
                "3 - для сортировки лексема по возрастанию");
        while (true) {
            int choice = scanner.nextInt();
            if (choice < 1 || choice > 3) {
                System.out.println("Выберите команду");
                continue;
            }
            return choice;
        }
    }
}
