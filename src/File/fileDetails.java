package File;

public class fileDetails {
    private String name;
    private int age;
    private int salary;
    private String rank;

    public fileDetails(String name, int age, int salary, String rank) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "fileDetails{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", rank=" + rank +
                '}';
    }
}
