package week06;


interface Swim {
	public void swim();
}
interface Quack{
	public void quack();
}
class WoodenDuck implements Swim{
	   @Override
	   public void swim() {
//	      throw new UnsupportedOperationException("Wooden ducks don't quack");
		   System.out.println("Wooden ducks can swim");
	   }
	}

public class qn06 {
public static void main(String[] args) {
	WoodenDuck myDuck = new WoodenDuck();
	myDuck.swim();
}
}
