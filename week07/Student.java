package week07;

/**
 * Tells about student information like student id , and average marks obtained
 */
public class Student extends Person{
		int studentNumber;
		int averageMark;
		/**
		 * Tells if certain student is eligible to take seminar or not
		 * @param eligible 
		 * @return
		 */
		
		boolean isEligibleToEnroll() {
			if(averageMark <10) {
				return false;
			}
			else {
				return true;
			}
		}
		/**
		 * 
		 * @return count number if seminars taken
		 */
		int getSeminarsTaken(){
			int count=0;
			boolean numbers = isEligibleToEnroll();
			if(numbers) {
				count++;
			}
			return count;
		}
}
