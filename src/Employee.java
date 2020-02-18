import org.w3c.dom.ls.LSOutput;

public class Employee{
    private int id;
    private int salary;
    private String firstName;
    private String lastName;


    //constructor
    Employee(String f, String l, int i, int salary){
        this.id = i;
        this.firstName = f;
        this.lastName = l;
        this.salary = salary;
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    //method to get the full name
    public String getName(){
        return firstName+ " " + lastName;
    }

    //method to get annual salary
    public int annualSalary()
    {
        return salary*12;
    }

    //raise salary by given percentage
    public double raiseSalary(int percent){
        return (salary) + (salary * percent/100);
    }


    public String toString() {
        return "Employee{" +
                "id=" + this.id +
                ", salary=" + this.salary +
                ", firstName='" + this.firstName + '\'' +
                ", lastName='" + this.lastName + '\'' +
                '}';
    }



}