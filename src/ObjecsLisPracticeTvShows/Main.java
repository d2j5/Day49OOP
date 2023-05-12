package ObjecsLisPracticeTvShows;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<TvShow> shows = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name;
        int numEpisodes;
        String genre;
        while (true) {
            System.out.print("Name of the show: ");
            name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.print("How many episodes? ");
            numEpisodes = Integer.parseInt(scanner.nextLine());
            System.out.print("What is the genre? ");
            genre = scanner.nextLine();
            shows.add(new TvShow(name, numEpisodes, genre));
        }
        for (TvShow show : shows) {
            System.out.println(show.toString());
        }
    }
}
