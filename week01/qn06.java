package week01;
import java.util.Scanner;
public class qn06 {
public static void main(String[] args) {
	try (Scanner user = new Scanner (System.in)) {
		System.out.println("Enter an celcuis : ");
		double C = user.nextDouble();
		double F = (C*9/5)+32;
		System.out.println("the converted value is :"+F);
	}
}
}