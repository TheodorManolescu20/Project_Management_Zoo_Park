package Zoo_Park.Employee;

public class Janitor extends Employee{

    private boolean isCleaning;

    public Janitor(String name, int age, double height,  boolean isCleaning) {
        super(name, age, height);
        this.isCleaning = isCleaning;
    }

    public boolean isCleaning() {
        return isCleaning;
    }

    public void setCleaning(boolean cleaning) {
        isCleaning = cleaning;
    }

    @Override
    public void work() {
        System.out.println("I clean the Zoo!");
    }
}
