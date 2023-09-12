import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArraylist {
    public static void main(String[] args) {
        //1.Collections.
        ArrayList<String> a1 = new ArrayList<>();
        List<String> programmingLang = Collections.synchronizedList(a1);
        a1.add("Java");
        a1.add("Python");
        a1.add("Javascript");
        //add , update we don't need explicit synchronization
        //fetch we need  explicit synchronization
        synchronized (programmingLang){
            programmingLang.forEach((i)-> System.out.println(i));
        }
        System.out.println(".........................");
        synchronized (programmingLang){
            Iterator<String> iterator = programmingLang.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }

        }
        System.out.println("........................");
        //2.
        CopyOnWriteArrayList<Integer> a2= new CopyOnWriteArrayList<>();
        a2.add(12);
        a2.add(24);
        for(int k : a2){
            System.out.println(k);
        }

    }
}
