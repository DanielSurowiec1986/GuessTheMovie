package pl.danielsu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class   Movies {

    public Movies() {

    }
        ArrayList<String> movies = new ArrayList<>();

        public void readMoviesFromFile () throws FileNotFoundException {
            File fileWithMovies = new File("movies.txt");
            Scanner scanFile = new Scanner(fileWithMovies);
            while (scanFile.hasNextLine()) {
                this.movies.add(scanFile.nextLine());
            }
        }
        public String chooseMovie () {
            return movies.get((int) (Math.random() * movies.size()));
        }
    }
