package Zoo_Park.Employee;

public abstract class Employee {

    String name;
    int age;
    double height;

    public Employee(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public abstract void work();

    public void workTogether(){
        System.out.println("We do team work!");
    }
}
