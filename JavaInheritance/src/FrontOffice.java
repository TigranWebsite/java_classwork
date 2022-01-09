public class FrontOffice extends Employee{
    public FrontOffice(String firstName, String lastName, String department, String position, int yearsOfExperience, int salary) {
        super(firstName, lastName, department, position, yearsOfExperience, salary);
    }

    public void printFR(){
        System.out.println("---- Front Office ----");
    }



}
