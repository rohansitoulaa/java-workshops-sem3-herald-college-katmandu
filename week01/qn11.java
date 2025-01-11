package week01;

import java.util.Scanner;

public class qn11 {
public static void main(String[] args) {
	try (Scanner user = new Scanner (System.in)) {
		System.out.println("Enter miles : ");
		double num1 = user.nextDouble();
		double km = num1*1.6;
		System.out.println(km);
	}
}
}
