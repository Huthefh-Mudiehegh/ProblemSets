package com.huthefh;

public class Sentence {
    private String sentence;
    private String reverseResult = "";

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public String reverseWords() throws NullPointerException {

        String[] wordsOfSentence = sentence.split(" ");

        return reverseEachWord(wordsOfSentence);

    }

    private String reverseEachWord(String[] wordsOfSentence) {
        String result = "";
        String word;
        String reversedWord;

        for (int i = 0, n = wordsOfSentence.length; i < n; i++) {
            word = wordsOfSentence[i];
            reversedWord = reverse(word);
            result += reversedWord+" ";
        }
        return result;

    }

    private String reverse(String word) {
        String outPut = "";
        for (int n = word.length() - 1, i = n; i >= 0; i--) {
            outPut += word.charAt(i);
        }
        return outPut;
    }




}
