public class Main {

    public static void main(String[] args) {
        String[] publishedWorks = {"Monster Hunter International" , "Monster Hunter Vendetta"};
        Author author = new Author("Larry Correia", publishedWorks, true, 40);

        author.setAuthorName("John Ringo");

        Music music = new Music("Ignition", "Punk Rock", "The Offspring", 9, 10.0);
        music.setAlbumRating(9.9);

        Film film = new Film("Jurassic Park", 112, "Steven Spielberg", "07/11/1993", 8.9);
        film.setLengthMins(127);

        Project project = new Project("Project Overdrive", "11/22/2016", false);
        project.setIsFinished(true);

        Book book = new Book("MHI", 347, "07/15/2009");
        book.setPubDate("07/28/2009");

        System.out.println("Ignition's Album Rating: " + music.getAlbumRating());
        System.out.println("One of my favoite author is " + author.getAuthorName());
        System.out.println("Jurassic Park's run time is " + film.getLengthMins() + " minutes.");
        System.out.println("My favorite book, Monster Hunter International was published on " + book.getPubDate());
        System.out.println("This project is finished: " + project.getIsFinished());


    }

}
