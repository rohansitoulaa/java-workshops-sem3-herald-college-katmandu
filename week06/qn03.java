package week06;
interface Eat{
	public void eat(String message);
	
}
interface Sleep{
	public void sleep(String message);
}
interface Fly{
	public void fly(String message);
}
interface Hunt{
	public void hunt(String message);
}

class Eating implements Eat{
	@Override
	public void eat(String message) {
		System.out.println(message);
	}
}
class Sleeping implements Sleep{
	@Override
	public void sleep(String message) {
		System.out.println(message);
	}
}
class Deer{
	Eat eating;
	Sleep sleeping;
	
	public Deer(Eat eating , Sleep sleeping) {
		this.eating = eating;
		this.sleeping = sleeping;
	}
	public void preformEat(String message) {
		eating.eat(message);
	}
	public void preformSleep(String message) {
		eating.eat(message);
	}
}

public class qn03 {
	public static void main(String[] args) {
		Eat eat = new Eating();
		Sleep sleep = new Sleeping();
		 
		Deer mydeer = new Deer(eat , sleep);
		
		mydeer.preformEat("Deer is Eating");
		mydeer.preformSleep("Deer is Sleeping");
		
	}
}
