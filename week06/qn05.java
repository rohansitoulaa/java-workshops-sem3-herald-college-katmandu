package week06;

interface OnlinePayment{
	public void pay(String message,double finalBalance);
}
interface BalanceChecker {
    double payment(double initialBalance, double payAmount);
}
class Transcation implements BalanceChecker{
	public double payment(double initialBalance , double payAmount) {
		if(initialBalance < payAmount) {
			System.out.println("Insufficient Balance");
			return 0;
		}
		return initialBalance - payAmount;
	}
}
class CreditCardPayment implements OnlinePayment{
	double initalBalance = 1000;
	public void pay(String message,double finalBalance) {
		System.out.println(message);
		System.out.println("Total balance remain in Credit card is "+finalBalance);
	}
}
class PayPalPayment implements OnlinePayment {
	double initalBalance = 1000;
	public void pay(String message , double finalBalance) {
		System.out.println(message);
		System.out.println("Total balance remain in paypal is "+finalBalance);
	}
	
}
class Esewa implements OnlinePayment{
	double initalBalance = 1000;
	public void pay(String message,double finalBalance) {
		System.out.println(message);
		System.out.println("Total balance remain in Esewa is "+finalBalance);
	}
}
class Khalti implements OnlinePayment{
	double initalBalance = 1000;
	public void pay(String message , double finalBalance) {
		System.out.println(message);
		System.out.println("Total balance remain in khalti is "+finalBalance);
	}
}

class Payment{
	OnlinePayment payment;
	public Payment(OnlinePayment payment) {
		this.payment = payment;
	}
	
	public void notify(String message,double finalBalance) {
		payment.pay(message,finalBalance);
	}
}

public class qn05 {
 public static void main(String[] args) {
	Esewa esewa = new Esewa();
	Payment myesewapayment  = new Payment(esewa);
	
	double balanceToPay = 200;
	Transcation myTrans = new Transcation();
	double finalBalance =myTrans.payment(esewa.initalBalance, balanceToPay);

	myesewapayment.notify("Payment through esewa",finalBalance);
}
}
