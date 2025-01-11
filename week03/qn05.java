package week03;


interface PaymentMethod {
    void processPayment(double amount);
}

class Esewa implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println(amount + "eSewa.");
    }
}

class Khalti implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println(amount + " through Khalti.");
    }
}

public class qn05 {
	public static void main(String[] args) {
        PaymentMethod esewa = new Esewa();
        esewa.processPayment(1500);

        PaymentMethod khalti = new Khalti();
        khalti.processPayment(2500);
    }
}
