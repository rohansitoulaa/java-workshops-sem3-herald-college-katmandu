package week01;

import java.util.Scanner;

public class qn10 {
public static void main(String[] args) {
	try (Scanner user = new Scanner (System.in)) {
		System.out.println("Enter an num1 : ");
		double num1 = user.nextDouble();
		System.out.println("Enter an num2 : ");
		double num2 = user.nextDouble();
		double add = num1+num2;
		double mul = num1*num2;
		double sub = num1-num2;
		double div = num1/num2;
		System.out.println(add);
		System.out.println(mul);
		System.out.println(sub);
		System.out.println(div);
	}
}
}
