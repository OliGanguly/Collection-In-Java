import java.util.*;
/*
* collection- Framework / concept
* Iterable->Collection - Interface
* Collections-Class [Provide Utility methods
* */
public class Main {
    public static void main(String[] args) {

        Collection valuess = new ArrayList();
        valuess.add(2);
        valuess.add("Oli");
        valuess.add("Oli66");
        valuess.add("Oli66");
        valuess.add("Oli86");
        //one
        /*
         * Iterator
         * Enhanced For Loop
         *
         * */
//1.   Iterator k =valuess.iterator();
//   while (k.hasNext()){
////       System.out.println(k.next());
//   }//Collections.sort(valuess);//it does not work with Collection Object bcz it has no index
   for(Object itr : valuess){
       System.out.println("////"+ itr);
   }

//        Collection Interface doest not work with index

        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(3);
        values.add(5);
        values.add(1,7);
       //Collections is A class provides utility methods , we just pass Object of Collection like list
        Collections.sort(values);
         for(int i:values){
             System.out.println(i);
         }
         values.forEach((i)-> System.out.println("hi"+ i));

//2.Print One
//        for(Integer i : l){
//            System.out.println(i);
//        }

// 3.  Two-->  l.forEach(System.out::println);

//        Vector v = new Vector();
//        v.add(1);
//        v.add(3);
//        v.add(2);
//        System.out.println(v.capacity());
//        v.forEach(System.out::println);

/*Imp
* ArrayList Object are non Synchronized
* How to get synchronized version of Arraylist
* */
//        ArrayList l1=new ArrayList();
//        List l1=Collections.synchronizedList(l1);

/*
* So to get synchronized version of arraylist object we use synchronizedList()
* method from Collections class
* public static List synchronizedList(List obj){}
*
* */

    }
}