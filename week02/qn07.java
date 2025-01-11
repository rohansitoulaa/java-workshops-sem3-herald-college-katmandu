package week02;


class Calculator{
	double num1;
	double num2;
	public void add(int num1,int num2) {
		System.out.println("two int "+(num1+num2));
	}
	public void add(int num1,int num2,int num3) {
		System.out.println("three int "+(num1+num2+num3));
	}
	public void add(double num1,double num2) {
		System.out.println("two double "+(num1+num2));
	}
	public void add(double num1,double num2,double num3) {
		System.out.println("three double "+(num1+num2+num3));
	}

	
}
public class qn07 {
	public static void main(String[] args) {
		
		Calculator myCalc= new Calculator();
		myCalc.add(2,3);
		myCalc.add(2,3,3);
		myCalc.add(2.6,3.4);
		myCalc.add(2.7,3,3.4);
	}
}
