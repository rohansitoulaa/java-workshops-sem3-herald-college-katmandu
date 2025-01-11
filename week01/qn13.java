package week01;

import java.util.Scanner;

public class qn13 {
public static void main(String[] args) {
	try (Scanner user = new Scanner (System.in)) {
		System.out.println("Enter an dollars : ");
		double dollars = user.nextDouble();
		System.out.println("Enter an rate : ");
		double exchangeRate = user.nextDouble();
		double rupees = dollars*exchangeRate;
		System.out.println(rupees);
	}

}
}
