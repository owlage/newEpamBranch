package model;

/*
1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
вывести на консоль текст, заголовок текста.

 */



public class Text {

    private String header;
    private String sentence = "";

    public Text(Word word) {
        header = word.getValue();
    }

    Text(Sentence sentence) {
        this.sentence = sentence.getValue();
    }

    public String getHeader() {
        return header;
    }

    public void addSentence(Word word) {
        this.sentence += " " + word.getValue();
    }

    public void addSentence(Sentence sentence) {
        this.sentence = " " + sentence.getValue();
    }

    public String getSentence() {
        return sentence;
    }
}
