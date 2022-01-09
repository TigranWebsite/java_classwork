public class Marketing extends Employee{
    public Marketing(String firstName, String lastName, String department, String position, int yearsOfExperience, int salary) {
        super(firstName, lastName, department, position, yearsOfExperience, salary);
    }
    public void printMark(){
        System.out.println("----Marketing ----");
    }
}
