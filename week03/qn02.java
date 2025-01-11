package week03;
class Car{
	private String model;
	private int price;
	private String fuelLevel="24";
	
	public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

	public String getFuelLevel() {
		return fuelLevel;
	}	

}

public class qn02{
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setModel("BMW");
		myCar.setPrice(123456);
		System.out.println(myCar.getFuelLevel());
		System.out.println(myCar.getModel());
		System.out.println(myCar.getPrice());
		
	}
}