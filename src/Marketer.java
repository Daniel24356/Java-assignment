public class Marketer extends Employee {
    private String[] task;
    private int bonus;

    public Marketer(int emp_id, String firstName, String surname, int age,String[] task, int bonus) {
        super(emp_id, firstName, surname, age);
        this.task = task;
        this.bonus = bonus;
    }

    public String[] getTask() {
        return task;
    }

    public void setTask(String[] task) {
        this.task = task;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void employeeDetails(){
        super.employeeDetails();
        int count = 0;
        for (String indivtask: task){
            System.out.println("Individual Task: "+ count + indivtask);
            count++;
        }
//        System.out.println("\nBonus: "+ bonus * task);
    }
}
