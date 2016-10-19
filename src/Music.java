/**
 * Created by jeremypitt on 8/30/16.
 * Holds the title, genre, artist name, track number and rating (On a 10 point scale) of an album
 */
public class Music {
    private String albumTitle;
    private String genre;
    private String artistName;
    private int trackNum;
    private double albumRating;

    public Music(String albumTitle, String genre, String artistName, int trackNum, double albumRating){
        this.albumTitle = albumTitle;
        this.genre = genre;
        this.artistName = artistName;
        this.trackNum = trackNum;
        this.albumRating = albumRating;
    }

    public void setAlbumRating(double albumRating){
        if(albumRating > 0.0 && albumRating <10.1) {
            this.albumRating = albumRating;
        }
    }

    public double getAlbumRating(){
        return albumRating;
    }

    public void setTrackNum(int trackNum){
        if(trackNum > 0) {
            this.trackNum = trackNum;
        }
    }

    public int getTrackNum(){
        return trackNum;
    }

    public void setAlbumTitle(String albumTitle){
        if (albumTitle != null){
            this.albumTitle = albumTitle;
        }
    }

    public String getAlbumTitle(String albumTitle){
        return albumTitle;
    }

    public void setGenre(String genre){
        if (genre != null){
            this.genre = genre;
        }
    }

    public String getGenre(){
        return genre;
    }

    public void setArtistName(String artistName){
        if (artistName != null){
            this.artistName = artistName;
        }
    }

    public String getArtistName(){
        return artistName;
    }
}
