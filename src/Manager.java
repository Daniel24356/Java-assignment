public class Manager extends Employee {
    private int teamSize;

    public Manager(int emp_id, String firstName, String surname, int age,int teamSize) {
        super( emp_id,firstName,surname,age);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public void employeeDetails(){
//        super.employeeDetails();
        System.out.println("\nTeamSize"+ teamSize);
    }
}
