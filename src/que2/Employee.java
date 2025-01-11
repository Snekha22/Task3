package que2;

public class Employee implements Taxable{
	

	private int emp_Id;
	private String name;
    private double salary;
    
    public Employee(int emp_Id, String name, double salary) 
    {
		this.emp_Id = emp_Id;
		this.name = name;
		this.salary = salary;
	}
    


	@Override
	public double cal_Tax() {
		// TODO Auto-generated method stub
		return salary * Sales_Tax;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee ID: " + emp_Id + ", Name: " + name + ", Salary: " + salary;
		  
	}




	public int getEmp_Id() {
		return emp_Id;
	}


	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
   
    
}
