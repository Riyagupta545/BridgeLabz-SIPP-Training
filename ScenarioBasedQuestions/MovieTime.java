package ScenarioBasedQuestions;
import java.util.*;

public class MovieTime {
    static class Show {
        String movie;
        int time; // e.g., 1300 for 1:00 PM

        Show(String movie, int time) {
            this.movie = movie;
            this.time = time;
        }
    }

    public static void insertionSort(List<Show> shows) {
        for (int i = 1; i < shows.size(); i++) {
            Show key = shows.get(i);
            int j = i - 1;
            while (j >= 0 && shows.get(j).time > key.time) {
                shows.set(j + 1, shows.get(j));
                j--;
            }
            shows.set(j + 1, key);
        }
    }

    public static void main(String[] args) {
        List<Show> shows = new ArrayList<>();
        shows.add(new Show("Avengers", 1500));
        shows.add(new Show("Spiderman", 1300));
        shows.add(new Show("Batman", 1400));

        insertionSort(shows);
        for (Show s : shows)
            System.out.println(s.movie + " at " + s.time);
    }
}
