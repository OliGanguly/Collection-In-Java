package Interview;

import java.util.Objects;

public class Person {
    private int voter_id;
    private String name;

    public Person() {
    }

    public Person(int voter_id, String name) {
        this.voter_id = voter_id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "voter_id=" + voter_id +
                ", name='" + name + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object object) {
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//        Person person = (Person) object;
//        return voter_id == person.voter_id && Objects.equals(name, person.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(voter_id, name);
//    }
}
