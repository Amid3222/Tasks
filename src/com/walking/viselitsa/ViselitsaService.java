package com.walking.viselitsa;

import java.util.Random;

public class ViselitsaService {
    private Random random = new Random();
    private ViselitsaRepository VRep = new ViselitsaRepository();
    private String character;
    public String word;
    private String linesWord;

    private void setRandomWord() {
        int randValue = random.nextInt(VRep.words.length);
        String word = VRep.words[randValue];
        this.word = word;

    }

    private String getWord() {
        return word;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    private String getCharacter() {
        return character;
    }

    public String viewLines() {
        return linesWord;
    }

    public String createLines() {
        setRandomWord();
        StringBuilder wordLines = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            wordLines.append("-");
        }
        return this.linesWord = String.valueOf(wordLines);

    }

    private boolean charChecker() {
        return getWord().contains(getCharacter());
    }


    public void checkWordChar() {
        StringBuilder stringWord = new StringBuilder(getWord());
        StringBuilder stringLines = new StringBuilder(viewLines());
        for (int i = 0; i < stringWord.length(); i++) {
            if (stringWord.charAt(i) == getCharacter().charAt(0)) {
                stringLines.replace(i, i+1, getCharacter());
                this.linesWord = stringLines.toString();
                System.out.println("meow"); //убрать
                break;

            } else

        }


    }

}


