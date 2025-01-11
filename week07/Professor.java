package week07;

/**
 * Professor class involves description about a particular professor , which includes professor's salary , his staff number , experience and lectures he gives.
 */
public class Professor extends Person {
	double Salary;
	int staffNumber;
	private int yearsOfServices;
	int numberOfClasses;
	
	/**
	 * 
	 * @return getter method 
	 */
	public int getYearsOfServices() {
		return yearsOfServices;
	}
	/**
	 * 
	 * @param yearsOfServices
	 */
	public void setYearsOfServices(int yearsOfServices) {
		this.yearsOfServices = yearsOfServices;
	}
}
