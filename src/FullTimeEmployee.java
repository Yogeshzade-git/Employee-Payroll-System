public class FullTimeEmployee extends Employee{

    private double empSalary;

    public FullTimeEmployee(int empId, String empName, double empSalary, String empType){
        super(empId, empName, empType);
        this.empSalary = empSalary;
    }
    @Override
    double calculateEmpSalary() {
        return empSalary;
    }
}
