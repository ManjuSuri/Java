
public class ExceptionHandling {
   int balance=40000;
  
	public static void main(String[] args)  {
		try {
		// TODO Auto-generated method stub
		ExceptionHandling eh=new ExceptionHandling();
		int result=eh.withdraw(45000);
		System.out.println("Balance="+result);
		}
		catch(Exception e) {
				
		}
	}
	int withdraw(int amount) throws AccountBalanceIsLow{
		if(balance>amount) {
			balance=balance-amount;
			System.out.println("transaction is done");
			return balance;
		}else {
			throw new AccountBalanceIsLow("your ac balance is low");
		
		}
	}

}
