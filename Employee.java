
public class Employee {
 static int empid;
 static String name;
 //Employee class method
 static void show (int id,String n) {
	 empid = id ;
	 name = n;
	 System.out.println(empid +" "+ name);
	 
 }
}
 class Main{
	 public static void main(String args[]) {
		 // crate a initialize actual employee objects using constructor 
		 Employee.show(201,"Rakesh");
		 Employee.show(202,"Rajesh");
		 Employee.show(203,"Abhjeet");
		 Employee.show(204,"Ganesh");
		 Employee.show(205,"Pabitra");
		 
	 }
 }
