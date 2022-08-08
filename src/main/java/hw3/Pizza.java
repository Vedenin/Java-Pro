package hw3;

public class Pizza {
	private String size;
	private int cheese;
	private int pepperoni;
	private int ham;
	
	public Pizza() {
		size = "s";
		cheese = 0;
		pepperoni = 0;
		ham = 0;
	}
	
	public Pizza(String size, int cheese, int pepperoni, int ham) {
		this.size = size;
		this.cheese = cheese;
		this.pepperoni = pepperoni;
		this.ham = ham;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public int getCheese() {
		return cheese;
	}
	
	public void setCheese(int cheese) {
		this.cheese = cheese;
	}
	
	public int getPepperoni() {
		return pepperoni;
	}
	
	public void setPepperoni(int pepperoni) {
		this.pepperoni = pepperoni;
	}
	
	public int getHam() {
		return ham;
	}
	
	public void setHam(int ham) {
		this.ham = ham;
	}
	
	@Override
	public String toString() {
		return "Pizza{" +
				"size='" + size + '\'' +
				", cheese=" + cheese +
				", pepperoni=" + pepperoni +
				", ham=" + ham +
				'}';
	}
	
	public int calcPrice() {
		int price = 2 * cheese + 2 * pepperoni + 2 * ham;
		
		if (size.toLowerCase() == "s") {
			return 10 + price;
		} else if (size.toLowerCase() == "m") {
			return 12 + price;
		} else if (size.toLowerCase() == "l"){
			return 14 + price;
		}
		return 0;
	}
}
