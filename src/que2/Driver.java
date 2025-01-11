package que2;

import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

        // Accept employee information
        System.out.println("Enter Employee Information:");
        System.out.print("Employee ID: ");
        
        int emp_Id = scan.nextInt();
        
        scan.nextLine(); 
        
        System.out.print("Employee Name: ");
        String empName = scan.nextLine();
        
        System.out.print("Employee Salary: ");
        double empSalary = scan.nextDouble();

        // Create Employee object
        Employee employee = new Employee(emp_Id, empName, empSalary);
        double incomeTax = employee.cal_Tax(); 
      

        // Accept product information
        System.out.println("Enter Product Information:");
        System.out.print("Product ID: ");
        int prodId = scan.nextInt();
        
        System.out.print("Product Price: ");
        double prodPrice = scan.nextDouble();
        
        System.out.print("Product Quantity: ");
        int prodQuantity = scan.nextInt();

        // Create Product object
        Product product = new Product(prodId, prodPrice, prodQuantity);
        double salesTax = product.cal_Tax(); // Calculate sales tax

        // Display results
        System.out.println("Employee Details: " + employee);
        System.out.printf("Income Tax: %.2f\n", incomeTax);
        System.out.println("Product Details: " + product);
        System.out.printf("Sales Tax: %.2f\n", salesTax);

        scan.close(); 
    }

	

}
