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
        if (charChecker()) {
            char[] charsWord;
            char[] charsLines;
            charsWord = getWord().toCharArray();
            charsLines = createLines().toCharArray();
            int indexOf = 0;

            for (int i = 0; i < charsWord.length; i++) {
                if (Character.toString(charsWord[i]).equals(getCharacter())) {
                    indexOf = i;
                    System.out.println("meo1w");
                    break;
                }
            }
            System.out.println("meow");


            //linesWord = String.valueOf(charsLines[indexOf] = getCharacter().toCharArray()[0]);

        }//буква угадывается
        //не угадываеться
    }


}