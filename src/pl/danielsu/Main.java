package pl.danielsu;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Movies newMovie = new Movies();
        try {
            newMovie.readMoviesFromFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String movieName = newMovie.chooseMovie();
        Game newGame = new Game(movieName);
        newGame.movieNameEncrypt();
        while (!newGame.isWin) {
            System.out.println("Guess a letter: ");
            Scanner userInput = new Scanner(System.in);
            char letter = userInput.nextLine().charAt(0);
            System.out.println(newGame.checkLetterInMovieName(letter));
            newGame.checkWin();
            }
        }
    }

