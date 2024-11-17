abstract class Employee {
    private int empId;
    private String empName;
    private String empType;

    public Employee(int empId, String empName, String empType){
        this.empId = empId;
        this.empName = empName;
        this.empType = empType;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString(){
        return "Employee [name=" + empName + ", id=" + empId + ", salary=" + calculateEmpSalary() + ", Type=" + empType + "]";
    }

    abstract double calculateEmpSalary();
}
