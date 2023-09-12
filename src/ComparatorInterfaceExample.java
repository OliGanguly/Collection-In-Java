import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.*;

public class ComparatorInterfaceExample {
    public static void main(String []args){

        List<Integer> values=new ArrayList<>();
        values.add(305);
        values.add(998);
        values.add(774);
        values.add(236);
        values.add(881);
        //get values in sorted order
        Collections.sort(values);
        for (int y: values) {
            System.out.println(y);
        }
//        What if i want to sort by last index

        /*
         * Sorting to be done based on the last digit of the number in the example
         *
         * we need to mention the sorting technique as a second parameter
         * */
        /*
        * Diff btween comparable and comparator
        * comparable-default sorting->methods->compareTo()
        * comparator-customized sorting-->method->compare() and equals()
        * */
        Comparator<Integer> com = new ComImpl();
        Collections.sort(values,com);
        for(int i :values){
            System.out.println("i--"+i);
        }
      System.out.println("Hello")  ;
    }
}
