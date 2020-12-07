package Program;

import directory.Directory;
import directory.TextFile;

public class Program {

    public void showMenu(){
        Directory directory = new Directory("DIR");
        Util util = new Util();
        int i = 0;
        while (true) {
            System.out.println("Введите операцию:\n" +
                    "1 - Создать текстовый файл\n" +
                    "2 - Переименовать текстовый файл\n" +
                    "3 - Вывести на консоль содержимое\n" +
                    "4 - Дополнить\n" +
                    "5 - Удалить текстовый файл");
            int choice = util.readNumberConsole();
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
                        directory.getFileList().get(0).getTextFileList().get(i).setNameTextFile(util.readStrConsole());
                        break;
                    } else {
                        System.out.println("Обькта под таким номером несуществует!");
                        continue;
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
                        continue;
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
                        continue;
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
                        continue;
                    }
            }
        }
    }

    public static void main(String[] args) {
        Program program = new Program();
        program.showMenu();
    }
}
