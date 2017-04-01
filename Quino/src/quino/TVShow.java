package quino;

/**
 *
 * @author snorr
 */
public class TVShow extends Info {

    private int seasons;
    private int episodes;

    public TVShow(int seasons, int episodes, String title, String genre, int rating, int duration) {
        super(title, genre, rating, duration);
        this.seasons = seasons;
        this.episodes = episodes;
    }

    public int getSeasons() {
        return seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
    /**
     * Print the context of all fields.
     */
    public void printInfo() {
        super.printInfo();
        System.out.println("Number of seasons:      " + seasons);
        System.out.println("Number of episodes:     " + episodes);
    }
}
