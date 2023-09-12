package ComparableVsComparator;

import java.util.*;

public class ComparableVsComparator {
    public static void main(String[] args) {
        int arr [] = {20, 47, 3, 7, 89, 88};
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        ArrayList<Integer>arrayList = new ArrayList<>();
        arrayList.add(1662);
        arrayList.add(56);
        arrayList.add(76897098);
        Collections.sort(arrayList);
        for(int i : arrayList){
//            System.out.println(i);
        }
        //Collection -> Intreface-List-Set-Queue
        //Collections ->Class provide utility methods
        //collection ->Concept Framework
      List<Emp> emps = new ArrayList<>();

        emps.add(new Emp("Piyali",77));
        emps.add(new Emp("Oli",34));
        emps.add(new Emp("ria",87));
        emps.add(new Emp("hsudfhi",3));

        Collections.sort(emps);
        System.out.println("using Comparable");
        for(Emp emp:emps){
//            System.out.println(emp);
        }
//        Comparator comparator = new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                if(o1.)
//                return 0;
//            }
//        };
        Comparator<Emp> comparator =new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                if(o1.getSal()>o2.getSal()){
                    return 1;
                } else if (o1.getSal()<o2.getSal()) {
                    return -1;
                }
                return 0;
            }
        };
//        Collections.sort(emps,comparator);
        System.out.println("Using Comparator");
        for(Emp emp:emps){
            System.out.println(emp);
        }

        List<Emp> empsTwo = new ArrayList<>(emps);
        Comparator<Emp> comparator1 = new CompareByName();
        Collections.sort(empsTwo,comparator1);

        System.out.println("Name Comparison Using Comparator");
        for(Emp emp:empsTwo){
            System.out.println(emp);
        }

//        List<Laptop> laptopList = new ArrayList<>();
//        laptopList.add(new Laptop("HP",16,7000));
//        laptopList.add(new Laptop("Mac",32,9000));
//        laptopList.add(new Laptop("Dell",32,8000));
//        Collections.sort(laptopList);
//        for (Laptop lap:
//                laptopList) {
//            System.out.println(lap);
//
//        }
        //Comparator
       //Comparable
//       Not working Collections.sort(laptopList);
        /*
        *Collections.sort works with integer
        * */
    }
}
