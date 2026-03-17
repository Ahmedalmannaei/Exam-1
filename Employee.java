/**
 * Employee class — represents an employee in the system.
 *
 * YOUR TASK (Part B):
 *   1. Complete the constructor that takes all 4 parameters
 *   2. Add getters for all fields
 *   3. Add setters with validation:
 *      - setName: throw IllegalArgumentException if name is null or empty
 *      - setSalary: throw IllegalArgumentException if salary is negative
 *      - setDepartment: throw IllegalArgumentException if department is null or empty
 *   4. Override toString() to return a readable string like:
 *      "Employee{id=1, name='Ahmed', department='Engineering', salary=3500.0}"
 *   5. Add a getBonus() method that returns 5% of salary (salary * 0.05)
 */
public class Employee {

    private int id;
    private String name;
    private String department;
    private double salary;

    // TODO: Constructor that takes (int id, String name, String department, double salary)
    //       Must validate: name not null/empty, department not null/empty, salary not negative


    // TODO: Getters for all 4 fields


    // TODO: Setters for name, department, salary (with validation as described above)
    //       Note: id has no setter — it should not change after creation


    // TODO: Override toString()


    // TODO: getBonus() — returns 5% of salary
}
