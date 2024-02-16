/**
 * Represents an employee with first name, last name, and social security number.
 */

/** @author Kevin */
public class Employee {
    private String first_name;
    private String last_name;
    private String ssn;

    /**
     * Constructs a new Employee object.
     */
    Employee() {

    }

    /**
     * Sets the first name of the employee.
     *
     * @param fname The first name of the employee
     */
    public void set_FirstName(String fname) {
        this.first_name = fname;
    }

    /**
     * Gets the first name of the employee.
     *
     * @return The first name of the employee
     */
    public String get_FirstName() {
        return this.first_name;
    }

    /**
     * Sets the last name of the employee.
     *
     * @param lname The last name of the employee
     */
    public void set_LastName(String lname) {
        this.last_name = lname;
    }

    /**
     * Gets the last name of the employee.
     *
     * @return The last name of the employee
     */
    public String get_LastName() {
        return this.last_name;
    }

    /**
     * Sets the social security number of the employee.
     *
     * @param social_sec_num The social security number of the employee
     */
    public void set_SSN(String social_sec_num) {
        this.ssn = social_sec_num;
    }

    /**
     * Gets the social security number of the employee.
     *
     * @return The social security number of the employee
     */
    public String get_SSN() {
        return this.ssn;
    }

}

/**
 * Represents a salaried employee with a weekly salary.
 */
class SalariedEmployee extends Employee {
    private int weekly_salary;

    SalariedEmployee() {
        super();
    }

    /**
     * Sets the weekly salary of the employee.
     *
     * @param salary The weekly salary of the employee
     */
    public void set_WeeklySalary(int salary) {
        this.weekly_salary = salary;
    }

    /**
     * Gets the weekly salary of the employee.
     *
     * @return The weekly salary of the employee
     */
    public int get_WeeklySalary() {
        return weekly_salary;
    }

}

/**
 * Represents an hourly employee with an hourly wage and number of hours worked.
 */
class HourlyEmployee extends Employee {
    private int wage;
    private int num_hours_worked;

    HourlyEmployee() {
        super();
    }

    /**
     * Sets the hourly wage of the employee.
     *
     * @param wage The hourly wage of the employee
     */
    public void set_Wage(int wage) {
        this.wage = wage;
    }

    /**
     * Gets the hourly wage of the employee.
     *
     * @return The hourly wage of the employee
     */
    public int get_Wage() {
        return wage;
    }

    /**
     * Sets the number of hours worked by the employee.
     *
     * @param hours The number of hours worked by the employee
     */
    public void set_NumHrsWorked(int hours) {
        this.num_hours_worked = hours;
    }

    /**
     * Gets the number of hours worked by the employee.
     *
     * @return The number of hours worked by the employee
     */
    public int get_NumHrsWorked() {
        return num_hours_worked;
    }
}

/**
 * Represents a commission-based employee with a commission rate and gross
 * sales.
 */
class CommissionEmployee extends Employee {
    private double commissionRate;
    private int grossSales;

    CommissionEmployee() {
        super();
    }

    /**
     * Sets the commission rate of the employee.
     *
     * @param rate The commission rate of the employee
     */
    public void set_CommissionRate(double rate) {
        this.commissionRate = rate;
    }

    /**
     * Gets the commission rate of the employee.
     *
     * @return The commission rate of the employee
     */
    public double get_CommissionRate() {
        return commissionRate;
    }

    /**
     * Sets the gross sales of the employee.
     *
     * @param sales The gross sales of the employee
     */
    public void set_GrossSales(int sales) {
        this.grossSales = sales;
    }

    /**
     * Gets the gross sales of the employee.
     *
     * @return The gross sales of the employee
     */
    public int get_GrossSales() {
        return grossSales;
    }
}

/**
 * Represents an employee with a base salary.
 */
class BaseEmployee extends Employee {
    private int base_salary;

    BaseEmployee() {

    }

    /**
     * Sets the base salary of the employee.
     *
     * @param base_salary The base salary of the employee
     */
    public void setBase_salary(int base_salary) {
        this.base_salary = base_salary;
    }

    /**
     * Gets the base salary of the employee.
     *
     * @return The base salary of the employee
     */
    public int get_BaseSalary() {
        return base_salary;
    }
}
