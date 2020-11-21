/**
 * 
 * @author Cole
 * Will hold the information of each product, it implements the ProductListing interface.
 */
public class Product implements ProductListing {
	private String title, description;
	private double price;
	
	/**
	 * 
	 * @param title - sets the title of the product
	 * @param price - sets the price of the product
	 * @param description - sets the description of the product
	 */
	public Product(String title, double price, String description) {
		this.title = title;
		this.price = price;
		this.description = description;
	}
	
	/**
	 * Returns the title
	 * @return
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Returns the description
	 * @return
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Returns the price
	 * @return
	 */
	public double getPrice() {
		return price;
	}
}
