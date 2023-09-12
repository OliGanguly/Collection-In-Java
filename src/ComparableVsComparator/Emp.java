package ComparableVsComparator;

public class Emp implements Comparable<Emp>{
    private String name;
    private int sal;
    //If class is empty - compiler provides a default con
    //if u create your own para con , compiler will provide u nothing , now your reponsibility
    @Override
    public int compareTo(Emp obj) {
        if(this.getSal()>obj.getSal()){
            return 1;
        } else if (this.getSal()<obj.getSal()) {
            return -1;
        }
        return 0;
    }
    public Emp() {
    }

    public Emp(String name, int sal) {
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
