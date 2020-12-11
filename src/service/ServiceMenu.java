package service;

import model.Phrase;
import model.Text;
import model.Word;
import util.Util;

public class ServiceMenu {

    private Util util = new Util();
    private Word word = new Word(addHeaderText());
    private Text text = new Text(word);

    public int menu() {
        System.out.println("Выберите дейстивие:\n" +
                "1 - дополнить текст\n" +
                "2 - вывести заголовок текста\n" +
                "3 - вывести текст\n" +
                "0 - выход");
        while (true) {
            int num = util.readingNumberFromTheKeyboard();
            if (num < 0 && num > 3) {
                continue;
            }
            return num;
        }
    }

    public void commandExecution(int num) {
        switch (num) {
            case 1:
                Phrase phrase = new Phrase();
                System.out.println("Введите текст");
                phrase.addValue(new Word(util.readingStringFromTheKeyboard()));
                text.addBody(phrase);
                break;
            case 2:
                System.out.println("\n" + text.getHeader() + "\n");
                break;
            case 3:
                System.out.println(text.getBody());
        }
    }

    private String addHeaderText(){
        System.out.println("Введите заголовок текста");
        return util.readingStringFromTheKeyboard();
    }
}
