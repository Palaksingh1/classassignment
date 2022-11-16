package oopsconcepts;

class Parent
{
	void parentMethod()
	{
		System.out.println("this is parent class method");
	}
}
class Child extends Parent
{
	void childMethod()
	{
		System.out.println("this is child class method");	
	}
}

public class SingleInheritanceDemoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj=new Child();
        obj.parentMethod();
        obj.childMethod();
	}

}

