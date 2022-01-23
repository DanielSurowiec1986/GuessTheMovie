package pl.danielsu;

import java.util.ArrayList;
import java.util.List;

public class Game {


    String movieName;
    String movieNameEncrypt;
    String letters = "";
    List<Character> wrongLetters = new ArrayList<>();
    boolean isWin = false;

    public Game(String movieName) {

        this.movieName = movieName;
    }



    public void movieNameEncrypt() {
        this.movieNameEncrypt = movieName.replaceAll("[a-z]", "_");
        System.out.println("You are quessing: " + movieNameEncrypt);
    }

    public String checkLetterInMovieName(char letter) {
        if (this.movieName.contains(String.valueOf(letter))) {
            if (this.letters.equals("")) {
                this.letters = String.valueOf(letter);
            } else {
                this.letters = this.letters + ", " + letter;
            }
            this.movieNameEncrypt = this.movieName.replaceAll("[^" + this.letters + "]", "_");
            return "You are guessing: " + movieNameEncrypt;
        } else {
            this.wrongLetters.add(letter);
            return "You have guessed " + wrongLetters.size() + " wrong letters: " + wrongLetters;

        }
    }

    public void checkWin() {
        if (!this.movieNameEncrypt.contains("_")) {
            this.isWin = true;
            System.out.println("You win!");
            System.out.println("You have guessed '" + movieNameEncrypt + "' correctly.");
        }
    }
}

