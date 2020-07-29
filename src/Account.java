// Exercise #2
class Account 
{
	private static int numAccounts = 0;
	private String account;
	
	public static void main(String[] args) 
	{
		Account obj;
		
		obj = new Account("Account 1");
		System.out.println(obj);
		
		obj = new Account("Account 2");
		System.out.println(obj);
		
		obj = new Account("Account 3");
		System.out.println(obj);
		
		obj = new Account("Account 4");
		System.out.println(obj);
		
		System.out.println("The total number of account: " + Account.getNumAccounts());		 
	}
	public Account (String str)
	{		
		account = str;
		numAccounts ++;
	}
	public String toString()
	{
		return account;
	}
	public static int getNumAccounts()
	{
		return numAccounts;
	}

}
