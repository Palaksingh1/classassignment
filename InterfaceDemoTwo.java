package oopsconcepts;

interface MyInterfaceYes
{
	public void methodd();
	int x=23;
	default void funn()
	{
		System.out.println("we can add method body in interface using default !!");
	}
}

class testt
{
	int id;
	testt(int id)
	{
		this.id=id;
	}
	void getValue()
	{
		System.out.println(id);
	}
}

interface bb
{
         }
class demof extends testt implements MyInterfaceYes,bb
{
	demof(int id)
	{
		super(id);
		//TODO Auto-generated constructor stub
	}
	
	@Override
	public void methodd()
	{
		System.out.println("overridden method of interface");
		//x=30;
	}
}

public class InterfaceDemoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        demof obj=new demof(12);  //upcasting
        obj.methodd();
        obj.getValue();
        obj.funn();
	}

}
