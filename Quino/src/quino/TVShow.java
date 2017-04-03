package quino;

/**
 *
 * @author snorr
 */
public class TVShow extends Info {

    private int seasons;
    private int episodes;
    private boolean stillrunning;

    public TVShow(String title, String genre, int rating, int duration, int seasons, int episodes, boolean stillrunning) {
        super(title, genre, rating, duration);
        this.seasons = seasons;
        this.episodes = episodes;
        this.stillrunning = stillrunning;
    }

    public int getSeasons() {
        return seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public boolean isStillrunning() {
        return stillrunning;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public void setStillrunning(boolean stillrunning) {
        this.stillrunning = stillrunning;
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
