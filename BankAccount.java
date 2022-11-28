package oopsconcepts;

public class BankAccount {
      String bankName;
      float accountNo;
      String branch;
      
      public BankAccount(String bankName,float accountNo,String branch)
      {
    	  super();
    	  this.bankName=bankName;
    	  this.accountNo=accountNo;
    	  this.branch=branch;
      }

	public String getBankName() {
		return bankName;
	}


	public float getAccountNo() {
		return accountNo;
	}

	public String getBranch() {
		return branch;
	}
      
	@Override
	public String toString()
	{
		StringBuilder builder=new StringBuilder();
		builder.append("BankAccount [bankName=").append(bankName).append(", accountNo=").append(accountNo).append(", branch=").append(branch).append("]");
		return builder.toString();
	}
	//methods
}
