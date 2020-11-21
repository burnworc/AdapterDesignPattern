/**
 * 
 * @author Cole
 * Stores the information for each shoe: brand, name, cost, and description
 */
public class Shoe implements ShoeListing {
	private String brand, name, description;
	private double cost;
	
	/**
	 * 
	 * @param brand - sets the brand of the shoe
	 * @param name - sets the name of the shoe
	 * @param price - sets the price of the shoe
	 * @param description - sets the description of the shoe
	 */
	public Shoe(String brand, String name, double price, String description) {
		this.brand = brand;
		this.name = name;
		this.cost = price;
		this.description = description;
	}
	
	/**
	 * toString to display the shoe information in the listing
	 */
	public String toString() {
		String s = "";
		s = s + "Shoe: " + name;
		s = s + "By: " + brand;
		s = s + "Details: " + description;
		s = s + "Cost: $" + cost;
		return s;
	}
}
