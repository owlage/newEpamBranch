package service;

import text.*;

import java.util.*;
import java.util.regex.*;

public class TextService {

    public void sortParagraphs(String text) {
        String[] paragraphs = text.split("\n");
        int[] counterSentences = new int[paragraphs.length];
        int maxLengthParagraph = 0;
        for (int i = 0; i < paragraphs.length; i++) {
            String[] sentences = splitSentences(paragraphs[i]);
            counterSentences[i] = sentences.length;
            if (maxLengthParagraph < sentences.length) {
                maxLengthParagraph = sentences.length;
            }
        }
        for (int i = 1; i <= maxLengthParagraph; i++) {
            for (int j = 0; j < counterSentences.length; j++) {
                if (i == counterSentences[j]) {
                    System.out.println(paragraphs[j]);
                }
            }
        }
        System.out.println();
    }

    public void sortWords(String text) {
        String[] paragraphs = text.split("\n");
        for (String paragraph : paragraphs) {
            String[] sentences = splitSentences(paragraph);
            for (String sentence : sentences) {
                String[] words = splitWords(sentence);

                for (int k = words.length - 1; k >= 0; k--) {
                    for (int m = 0; m < k; m++) {
                        if (words[m].length() > words[m + 1].length()) {
                            String tmp = words[m];
                            words[m] = words[m + 1];
                            words[m + 1] = tmp;
                        }
                    }
                }

                for (String word : words) {
                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void sortLexemes(Text text) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите символ для сортировки лексем по размеру: ");
        String letter = scanner.nextLine();
        String[] paragraphs = text.getValue().split("\n");
        for (String paragraph : paragraphs) {
            String[] sentences = splitSentences(paragraph);
            for (String sentence : sentences) {
                String[] words = splitWords(sentence);

                for (int k = words.length - 1; k >= 0; k--) {
                    for (int m = 0; m < k; m++) {
                        int countRight = 0;
                        int countLeft = 0;
                        for (int n = 0; n < words[m].length(); n++) {
                            if (String.valueOf(words[m].charAt(n)).compareToIgnoreCase(letter) == 0) {
                                countLeft++;
                            }
                        }
                        for (int n = 0; n < words[m + 1].length(); n++) {
                            if (String.valueOf(words[m + 1].charAt(n)).compareToIgnoreCase(letter) == 0) {
                                countRight++;
                            }
                        }
                        if (countLeft < countRight) {
                            String tmp = words[m];
                            words[m] = words[m + 1];
                            words[m + 1] = tmp;
                        } else if (countLeft == countRight) {
                            String[] forCompare = {words[m], words[m + 1]};
                            Arrays.sort(forCompare);
                            words[m] = forCompare[0];
                            words[m + 1] = forCompare[1];
                        }
                    }
                }
                for (String word : words) {
                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private String[] splitSentences(String text) {
        Pattern pattern = Pattern.compile("\\.*[.!?]\\s*");
        return pattern.split(text);
    }

    private String[] splitWords(String sentence) {
        Pattern pattern = Pattern.compile("\\s*(\\s|,|;|:)\\s*");
        return pattern.split(sentence);
    }

}
