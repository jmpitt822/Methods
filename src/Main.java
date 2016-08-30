public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        String[] publishedWorks = {"Monster Hunter International" , "Monster Hunter Vendetta"};
        Authors authors = new Authors("Larry Correia", publishedWorks, true, 40);

        authors.setAuthorName("John Ringo");

        Music music = new Music("Ignition", "Punk Rock", "The Offspring", 9, 10.0);
        music.setAlbumRating(9.9);

        Films films = new Films("Jurassic Park", 112, "Steven Spielberg", "07/11/1993", 8.9);
        films.setLengthMins(127);

        Projects projects = new Projects("Project Overdrive", "11/22/2016", false);
        projects.setIsFinished(true);

        Books books = new Books("MHI", 347, "07/15/2009");
        books.setPubDate("07/28/2009");

        System.out.println("Ignition's Album Rating: " + music.getAlbumRating());
        System.out.println("One of my favoite authors is " + authors.getAuthorName());
        System.out.println("Jurassic Park's run time is " + films.getLengthMins() + " minutes.");
        System.out.println("My favorite book, Monster Hunter International was published on " + books.getPubDate());
        System.out.println("This project is finished: " + projects.getIsFinished());


    }

}
