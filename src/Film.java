/**
 * Created by jeremypitt on 8/30/16.
 * Lists the title, length, director, release date and rating (on a 10 point scale) of a film
 */
public class Film {
    private String title;
    private float lengthMins;
    private String director;
    private String releaseDate;
    private double filmRating;

    public Film(String title, float lengthMins, String director, String releaseDate, double filmRating) {
        this.title = title;
        this.lengthMins = lengthMins;
        this.director = director;
        this.releaseDate = releaseDate;
        this.filmRating = filmRating;
    }

    public void setLengthMins(float lengthMins){
        if (lengthMins > 0) {
            this.lengthMins = lengthMins; //greater than 0
        }
    }

    public float getLengthMins(){
        return lengthMins;
    }

    public void setDirector(String director){
        if (director.contains(" ")) {
            this.director = director; //contain space
        }
    }

    public String getDirector(){
        return director;
    }

    public void setFilmRating(double filmRating){
        if (filmRating > 0.0 && filmRating < 10.1){
            this.filmRating = filmRating;
        }
    }

    public double getFilmRating(){
        return filmRating;
    }

    public void setTitle(String title){
        if (title != null){
            this.title = title;
        }
    }

    public String getTitle(){
        return title;
    }

    public void setReleaseDate(String releaseDate){
        if (releaseDate.contains("/")){
            this.releaseDate = releaseDate;
        }
    }

    public String getReleaseDate(){
        return releaseDate;
    }
}
