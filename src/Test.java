import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("oli");
        l1.add("oli1");
//        System.out.println(l1);
        //Iterator
        Iterator itr = l1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        for(String i : l1){
            System.out.println("////"+i);
        }
//        List values = new ArrayList();
//        values.add();//ask for a object Object is the base calss


    }
}
