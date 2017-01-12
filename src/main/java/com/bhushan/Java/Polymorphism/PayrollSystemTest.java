package com.bhushan.Java.Polymorphism;

/**
 * Created by bhushan on 1/2/17.
 */
public class PayrollSystemTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee =
                new SalariedEmployee("John", "Smith", "111-111", 800.00);
        HourlyEmployee hourlyEmployee =
                new HourlyEmployee("Karen", "Price", "222-222", 16.74, 40);
        CommissionEmployee commissionEmployee =
                new CommissionEmployee("Sue", "Jones", "333-333", 10000, 0.06);
        BasePlusCommissionEmployee basePlusCommissionEmployee =
                new BasePlusCommissionEmployee("Bob", "Lewis", "444-444", 5000, 0.04, 300);

        System.out.println("Employees processed individually");

        System.out.printf("%s %s\n%s %s\n%s %s\n%s %s\n",
                salariedEmployee, salariedEmployee.earnings(),
                hourlyEmployee, hourlyEmployee.earnings(),
                commissionEmployee, commissionEmployee.earnings(),
                basePlusCommissionEmployee, basePlusCommissionEmployee.earnings());

        Employee[] employees = new Employee[4];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.println("Employees processes polymorphically");

        for (Employee currentEmployee: employees) {
            System.out.println(currentEmployee);

            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.println("New Base: " + employee.getBaseSalary());
            }

            System.out.println("earning: " + currentEmployee.earnings());
        }

        for (Employee employee: employees) {
            System.out.println("EmployeeType: " + employee.getClass());
        }
    }
}
