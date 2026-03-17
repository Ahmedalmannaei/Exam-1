/**
 * Main — demonstrate your Employee Management System.
 *
 * YOUR TASKS:
 *   Part C — Create Manager and Intern objects, demonstrate polymorphism
 *   Part D — Add try/catch blocks for exception handling
 *
 * This file should compile and run, printing output that proves
 * all your code works correctly.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=== PART A: Salary Utilities ===");
        // TODO: Test all 4 SalaryUtils methods and print results
        System.out.println("Annual Salary: " + SalaryUtils.calculateAnnualSalary(3000));
        System.out.println("Tax: " + SalaryUtils.calculateTax(25000));
        System.out.println("Net Salary: " + SalaryUtils.calculateNetSalary(25000));
        System.out.println("Salary after raise: " + SalaryUtils.applyRaise(3000, 10));


        System.out.println("\n=== PART B: Employee Manager ===");
        // TODO: Create an EmployeeManager
        EmployeeManager manager = new EmployeeManager();
        // TODO: Create and add at least 3 employees to it
        Employee e1 = new Employee(1, "Ahmed", "Development", 3500);
        Employee e2 = new Employee(2, "Ali", "Cybersecurity", 3000);
        Employee e3 = new Employee(3, "Abdulla", "Cybersecurity", 2800);
        manager.addEmployee(e1);
        manager.addEmployee(e2);
        manager.addEmployee(e3);

        // TODO: Demonstrate findById (found + not found)
        System.out.println(manager.findById(1));
        System.out.println(manager.findById(76));

        // TODO: Demonstrate getEmployeesByDepartment
        System.out.println(manager.getEmployeesByDepartment("cybersecurity"));

        System.out.println("\n=== PART C: Inheritance & Polymorphism ===");
        // TODO: Create at least 1 Manager and 1 Intern
        Manager manager1 = new Manager(10,"Ameen","Instructor",1000000,5);
        Intern intern = new Intern(26,"Mohammed","Development",100,"UOB");
        // TODO: Add all employees (Employee, Manager, Intern) to the manager
        manager.addEmployee(manager1);
        manager.addEmployee(intern);
        // TODO: Loop through getAllEmployees() and call getBonus() on each
        //       Print: "<name> bonus: <amount>" for each one
        //       This demonstrates polymorphism — same method call, different behavior
        for (Employee e : manager.getAllEmployees()) {
            System.out.println(e.getName() + " Salary bonus: " + e.getBonus());
        }

        System.out.println("\n=== PART D: Exception Handling ===");
        // TODO: Use try/catch to demonstrate:
        //   1. Trying to remove an employee that doesn't exist
        //   2. Trying to promote an employee that's already a Manager
        //   3. Trying to create an Employee with invalid data (negative salary)
        // Each try/catch should print the error message gracefully

    }
}
