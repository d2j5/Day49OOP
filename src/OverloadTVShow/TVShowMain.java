package OverloadTVShow;
import java.util.ArrayList;
import java.util.Scanner;
public class TVShowMain {
    public static void main(String[] args) {
        ArrayList<TVShow> arrayShows = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name of the show: ");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.print("How many episodes? ");
            int numEpisodes = Integer.parseInt(scanner.nextLine());
            System.out.print("What is the genre? ");
            String genre = scanner.nextLine();

            System.out.print("How many seasons? ");
            int seasons = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Is it good or bad? ");
            String recommended = scanner.nextLine();


            TVShow tvshow =new TVShow(name, numEpisodes, genre, seasons, recommended);
            arrayShows.add(tvshow);

        }
        for (TVShow tvshow : arrayShows) {
            System.out.println(tvshow.toString());
        }
    }
}
