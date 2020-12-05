package program;

import model.Sentence;
import model.Text;
import model.Word;

public class Program {

    public static void main(String[] args) {
        Util util = new Util();
        System.out.println("Введите заголовок текста");
        String str = util.getStrInput();
        Word word = new Word(str);
        Sentence sentence = new Sentence();
        Text text = new Text(word);
        while (true) {
            System.out.println("Выберите дейстивие:\n" +
                    "1 - дополнить текст\n" +
                    "2 - вывести заголовок текста\n" +
                    "3 - вывести текст\n" +
                    "0 - выход");
            int num = util.getNumInput();
            if (num == 0) {
                break;
            }
            if (num < 1 && num > 3) {
                System.out.println("Выберите команду");
                continue;
            }
            switch (num) {
                case 1:
                    System.out.println("Введите текст");
                    sentence.addValue(new Word(util.getStrInput()));
                    text.addSentence(sentence);
                    break;
                case 2:
                    System.out.println("\n" + text.getHeader() + "\n");
                    break;
                case 3:
                    System.out.println("\n" + text.getSentence() + "\n");
            }
        }
    }
}
