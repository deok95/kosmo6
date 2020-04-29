package banktest;

public class Bank 
{
	public String name;
	public String account;
	public int balance;
	
	
	void deposit(int money)
	{
		balance+= money;
		System.out.println(money+"가 입금되었습니다");
	}
	
	void withDraw(int money)
	{
		if(balance < money)
		{
			System.out.println("잔액이 부족합니다.");
			return;
		}
		else if (balance >= money)
		{
			System.out.println(money+"가 출금되었습니다");
		}
	}	
		@Override
		public String toString() {
		return String.format("[이름 : %s,계좌번호 : %s, 잔액 : %d]",name,account,balance);
	
	}

}
