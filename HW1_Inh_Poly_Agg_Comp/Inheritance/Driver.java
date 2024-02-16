
public class Driver {
        public static void main(String args[]) {

                SalariedEmployee sal_emp = new SalariedEmployee();
                sal_emp.set_FirstName("Joe");
                sal_emp.set_LastName("Jones");
                sal_emp.set_SSN("111-11-1111");
                sal_emp.set_WeeklySalary(2500);
                System.out.println();
                System.out.println("First name: " + sal_emp.get_FirstName());
                System.out.println("Last name: " + sal_emp.get_LastName());
                System.out.println("SSN: " + sal_emp.get_SSN());
                System.out.println("Weekly salary: $" + sal_emp.get_WeeklySalary());

                HourlyEmployee hourly_Emp = new HourlyEmployee();
                hourly_Emp.set_FirstName("Stephanie");
                hourly_Emp.set_LastName("Smith");
                hourly_Emp.set_SSN("222-22-2222");
                hourly_Emp.set_Wage(25);
                hourly_Emp.set_NumHrsWorked(32);
                System.out.println();
                System.out.println("First name: " + hourly_Emp.get_FirstName());
                System.out.println("Last name: " + hourly_Emp.get_LastName());
                System.out.println("SSN: " + hourly_Emp.get_SSN());
                System.out.println("Wage: $" + hourly_Emp.get_Wage());
                System.out.println("Number of hours worked: " + hourly_Emp.get_NumHrsWorked());

                HourlyEmployee hourly_Emp2 = new HourlyEmployee();
                hourly_Emp2.set_FirstName("Mary");
                hourly_Emp2.set_LastName("Quinn");
                hourly_Emp2.set_SSN("333-33-3333");
                hourly_Emp2.set_Wage(19);
                hourly_Emp2.set_NumHrsWorked(47);
                System.out.println();
                System.out.println("First name: " + hourly_Emp2.get_FirstName());
                System.out.println("Last name: " + hourly_Emp2.get_LastName());
                System.out.println("SSN: " + hourly_Emp2.get_SSN());
                System.out.println("Wage: $" + hourly_Emp2.get_Wage());
                System.out.println("Number of hours worked: " + hourly_Emp2.get_NumHrsWorked());

                CommissionEmployee commissionedEmp = new CommissionEmployee();
                commissionedEmp.set_FirstName("Nicole");
                commissionedEmp.set_LastName("Dior");
                commissionedEmp.set_SSN("444-44-4444");
                commissionedEmp.set_CommissionRate(0.15);
                commissionedEmp.set_GrossSales(50000);
                System.out.println();
                System.out.println("First name: " + commissionedEmp.get_FirstName());
                System.out.println("Last name: " + commissionedEmp.get_LastName());
                System.out.println("SSN: " + commissionedEmp.get_SSN());
                System.out.println("Commission rate: " + (100 * commissionedEmp.get_CommissionRate() + "%"));
                System.out.println("Gross sales: $" + commissionedEmp.get_GrossSales());

                SalariedEmployee sal_emp2 = new SalariedEmployee();
                sal_emp2.set_FirstName("Renwa");
                sal_emp2.set_LastName("Chanel");
                sal_emp2.set_SSN("555-55-5555");
                sal_emp2.set_WeeklySalary(1700);
                System.out.println();
                System.out.println("First name: " + sal_emp2.get_FirstName());
                System.out.println("Last name: " + sal_emp2.get_LastName());
                System.out.println("SSN: " + sal_emp2.get_SSN());
                System.out.println("Weekly salary: $" + sal_emp2.get_WeeklySalary());

                BaseEmployee base_emp = new BaseEmployee();
                base_emp.set_FirstName("Mike");
                base_emp.set_LastName("Davenport");
                base_emp.set_SSN("666-66-6666");
                base_emp.setBase_salary(95000);
                System.out.println();
                System.out.println("First name: " + base_emp.get_FirstName());
                System.out.println("Last name: " + base_emp.get_LastName());
                System.out.println("SSN: " + base_emp.get_SSN());
                System.out.println("Base salary: $" + base_emp.get_BaseSalary());

                CommissionEmployee commissionedEmp2 = new CommissionEmployee();
                commissionedEmp2.set_FirstName("Mahnaz");
                commissionedEmp2.set_LastName("Vaziri");
                commissionedEmp2.set_SSN("777-77-7777");
                commissionedEmp2.set_CommissionRate(0.22);
                commissionedEmp2.set_GrossSales(40000);
                System.out.println();
                System.out.println("First name: " + commissionedEmp2.get_FirstName());
                System.out.println("Last name: " + commissionedEmp2.get_LastName());
                System.out.println("SSN: " + commissionedEmp2.get_SSN());
                System.out.println("Commission rate: " + (100 * commissionedEmp2.get_CommissionRate() + "%"));
                System.out.println("Gross sales: $" + commissionedEmp2.get_GrossSales());
        }
}
