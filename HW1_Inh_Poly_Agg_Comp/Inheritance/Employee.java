
public class Employee {
    private String first_name;
    private String last_name;
    private String ssn;

    Employee() {
        first_name = "";
        last_name = "";
        ssn = "";
    }

    public void set_FirstName(String fname) {
        this.first_name = fname;
    }

    public String get_FirstName() {
        return this.first_name;
    }

    public void set_LastName(String lname) {
        this.last_name = lname;
    }

    public String get_LastName() {
        return this.last_name;
    }

    public void set_SSN(String social_sec_num) {
        this.ssn = social_sec_num;
    }

    public String get_SSN() {
        return this.ssn;
    }

}

class SalariedEmployee extends Employee {
    private int weekly_salary;

    SalariedEmployee() {
        super();
        weekly_salary = 0;
    }

    public void set_WeeklySalary(int salary) {
        this.weekly_salary = salary;
    }

    public int get_WeeklySalary() {
        return weekly_salary;
    }

}

class HourlyEmployee extends Employee {
    private int wage;
    private int num_hours_worked;

    HourlyEmployee() {
        super();
        wage = 0;
        num_hours_worked = 0;
    }

    public void set_Wage(int wage) {
        this.wage = wage;
    }

    public int get_Wage() {
        return wage;
    }

    public void set_NumHrsWorked(int hours) {
        this.num_hours_worked = hours;
    }

    public int get_NumHrsWorked() {
        return num_hours_worked;
    }
}

class CommissionEmployee extends Employee {
    private double commissionRate;
    private int grossSales;

    CommissionEmployee() {
        super();
        commissionRate = 0.0;
        grossSales = 0;
    }

    public void set_CommissionRate(double rate) {
        this.commissionRate = rate;
    }

    public double get_CommissionRate() {
        return commissionRate;
    }

    public void set_GrossSales(int sales) {
        this.grossSales = sales;
    }

    public int get_GrossSales() {
        return grossSales;
    }
}

class BaseEmployee extends Employee {
    private int base_salary;

    BaseEmployee() {
        base_salary = 0;
    }

    public void setBase_salary(int base_salary) {
        this.base_salary = base_salary;
    }

    public int get_BaseSalary() {
        return base_salary;
    }
}
