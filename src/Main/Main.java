package Main;
import java.util.ArrayList;
class Collection {
    private ArrayList<Series> sItems;

    public Collection() {
        sItems = new ArrayList<>();
    }

    public void addSItem(Series item) {
        sItems.add(item);
    }

    public void print() {
        System.out.println("Collection of Series:");
        for (Series series : sItems) {
            series.print();
        }
    }

}