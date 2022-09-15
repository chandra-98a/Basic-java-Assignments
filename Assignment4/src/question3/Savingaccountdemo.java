package question3;
 class Savingaccountdemo {
	
	public  static double withdraw(double amounts) throws IllegalBankTransactionException
	{
		
           if(amounts<0)
		
			throw new IllegalBankTransactionException();
		return amounts; 
			
       
    }

    public static void main(String args[]) 
    { 
double amount=-1234;
        try
        { 
            withdraw(amount); 
        } 
        catch(IllegalBankTransactionException ex) 
        { 
            System.out.println("Insufficient Balance"); 
        } 
    }
}
    

		
