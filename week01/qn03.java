package week01;

public class qn03 {
	public static void main(String[] args) {
		int num = 10;
		double nums = 10.6;
		char character = 'A';
		System.out.println(((Object)num).getClass().getName());
		System.out.println(((Object)nums).getClass().getName());
		System.out.println(((Object)character).getClass().getName());
	}
}
