import java.util.Scanner;

public class MainEntry {
    private static PayrollSystem payrollSystem;

    public static void main(String[] args) {
        payrollSystem = new PayrollSystem();

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int empId=1;

        while(choice < 5){

            System.out.println("***** Employee Payroll System *****");
            System.out.println("1. Add Fulltime Employee");
            System.out.println("2. Add PartTime Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Remove Employee");
            System.out.println("5. Exit");
            System.out.println();
            System.out.print("Choice - ");
            choice = sc.nextInt();

            switch (choice){
                case 1 :{
                    System.out.print("Enter Employee Name - ");
                    String empName = sc.next();
                    System.out.print("Enter Employee Salary - ");
                    double empSalary = sc.nextDouble();
                    addFullTimeEmployee(empId, empName, empSalary, "FullTime");
                    empId++;
                    break;
                }
                case 2 :{
                    System.out.print("Enter Employee Name - ");
                    String empName = sc.next();
                    System.out.print("Enter no. of hours Employee worked - ");
                    int hoursWorked = sc.nextInt();
                    System.out.print("Enter Hourly wages - ");
                    double hourlyWages = sc.nextDouble();
                    addPartTimeEmployee(empId, empName, hoursWorked, hourlyWages, "PartTime");
                    empId++;
                    break;
                }
                case 3:{
                    displayEmployees();
                    break;
                }
                case 4:{
                    System.out.print("Enter Employee Id to remove - ");
                    int EnteredEmpId = sc.nextInt();
                    removeEmployee(EnteredEmpId);
                }
                case 5:{
                }
            }
        }
    }

    static void addFullTimeEmployee(int empId, String empName, double empSalary, String empType){
        payrollSystem.addEmployee(new FullTimeEmployee(empId, empName, empSalary, empType));
    }

    static void addPartTimeEmployee(int empId, String empName, int hoursWorked, double hourlyWages, String empType){
        payrollSystem.addEmployee(new PartTimeEmployee(empId, empName, hoursWorked, hourlyWages, empType));
    }

    static void removeEmployee(int id){
        payrollSystem.removeEmployee(id);
    }

    static void displayEmployees(){
        payrollSystem.displayEmployees();
    }
}
