package Main;
public class Series {
    private String name;
    private int releaseYear;
    private String genre;
    private String country;
    private int numberOfSeasons;

    public Series(String name, int releaseYear, String genre, String country, int numberOfSeasons) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.country = country;
        this.numberOfSeasons = numberOfSeasons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }

    public void print() {
        System.out.println("Series name: " + name + ".");
        System.out.println("First episode was released in " + releaseYear + ", " + country + ".");
        System.out.println("Genre of " + "'" + name + "'" + " is " + genre);
        System.out.println("This series consists of " + numberOfSeasons + " seasons.");
        System.out.println("");
    }
}