package ComparableVsComparator;

public class Emp2 {
    private String name;
    private int sal;
    //If class is empty - compiler provides a default con
    //if u create your own para con , compiler will provide u nothing , now your reponsibility

    public Emp2() {
    }

    public Emp2(String name, int sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
