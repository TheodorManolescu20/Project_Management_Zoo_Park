package Zoo_Park.Employee;

public class Vet extends Employee{

    private int yearsOfSchoolPreparation;

    public Vet(String name, int age, double height, int yearsOfSchoolPreparation) {
        super(name, age, height);
        this.yearsOfSchoolPreparation = yearsOfSchoolPreparation;
    }

    public int getYearsOfSchoolPreparation() {
        return yearsOfSchoolPreparation;
    }

    public void setYearsOfSchoolPreparation(int yearsOfSchoolPreparation) {
        this.yearsOfSchoolPreparation = yearsOfSchoolPreparation;
    }

    @Override
    public void work() {
        System.out.println("I take care of the animals!");
    }
}
