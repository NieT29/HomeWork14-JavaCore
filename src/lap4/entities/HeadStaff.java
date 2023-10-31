package lap4.entities;

public class HeadStaff extends Staff{
    private double resSalary;

    public HeadStaff(String name, double salary, double resSalary) {
        super(name, salary);
        this.resSalary = resSalary;
    }

    public double getResSalary() {
        return resSalary;
    }

    public void setResSalary(double resSalary) {
        this.resSalary = resSalary;
    }

    @Override
    public String toString() {
        return "HeadStaff{" +
                "resSalary=" + resSalary +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }


}
