package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparator<Item>{
    public int compare(Item item1, Item item2) {
        if (item1.getName().equals(item2.getName())) {
            return 0;
        } else if (item1.getName().compareTo(item2.getName()) > 0){
            return 1;
        } else {
            return -1;
        }
    }
}