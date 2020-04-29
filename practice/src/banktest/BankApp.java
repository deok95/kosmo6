package banktest;

public class BankApp 
{

	public static void main(String[] args) 
	{
		Bank acc = new Bank();
		
		acc.account = "123-456";
		acc.name = "자바맨";
		acc.balance = 10000;
		System.out.println(acc);
		
		acc.deposit(30000);
		
		acc.withDraw(15000);
	
	}

}
