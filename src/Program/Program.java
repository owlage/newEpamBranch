package Program;

import directory.Directory;
import directory.File;
import directory.TextFile;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Directory directory = new Directory("DIR");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операцию:\n" +
                "1 - Создать текстовый файл\n" +
                "2 - Переименовать текстовый файл\n" +
                "3 - Вывести на консоль содержимое\n" +
                "4 - Дополнить\n" +
                "5 - Удалить текстовый файл");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
        }
    }
}
