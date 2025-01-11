package week01;

import java.util.Scanner;

public class qn09 {
	public static void main(String[] args) {
		try (Scanner user = new Scanner (System.in)) {
			System.out.println("Enter an length : ");
			double L = user.nextDouble();
			System.out.println("Enter an width : ");
			double W = user.nextDouble();
			double perimeter =((L+W) *2);
			System.out.println(perimeter);
		}
	}
}
