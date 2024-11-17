import java.util.ArrayList;

public class PayrollSystem {
    private ArrayList<Employee> employeeList;

    public PayrollSystem(){
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee emp){
        employeeList.add(emp);
    }

    public void removeEmployee(int empId){
        Employee removeEmployee = null;

        for(Employee emp : employeeList){
            if(emp.getEmpId() == empId){
                removeEmployee = emp;
            }
        }

        if(removeEmployee != null){
            employeeList.remove(removeEmployee);
        }else{
            System.out.println("No such Employee in System");
        }
    }

    public void displayEmployees(){
        if(!employeeList.isEmpty()) {
            for (Employee emp : employeeList) {
                System.out.println(emp);
            }
        }else{
            System.out.println("No existing Employees in System.");
        }
    }

}
