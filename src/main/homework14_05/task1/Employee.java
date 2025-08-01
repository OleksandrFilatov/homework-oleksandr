package main.homework14_05.task1;

public class Employee {

    private String name;
    private int hoursWorked;
    private double hourlyRate;
    private double monthlySalary;

    public Employee(String name, int hoursWorked, double hourlyRate) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.monthlySalary = hoursWorked * hourlyRate;
    }

    public String getName() {
        return name;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
        recalculateMonthlySalary();
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
        recalculateMonthlySalary();
    }

    private void recalculateMonthlySalary() {
        this.monthlySalary = this.hoursWorked * this.hourlyRate;
    }

    @Override
    public String toString() {
        return String.format("Работник %s: отработано %d часов, ставка %.2f, месячная зарплата: %.2f.",
                name, hoursWorked, hourlyRate, monthlySalary);
    }
}