package Zoo_Park.Employee;

public class Security extends Employee{

    private boolean isStrong;

    public Security(String name, int age, double height, boolean isStrong) {
        super(name, age, height);
        this.isStrong = isStrong;
    }

    public boolean isStrong() {
        return isStrong;
    }

    public void setStrong(boolean strong) {
        isStrong = strong;
    }

    @Override
    public void work() {
        System.out.println("I make sure the place is safe!");
    }
}
