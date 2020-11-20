package model;

/*
1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
вывести на консоль текст, заголовок текста.

 */

import java.util.Scanner;

public class Text {

    String header;
    String sentence = "";
    static String strInput;
    static int numInput;

    Text(Word word) {
        header = word.getValue();
    }

    Text(Sentence sentence) {
        this.sentence = sentence.getValue();
    }

    String getHeader() {
        return header;
    }

    void addSentence(Word word) {
        this.sentence += " " + word.getValue();
    }

    void addSentence(Sentence sentence) {
        this.sentence = " " + sentence.getValue();
    }

    String getSentence() {
        return sentence;
    }

    static String getStrInput() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            strInput = sc.nextLine();
        } else {
            System.out.println("Недопустимый ввод");
            getStrInput();
        }
        return strInput;
    }

    static int getNumInput() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            numInput = sc.nextInt();
        } else {
            System.out.println("Недопустимый ввод");
            getNumInput();
        }
        return numInput;
    }
}
