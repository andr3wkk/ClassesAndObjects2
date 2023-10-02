package Main;
public class Series {
    public String name;
    public int releaseYear;
    public String genre;
    public String country;
    public int numberOfSeasons;
    public int counter = 0;

    public Series(String name, int releaseYear, String genre, String country, int numberOfSeasons) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.country = country;
        this.numberOfSeasons = numberOfSeasons;
    }
    public void print() {
        System.out.println("Series name: " + name + ".");
        System.out.println("First episode was released in " + releaseYear + ", " + country + ".");
        System.out.println("Genre of " + "'" + name + "'" + " is " + genre);
        System.out.println("This series consists of " + numberOfSeasons + " seasons.");
        System.out.println(counter);
    }
}
