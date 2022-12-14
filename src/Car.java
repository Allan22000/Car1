
public class Car {
String brand;
String model;
int amountOfFuel;

public Car() {
	
}
public Car (String brand,String model,int amountOfFuel) {
	this.brand=brand;
	this.model=model;
	this.amountOfFuel=amountOfFuel;
	printData();
	
	
	
	
}

// brake method
//second comment
//Third comment

public void brake() {
	System.out.println("Car is braking");
}
public void accelerate() {
	System.out.println("Car is accelerating");
	amountOfFuel--;
}
public void refuel(int amount) {
	System.out.println("Fuel on the tank "+ amountOfFuel);
	System.out.println("Refuel: " + amount);
	amountOfFuel+=amount;
	System.out.println("Fuel in tank after the refuel " + amountOfFuel);
	
	
	
}
public void printData() {
	System.out.println("The brand is "+brand+". ");
	System.out.println("The model is "+model+".");
    System.out.println("The amount of fuel"+amountOfFuel+".");
    
 
	
}
}
