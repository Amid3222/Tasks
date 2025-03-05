package com.walking.viselitsa;

public class ViselitsaRepository {
    private String linesWord;
    public int attempCount = 5;
    String[] words = {
            "стол",
            "книга",
            "солнце",
            "сосна",
            "чайник",
            "дом",
            "река",
            "гора",
            "цветок",
            "зверь",
            "птица",
            "тело",
            "друзья",
            "музыка",
            "еда",
            "вода",
            "град",
            "снег",
            "праздник",
            "работа"
    };

    public String getLinesWord() {
        return linesWord;
    }

    public void setLinesWord(String linesWord) {
        this.linesWord = linesWord;
    }


}
