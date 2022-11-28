package oopsconcepts;


class User
{
	int userId;
	String userName,password,firstName,lastName,address;
	long phno;

public User(int userId,String firstName,String lastName)
{
	this.userId=userId;
	this.firstName=firstName;
	this.lastName=lastName;
}
public User(int userId,String firstName,String lastName,String address,long phno)
{
	this(userId,firstName,lastName);
	this.address=address;
	this.phno=phno;
}
public User(int userId,String firstName,String lastName,String address,long phno,String userName,String password)
{
	this(userId,firstName,lastName,address,phno);
	this.userName=userName;
	this.password=password;
}

public int getUserId() {
	return userId;
}

public String getUserName() {
	return userName;
}

public String getPassword() {
	return password;
}

public String getFirstName() {
	return firstName;
}

public String getLastName() {
	return lastName;
}

public String getAddress() {
	return address;
}

public long getPhno() {
	return phno;
}
//void display()
//{
//System.out.println("ID: "+this.userId);
//System.out.println("first name: "+this.firstName);
//System.out.println("last name: "+this.lastName);
//System.out.println("address: "+this.address);
//System.out.println("contact no: "+this.phno);
//System.out.println("usreName: "+this.userName);
//System.out.println("password: "+this.password);
//}
}

public class ConstructorOverloadingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        User user1=new User(1,"palak","singh","gurgaon",7894638801l,"palak","p124");
       System.out.println("ID: "+user1.getUserId());
       System.out.println("first name: "+user1.getFirstName());
       System.out.println("last name: "+user1.getLastName());
       System.out.println("address: "+user1.getAddress());
       System.out.println("contact no: "+user1.phno);
       System.out.println("usreName: "+user1.getUserName());
       System.out.println("password: "+user1.getPassword());
       
       System.out.println("======================================================");
       
       User user2=new User(2,"jennie","kim","busan",7498373598l);
       
       System.out.println("ID: "+user2.getUserId()+"\nfirstName: "+user2.getFirstName()+"\nLastName: "+user2.getLastName()+"\nAddress: "+user2.getAddress()+"\ncontact no: "+user2.getPhno());
       
  	}

}


