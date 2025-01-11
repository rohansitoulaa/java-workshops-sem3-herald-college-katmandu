package week01;
import java.util.Scanner;

public class qn08 {
public static void main(String[] args) {
	try (Scanner user = new Scanner (System.in)) {
		System.out.println("Enter an principle : ");
		double p = user.nextDouble();
		System.out.println("Enter an time : ");
		double t = user.nextDouble();
		System.out.println("Enter an interest : ");
		double r = user.nextDouble();
		
		double interest = (p*t*r)/100;
		System.out.println(interest);
	}
}
}
