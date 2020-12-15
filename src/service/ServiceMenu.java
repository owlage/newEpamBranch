package service;

import directory.Directory;
import directory.TextFile;
import util.Util;

public class ServiceMenu {

    private Util util = new Util();
    private Directory directory = new Directory("DIR");

    public int menu() {
        System.out.println("Введите операцию:\n" +
                "1 - Создать текстовый файл\n" +
                "2 - Переименовать текстовый файл\n" +
                "3 - Вывести на консоль содержимое\n" +
                "4 - Дополнить\n" +
                "5 - Удалить текстовый файл");
        int choice = util.readNumberConsole();
        while (true) {
            if (choice < 0 || choice > 5){
                continue;
            } else {
                return choice;
            }
        }
    }

    public void programExecution(int choice){
        int i = 0;
        switch (choice) {
            case 1:
                System.out.println("Введите имя текстового файла и через enter введите содержимое файла");
                directory.getFileList().get(0).getTextFileList().add(new TextFile(util.readStrConsole(),
                        util.readStrConsole()));
                break;
            case 2:
                System.out.println("Введите номер текстового файла имя которого хотите изменить");
                directory.getFileList().get(0).showTextFile();
                i = util.readNumberConsole();
                if (i < directory.getFileList().get(0).getTextFileList().size()) {
                    System.out.println("Введите новое имя тестового файла");
                    directory.getFileList().get(0).getTextFileList().get(i).setNameFile(util.readStrConsole());
                    break;
                } else {
                    System.out.println("Обькта под таким номером несуществует!");
                    break;
                }
            case 3:
                System.out.println("Введите номер текстового файла для вывода на консоль содержимого");
                directory.getFileList().get(0).showTextFile();
                i = util.readNumberConsole();
                if (i < directory.getFileList().get(0).getTextFileList().size()) {
                    System.out.println(directory.getFileList().get(0).getTextFileList().get(i).getText());
                    break;
                } else {
                    System.out.println("Обькта под таким номером несуществует!");
                    break;
                }
            case 4:
                System.out.println("Введите номер текстового файла для дополнения содержимого");
                directory.getFileList().get(0).showTextFile();
                i = util.readNumberConsole();
                if (i < directory.getFileList().get(0).getTextFileList().size()) {
                    System.out.println("Содержимое файла:");
                    System.out.println(directory.getFileList().get(0).getTextFileList().get(i).getText());
                    System.out.println("Введите текст:");
                    directory.getFileList().get(0).getTextFileList().get(i).setText(util.readStrConsole());
                    break;
                } else {
                    System.out.println("Обькта под таким номером несуществует!");
                    break;
                }
            case 5:
                System.out.println("Введите номер текстового файла для удаления");
                directory.getFileList().get(0).showTextFile();
                i = util.readNumberConsole();
                if (i < directory.getFileList().get(0).getTextFileList().size()) {
                    directory.getFileList().get(0).getTextFileList().remove(i);
                    break;
                } else {
                    System.out.println("Обькта под таким номером несуществует!");
                    break;
                }
        }
    }
}
