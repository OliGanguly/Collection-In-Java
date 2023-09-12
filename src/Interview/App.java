package Interview;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(10);
//        System.out.println(hashSet);
        HashSet<Person> personHashSet = new HashSet<>();
        personHashSet.add(new Person(12,"OLi12"));
        personHashSet.add(new Person(13,"OLi13"));
        personHashSet.add(new Person(14,"OLi14"));
//        System.out.println(personHashSet.add(new Person(15, "OLi15")));
//        System.out.println(personHashSet.add(new Person(15, "OLi15")));
        //I will get entry 15 two times
//        personHashSet.forEach((i)-> System.out.println(i));




        //here we have to override hashCode() and equals() method
        /*About Equals method
        *  public boolean equals(Object obj) {
        return (this == obj);
          }
          * Coming from Object class
        * */
        Person p1 = new Person(12,"Oli");
        Person p2 = new Person(12,"Oli");
        System.out.println(p1.equals(p2));//false
        //Inter class has already override .equals method so we are getting true , which checking value
        Integer i1=100;
        Integer i2=100;
        System.out.println(i1.equals(i2));

    }
}
