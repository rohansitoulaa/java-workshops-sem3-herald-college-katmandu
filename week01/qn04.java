package week01;

public class qn04 {
	public static void main(String[] args) {
		double a = 5;
		double b= 10;
		double c= 300;
		double s = (a+b+c)/2;
		double A_s = (s*((s-a)* (s-b)*(s-c)));
		double A = Math.sqrt(A_s);
		System.out.println(A);
	}
}
