package lab;

public class Trainee extends Employee {

	//creating another child class of Employee
  
	Trainee (int id, String Name, String Address, long Phone,double salary) {
			super(id,Name,Address,Phone);
			this.basicSalary=salary;
}
	}

