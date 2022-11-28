package oopsconcepts;
import java.util.Scanner;

class Employei
{
   int id;
   String name,designation;
   double basicSalary;
   static String organisation="Anudip"; //class/static variable
   
   
   //parameterized constructor //it will not return any value explicitly, implicitly it'll return reference of object
   public Employei(int id,String name,String designation,double basicSalary)
   {
	   this.id=id;
	   this.name=name;
	   this.designation=designation;
	   this.basicSalary=basicSalary;
   }
   
   static {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter organisation");
	   organisation=sc.nextLine();
	   sc.close();
   }
   
   static void changeOrganisation()
   {
	   organisation="Anudip Foundation";
   }
   public void display()
   {
	   System.out.println("Id: "+this.id+" "+"Name: "+this.name+" "+"designation: "+this.designation+" "+"Basic salary: "+this.basicSalary+" "+"Organisation: "+organisation);
	   
   }
}

public class EmployeeQues2 {
    
	// TODO Auto-generated method stub
    //static String name;
	//
	//static void display()
	//{
	//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employei emp1=new Employei(101,"palak", "Manager", 20000);
        Employei emp2=new Employei(102,"veer", "developer", 30000);
        emp1.display();
        //invoke or call changeOrganisation() method 
        //Employee.changeOrganisation();
        //changing object
        
        emp2.display();
        //ConstructorDemo demo=new ConstructorDemo();
     
	}

}
