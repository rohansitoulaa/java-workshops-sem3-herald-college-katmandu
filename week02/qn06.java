//Create a final class FinalClass. Attempt to extend it with another class and
//observe the compiler error. Also, create a final method within a class and try
//to override it in a subclass.

package week02;

final class FinalClass{
		final public void method() {
			
		}
}
class OtherClass extends FinalClass{
	public void method() {
		
	}
}
public class qn06 {
	
}
