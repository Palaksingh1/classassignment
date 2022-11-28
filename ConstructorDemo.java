package oopsconcepts;

class Employee
{
   int id;
   String name,designation;
   double basicSalary;
   
   //parameterized constructor //it will not return any value explicitly, implicitly it'll return reference of object
   public Employee(int id,String name,String designation,double basicSalary)
   {
	   this.id=id;
	   this.name=name;
	   this.designation=designation;
	   this.basicSalary=basicSalary;
   }
   public void display()
   {
	   System.out.println("Id: "+id+" "+"Name: "+name+" "+"designation: "+designation+" "+"Basic salary: "+basicSalary);

   }
}

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee emp1=new Employee(101,"palak", "Manager", 20000);
        Employee emp2=new Employee(102,"veer", "developer", 30000);
        emp1.display();
        emp2.display();
}
}
/*
 * 1.default constructor- which will assign value
 * 2.parameterized constructor- which will assign different value according to wish
 * 3.constructor does not has any return type otherwise it will be counted as a method
 */
