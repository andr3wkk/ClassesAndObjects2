package Main;
import java.util.ArrayList;
public class Collection {
    private ArrayList<Series> series;
    private int count;

    public Collection() {
        series = new ArrayList<>();
        count = 0;
    }

    public void add(Series newSeries) {
        series.add(newSeries);
        count++;
    }

    public void print() {
        System.out.println("Collection of Series:");
        for (Series series : series) {
            series.print();
        }
    }

    public void printOne(int i) {
        System.out.println("Here is info about series:");
        if (i >= 0 && i < count) {
            series.get(i).print();
        } else {
            System.out.println("Incorrect input.");
        }
    }

    public void sortByYear() {
        for (int i = 0; i < count; i++) {
            boolean isSorted = true;
            for (int j = 0; j < (count - 1); j++) {
                if (series.get(j).getReleaseYear() > series.get(j + 1).getReleaseYear()) {
                    swap(series, j, j + 1);
                    isSorted = false;
                }
            }
            if (isSorted) {
                return;
            }
        }
        for (Series series: series) {
            series.print();
        }
    }

    public static void swap(ArrayList<Series> seriesArrayList, int a, int b) {
        Series temp = seriesArrayList.get(a);
        seriesArrayList.set(a, seriesArrayList.get(b));
        seriesArrayList.set(b, temp);
    }

        public void findName(String searchSeries) {
        for (Series series: series) {
            if (series.getName().contains(searchSeries)) {
                series.print();
            }
        }
    }

    public void findYear(int searchSeries) {
        for (Series series: series) {
            if (series.getReleaseYear() == (searchSeries)) {
                series.print();
            }
        }
    }

}