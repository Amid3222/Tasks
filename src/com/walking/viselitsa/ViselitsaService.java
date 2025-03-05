package com.walking.viselitsa;

import java.util.Random;

public class ViselitsaService {

    private final Random random = new Random();
    private final ViselitsaRepository VRep = new ViselitsaRepository();
    private String character;  //хранит букву
    public String word;     //поле хранит введенное слово
    boolean fullword = false;

    private void setRandomWord() {
        int randValue = random.nextInt(VRep.words.length);
        String word = VRep.words[randValue];
        this.word = word;
    }

    private String getWord() {
        return word;
    }

    public boolean finishGameStatus() {
        if (fullword) return fullword;
        else if (VRep.attempCount == 0) return gameOver();
        else return false;

    }

    private boolean gameOver() {
        System.out.printf("\nВы проиграли, загаданное слово: %s", getWord());
        return true;
    }

    private void decrementAttemp() {
        if (VRep.attempCount == 0) gameOver();
        else VRep.attempCount -= 1;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    private String getCharacter() {
        return character;
    }

    public String viewLines() {
        return VRep.getLinesWord();
    }

    public String createLines() {
        setRandomWord();
        StringBuilder wordLines = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            wordLines.append("-");
        }
        VRep.setLinesWord(String.valueOf(wordLines));
        return VRep.getLinesWord();

    }


    public void checkWordChar() {
        StringBuilder stringWord = new StringBuilder(getWord());
        StringBuilder stringLines = new StringBuilder(viewLines());
        boolean check = false;

        for (int i = 0; i < stringWord.length(); i++) {

            if (stringWord.charAt(i) == getCharacter().charAt(0)) {
                stringLines.replace(i, i + 1, getCharacter());
                VRep.setLinesWord(stringLines.toString());
                System.out.println("meow"); //убрать

                check = true;
                if (getWord().equals(VRep.getLinesWord())) {
                    fullword = true;
                    System.out.println("Поздравляем, победа!");
                    break;
                }
                break;
            }

        }

        if (!check) {
            decrementAttemp();
            System.out.printf("Неверно, -1 попытка, осталось %d попыток \n", VRep.attempCount);

        }


    }

}


