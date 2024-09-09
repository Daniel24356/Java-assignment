public class Employee {
    private int emp_id;
    private String FirstName;
    private String Surname;
    private int Age;

    public Employee(int emp_id, String firstName, String surname, int age) {
        this.emp_id = emp_id;
        FirstName = firstName;
        Surname = surname;
        Age = age;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void employeeDetails(){

        System.out.println("\nemployee_id"+ emp_id +
                "\nFirstName"+ FirstName +
                "\nSurname"+ Surname +
                "\nAge"+ Age
        );
    }
}


