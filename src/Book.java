/**
 * Created by jeremypitt on 8/30/16.
 * Lists the title, length in pages and publication date of a book
 */
public class Book {
    private String title;
    private int lengthPgs;
    private String pubDate;

    public Book(String title, int lengthPgs, String pubDate){
        this.title = title;
        this.lengthPgs = lengthPgs;
        this.pubDate = pubDate;
    }

    public void setTitle(String title){
        if(title != null) {
            this.title = title;
        }
    }

    public String getTitle(){
        return title;
    }

    public void setLengthPgs(int lengthPgs){
        if(lengthPgs > 0) {
            this.lengthPgs = lengthPgs;
        }
    }

    public int getLengthPgs(){
        return lengthPgs;
    }

    public void setPubDate(String pubDate){
        if(pubDate.contains("/")) {
            this.pubDate = pubDate;
        }
    }

    public String getPubDate(){
        return pubDate;
    }


}
