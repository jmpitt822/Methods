/**
 * Created by jeremypitt on 8/30/16.
 * Contains an author's name, a list of their published novels, and whether or not they're still living
 */
public class Author {

    private String authorName;
    private String[] publishedWorks;
    private boolean isLiving;
    private int age;

    public Author(String authorName, String[] publishedWorks, boolean isLiving, int age) {
        this.authorName = authorName;
        this.publishedWorks = publishedWorks;
        this.isLiving = isLiving;
        this.age = age;
    }

    public void setAuthorName(String authorName){
        if (authorName.contains(" ")) {
            this.authorName = authorName;
        }
    }

    public String getAuthorName(){
        return authorName;
    }

    public void setIsLiving(boolean isLiving){
        if (age <= 100) {
            this.isLiving = isLiving;
        }
    }

    public boolean getIsLiving(){
        return isLiving;
    }

    public void setAge(int age){
        if (age > 0){
            this.age = age;
        }
    }

    public int getAge(){
        return age;
    }


}
