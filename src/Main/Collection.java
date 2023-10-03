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