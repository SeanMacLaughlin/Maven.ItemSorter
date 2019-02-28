package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator implements Comparator<Item> {
    public int compare(Item item1, Item item2) {
        if (item1.getId() == item2.getId()) {
            return 0;
        } else if (item1.getId() > item2.getId()){
            return 1;
        } else {
            return -1;
        }
    }
}