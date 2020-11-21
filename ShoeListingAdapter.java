/**
 * 
 * @author Cole
 * Implements the ProductListing interface
 * Used to get the shoe information
 */
public class ShoeListingAdapter implements ProductListing {
	private ShoeListing shoe;
	private String title, brand, description;
	private double price;
	
	/**
	 * Calls shoe toString method to get the data, uses substring and indexOf to gather the required information
	 * @param shoe - calls private instance of shoe
	 */
	public ShoeListingAdapter(ShoeListing shoe) {
		String s = shoe.toString();
		title = s.substring(s.indexOf("Shoe:")+6, s.indexOf("By:"));
		price = Double.parseDouble(s.substring(s.indexOf("$")+1));
		brand = s.substring(s.indexOf("By:")+4, s.indexOf("Details:"));
		description = s.substring(s.indexOf("Details:")+9, s.indexOf("Cost:"));
	}
	
	/**
	 * Returns the title of the shoe
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Returns the description of the shoe
	 * @return
	 */
	public String getDescription() {
		return "Created by " + brand + ", " + description;
	}
	
	/**
	 * Returns the price of the shoe
	 * @return
	 */
	public double getPrice() {
		return price;
	}
	
	
}
