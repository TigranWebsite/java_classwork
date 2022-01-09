public class Accountant extends Employee {
    public Accountant(String firstName, String lastName, String department, String position, int yearsOfExperience, int salary) {
        super(firstName, lastName, department, position, yearsOfExperience, salary);
    }
    public void printAc(){
        System.out.println("---- Accountant ----");
    }

}
