package OverloadTVShow;

public class TVShow {
    private String name;
    private int numEpisodes;
    private String genre;
    private int seasons;
    private String recommended;

    public TVShow(String name, int numEpisodes, String genre) {
        this.name = name;
        this.numEpisodes = numEpisodes;
        this.genre = genre;
    }

    public TVShow(String name, int numEpisodes, String genre, int seasons, String recomended) {
        this.name = name;
        this.numEpisodes = numEpisodes;
        this.genre = genre;
        this.seasons = seasons;
        this.recommended = recomended;
    }

    public String getName() {
        return name;
    }

    public int getNumEpisodes() {
        return numEpisodes;
    }

    public String getGenre() {
        return genre;
    }

    public int getSeasons() {
        return seasons;
    }

    public String getRecommended() {
        return recommended;
    }

    public String toString() {
        return "The name of the show is " + name + " with " + numEpisodes + " number of episodes and a total of "+seasons+" seasons.\n" +
                " The genre is " + genre+", and it is a "+ recommended +" show.";
    }
}
