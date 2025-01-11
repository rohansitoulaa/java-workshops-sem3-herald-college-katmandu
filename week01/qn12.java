package week01;

import java.util.Scanner;

public class qn12 {
public static void main(String[] args) {
	try (Scanner user = new Scanner (System.in)) {
		System.out.println("Enter raduis : ");
		double r = user.nextDouble();;
		double area = Math.PI * r*r;
		System.out.println(area);
	}
}
}
