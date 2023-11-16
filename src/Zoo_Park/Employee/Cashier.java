package Zoo_Park.Employee;

public class Cashier extends Employee{

    private boolean hasCashRegister;

    public Cashier(String name, int age, double height, boolean hasCashRegister) {
        super(name, age, height);
        this.hasCashRegister = hasCashRegister;
    }

    public boolean isHasCashRegister() {
        return hasCashRegister;
    }

    public void setHasCashRegister(boolean hasCashRegister) {
        this.hasCashRegister = hasCashRegister;
    }

    @Override
    public void work() {
        System.out.println("I collect payments!");
    }
}
