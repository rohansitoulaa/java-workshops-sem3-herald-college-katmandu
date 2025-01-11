package week01;

import java.util.Scanner;

public class qn07 {
	public static void main(String[] args) {
		try (Scanner user = new Scanner (System.in)) {
			System.out.println("Enter an Radius : ");
			double r = user.nextDouble();
			System.out.println("Enter an height : ");
			double h = user.nextDouble();
			double pi = Math.PI;
			double volume = pi*(r*r)*h;
			System.out.println(volume);
		}

	}
}
