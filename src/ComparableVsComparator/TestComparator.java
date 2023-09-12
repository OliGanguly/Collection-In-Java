package ComparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {


    public static void main(String[] args) {
        List<Laptop2> laptopList = new ArrayList<>();
        laptopList.add(new Laptop2("HP",16,7000));
        laptopList.add(new Laptop2("Mac",32,9000));
        laptopList.add(new Laptop2("Dell",32,8000));
        Comparator<Laptop2> comparator = new Comparator<Laptop2>() {
            @Override
            public int compare(Laptop2 o1, Laptop2 o2) {
               if(o1.getPrice()>o2.getPrice())
                   return 1;
               else
                   return -1;

            }
        };
        Collections.sort(laptopList,comparator);
        for (Laptop2 lap:
                laptopList) {
            System.out.println(lap);

        }
        List<Laptop2> list2 = new ArrayList<>(laptopList);
        Comparator<Laptop2> compObject = new ComparatorDemp();
        Collections.sort(list2,compObject);
        for (Laptop2 lap:
                list2) {
            System.out.println("Based on Name" + lap);

        }

    }
}
