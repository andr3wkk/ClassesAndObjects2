package Main;
import java.util.Collections;
import java.util.Scanner;
public class Main2 {
    static int i = 1;
    static int counter = 0;
    static int answer;
    static String cont;
    static int num;
    static String name;
    static int releaseYear;
    static String genre;
    static String country;
    static int numberOfSeasons;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Collection series = new Collection();
        series.addSItem(new Series("Breaking Bad", 2008, "Crime drama","USA", 5));
        do {
            System.out.println("Welcome to the series database!\n" +
                    "Choose an option to proceed:\n" +
                    "1 - add series to collection\n" +
                    "2 - print all series\n" +
                    "3 - sort series by year\n" +
                    "4 - search series by title\n" +
                    "5 - search series by year\n" +
                    "0 - exit the program");
            int answer = in.nextInt();

        if (answer == 1) {
            addSeries();
            series.addSItem(new Series(name, releaseYear,genre, country, numberOfSeasons));

            System.out.println("Do you want to continue?");
            cont = in.next();

        } else if (answer == 2) {
            System.out.println("Do you want to see certain series information?");
            String info = in.next();
            if (info.equals("Yes")) {
                System.out.println("Please, enter number of you collection object:");
                num = in.nextInt();
                cont = in.nextLine();
            } else {
                series.print();
                cont = in.nextLine();
            }

        } else if (answer == 3) {

        } else if (answer == 4) {

        } else if (answer == 5) {

        } else {

        }

    } while (cont.equals("Yes"));

    }
    public static void addSeries() {
        System.out.println("Please, enter series name:");
        name = in.next();
        System.out.println("Please, enter series release year");
        releaseYear = in.nextInt();
        System.out.println("Please, enter series genre:");
        genre = in.next();
        System.out.println("Please, enter series country:");
        country = in.next();
        System.out.println("Please, enter number of seasons:");
        numberOfSeasons = in.nextInt();
    }
}
