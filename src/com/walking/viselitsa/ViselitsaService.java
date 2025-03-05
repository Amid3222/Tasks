package com.walking.viselitsa;

import java.util.Random;

public class ViselitsaService {
    private Random random = new Random();
    private ViselitsaRepository VRep = new ViselitsaRepository();
    private String character;
    public String word;
    private String linesWord;

    private String setRandomWord() {
        int randValue = random.nextInt(VRep.words.length+1);
        String word = VRep.words[randValue];
        this.word = word;
        return word;
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

    public String showLines() {
        setRandomWord();
        StringBuilder wordLines = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            wordLines.append("-");
        }
        return this.linesWord = String.valueOf(wordLines);

    }

    private boolean wordChecker() {
        return getWord().contains(getCharacter());
    }


    public void x() {


        if (wordChecker()) {
            char[] charsWord;
            char[] charsLines;
            charsWord = getWord().toCharArray();
            charsLines = showLines().toCharArray();
            int indexOf = 0;

            for (int i = 0; i < charsWord.length; i++) {
                if (Character.toString(charsWord[i]).equals(getCharacter())) {
                    indexOf = i;
                    break;
                }

            }

            this.linesWord = String.valueOf(charsLines[indexOf] = getCharacter().toCharArray()[0]);

        }//буква угадывается
                    //не угадываеться
    }


}