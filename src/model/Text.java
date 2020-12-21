package model;

/*
1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
вывести на консоль текст, заголовок текста.
 */
public class Text {

    private String header;
    private String body = "";

    public Text(Word word) {
        header = word.getValue();
    }

    public Text(Phrase phrase) {
        header = phrase.getValue();
    }

    public String getHeader() {
        return header;
    }

    public void addBody(Word word) {
        body += " " + word.getValue();
    }

    public void addBody(Phrase phrase) {
        body += " " + phrase.getValue();
    }

    public String getBody() {
        return body;
    }
}
