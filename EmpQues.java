package oopsconcepts;
class Employe
{
   int id;
   String name,designation;
   double basicSalary;
   static String organisation="Anudip"; //class/static variable
   
   
   //parameterized constructor //it will not return any value explicitly, implicitly it'll return reference of object
   public Employe(int id,String name,String designation,double basicSalary)
   {
	   this.id=id;
	   this.name=name;
	   this.designation=designation;
	   this.basicSalary=basicSalary;
   }
   public void display()
   {
	   System.out.println("Id: "+this.id+" "+"Name: "+this.name+" "+"designation: "+this.designation+" "+"Basic salary: "+this.basicSalary+" "+"Organisation: "+organisation);

   }
}
public class EmpQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe emp1=new Employe(101,"palak", "Manager", 20000);
        Employe emp2=new Employe(102,"veer", "developer", 30000);
        emp1.display();
        emp2.display();

	}

}

//this program was for demonstrating static topic


