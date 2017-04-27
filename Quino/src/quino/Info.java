package quino;

/**
 *
 * @author snorr
 */
public class Info {

    private String title;
    private String genre;
    private int rating;
    private int duration;

    public Info(String title, String genre, int rating, int duration) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.duration = duration;
        
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getRating() {
        return rating;
    }

    public int getDuration() {
        return duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    /**
     * Print the context of all fields.
     */
    public void printInfo() {
        System.out.println("Title:                  " + title);
        System.out.println("Genre:                  " + genre);
        System.out.println("Rating (out of 10):     " + rating);
        System.out.println("Duration (in minutes):  " + duration);
    }
}
