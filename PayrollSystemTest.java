/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author geneivaocampo
 */
public class PayrollSystemTest {
    public static void main(String[] args){
            // create subclass objects
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee( "Sue", "Jones", "333-33-3333", 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);
        
        SalariedEmployee salariedEmployee1 = new SalariedEmployee("genny", "Ocampo", "121-11-1111", 1000.00);
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Geneiva", "Ocampo", "222-22-2822", 18.90, 50);
        CommissionEmployee commissionEmployee1 = new CommissionEmployee( "Genoveva", "Ocampo", "333-34-3333", 10000, .10);
        BasePlusCommissionEmployee basePlusCommissionEmployee1 = new BasePlusCommissionEmployee("Avisail", "Ocampo", "444-45-4444", 10000, .05, 500);
        
        System.out.println("Employees processed individually:");
        System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee,"earned", basePlusCommissionEmployee.earnings());
        
        System.out.println("Employees processed individually:");
        System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee1, "earned", salariedEmployee1.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", hourlyEmployee1, "earned", hourlyEmployee1.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", commissionEmployee1, "earned", commissionEmployee1.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee1,"earned", basePlusCommissionEmployee1.earnings());
        
        // create four-element Employee array
        Employee[] employees = new Employee[4];
        
        // initialize array with Employees
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        
        // create four-element Employee array
        Employee[] employees1 = new Employee[4];
        
        // initialize array with Employees
        employees1[0] = hourlyEmployee1;
        employees1[1] = salariedEmployee1;
        employees1[2] = basePlusCommissionEmployee1;
        employees1[3] = commissionEmployee1;

         System.out.printf("Employees processed polymorphically:%n%n");
        // generically process each element in array employees
        for ( Employee currentEmployee : employees )
            {
            System.out.println( currentEmployee ); // invokes toString
            // determine whether element is a BasePlusCommissionEmployee
            if ( currentEmployee instanceof BasePlusCommissionEmployee )
            {
            // downcast Employee reference to
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployee employee =
            ( BasePlusCommissionEmployee ) currentEmployee;
            employee.setBaseSalary( 1.10 * employee.getBaseSalary() );
            System.out.printf(
            "new base salary with 10%% increase is: $%,.2f\n",
            employee.getBaseSalary() );
            } // end if
            System.out.printf(
            "earned $%,.2f\n\n", currentEmployee.earnings() );
            } // end for
            // get type name of each object in employees array
            for ( int j = 0; j < employees.length; j++ )
            System.out.printf( "Employee %d is a %s\n", j,
            employees[ j ].getClass().getName() );
            //////////////////////////////////////////////
             System.out.printf("Employees1 processed polymorphically:%n%n \n");
            // generically process each element in array employees
            for ( Employee currentEmployee1 : employees1 )
            {
            System.out.println( currentEmployee1 ); // invokes toString
            // determine whether element is a BasePlusCommissionEmployee
            if ( currentEmployee1 instanceof BasePlusCommissionEmployee)
            {
            // downcast Employee reference to
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployee employee1 =
            ( BasePlusCommissionEmployee) currentEmployee1;
            employee1.setBaseSalary( 1.10 * employee1.getBaseSalary() );
            System.out.printf(
            "new base salary with 10%% increase is: $%,.2f\n",
            employee1.getBaseSalary() );
            } // end if
            System.out.printf(
            "earned $%,.2f\n\n", currentEmployee1.earnings() );
            } // end for
            // get type name of each object in employees array
            for ( int j = 0; j < employees1.length; j++ )
            System.out.printf( "Employee %d is a %s\n", j,
            employees1[ j ].getClass().getName() );
            } // end main
    
    
    
            } // end class PayrollSystemTest
