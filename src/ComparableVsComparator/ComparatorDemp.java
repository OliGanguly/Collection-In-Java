package ComparableVsComparator;

import java.util.Comparator;

public class ComparatorDemp implements Comparator<Laptop2> {
    @Override
    public int compare(Laptop2 o1, Laptop2 o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
