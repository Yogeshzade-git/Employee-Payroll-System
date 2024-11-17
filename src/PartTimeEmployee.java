public class PartTimeEmployee extends Employee{

    private int hoursWorked;
    private double hourlyWages;

    public PartTimeEmployee(int empId, String empName, int hoursWorked, double hourlyWages, String empType){
        super(empId, empName, empType);
        this.hoursWorked = hoursWorked;
        this.hourlyWages = hourlyWages;
    }
    @Override
    double calculateEmpSalary() {
        return hoursWorked * hourlyWages;
    }
}
