import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//CopyOnWriteArrayList
public class ArrayListExample {
    public static void main(String[] args) {
        //how to make arraylist synchronized
        List<String> l1 = new ArrayList<>();
        List<String> nameList = Collections.synchronizedList(l1);
        l1.add("Oli");
        l1.add("Oli_one");
        l1.add("Oli_two");
        //add, remove- we dont need explicit synchronization

        //fetch value-we have to use explicit synchronization
        //explicit synchronization
    synchronized (nameList){
        Iterator<String> iterator = nameList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

        //Enhanced For loop
        for(String i : l1){
            System.out.print(" "+i);
        }

//        System.out.print("......................................");
//        //ForEach
//        l1.forEach((j)-> System.out.print(" " + j));
    }
}
