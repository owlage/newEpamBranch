package model;

import java.util.*;

public class Sentence {
    private List<Word> words;

    public Sentence() {

    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }


    public void addWords(Word word) {
        this.words.add(word);
    }

    public void addWords(List<Word> word) {
        this.words.addAll(word);
    }
}


