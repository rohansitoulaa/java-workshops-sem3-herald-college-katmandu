package week04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;
class BankAccount{
	double accountBalance = 0.0;
	
	void deposit(double amount) {
		accountBalance +=amount;
		System.out.println("The amount "+amount+" has been deposited");
		System.out.println("Your total balance is "+accountBalance);
	}
	void withdraw(double amount) {
		if(amount > accountBalance) {
			System.out.println("Insufficent balance");
			return;
		}
		accountBalance -= amount;
		System.out.println("The amount "+amount+" has been withdraw");
		System.out.println("Your total balance is "+accountBalance);
	}
}
public class qn03 {
	@Test
	   public void testAddTwoNumbers() {
        BankAccount acc = new BankAccount();


        acc.deposit(100.00);
        assertEquals(100.00, acc.accountBalance);
        acc.withdraw(50.00);
        assertEquals(50.00, acc.accountBalance);
        acc.withdraw(60.00);
	}
	
	
}
