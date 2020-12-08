package model;

/*
1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
вывести на консоль текст, заголовок текста.

 */

import java.util.*;

public class Text {

    private String header;
    private List<Sentence> sentence;

    public Text(String header) {
        this.header = header;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public List<Sentence> getSentence() {
        return sentence;
    }

    public void setSentence(List<Sentence> sentence) {
        this.sentence = sentence;
    }

    public void addSentences(List<Sentence> sentences) {
        this.sentence.addAll(sentences);
    }

    public void addSentences(Sentence sentences) {
        this.sentence.add(sentences);
    }


}
