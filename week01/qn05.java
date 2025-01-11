package week01;
import java.util.Scanner;
//java.util.*;
public class qn05 {
	public static void main(String[] args) {
		try (Scanner user = new Scanner (System.in)) {
			System.out.println("Enter an area : ");
			double userInput = user.nextDouble();
			double area_of_square = userInput*userInput;
			System.out.println(area_of_square);
		}
		
	}
}
	