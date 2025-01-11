//Create a class Animal with properties like name and age. 
//Create a subclass Dog that inherits from Animal and adds a property breed.
//Demonstrate the use of constructors in both the Animal and Dog classes.
package week02;
class Animal{
	String name;
	int age;
	public Animal(String name , int age) {
		this.name= name;
		this.age = age;
		System.out.println("this is from super class");
	}
	public String toString() {
	    return ("The name of the dog is " + name + ", which is " + age + " years old");
	}
	
}
class Dog extends Animal{
	String breed;
	public Dog(String name, int age,String breed) {
		super(name,age);
//		super(name, age);
		this.breed = breed;
		System.out.println("this is from sub class");
	}
	public String toString() {
	    return ("The name of the dog is " + name + ", which is " + age + " years old "+breed);
	}

}
	
class qn01{
	public static void main(String[] args) {
		Dog myDog = new Dog("uttu",22,"aryal");
		System.out.println(myDog);
	}
}
	