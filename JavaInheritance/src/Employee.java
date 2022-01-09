public class Employee {
private String firstName;
private String lastName;
    private String department;
    private String position;
private int yearsOfExperience;
private int salary;

// sa uzum em vorpes popoxakannerov el oktagorcem  vorpisszi mek angam grvi ev tarasxalner chlinen
protected String supervisor = "Supervisor";
protected String intership = "Intership";


    public Employee() {
    }

    public void print(){

        System.out.println(getFirstName()+" "+getLastName());
        System.out.println(getDepartment()+" "+getPosition());
        System.out.println(getYearsOfExperience()+" Years of Experience, "+" Salary "+getSalary()+" \u058F");
    }

    {
        System.out.println(" ------------------ ");
    }

    public Employee(String firstName, String lastName, String department, String position, int yearsOfExperience, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.position = position;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
