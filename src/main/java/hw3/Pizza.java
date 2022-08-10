package hw3;

public class Pizza {
	private static final int PRICE_CHEESE = 2;
	private static final int PRICE_PEPPERONI = 2;
	private static final int PRICE_HAM= 2;
	private static final int PRICE_SMALL = 10;
	private static final int PRICE_MEDIUM = 12;
	private static final int PRICE_LARGE = 14;
	private final String size;
	private final int cheese;
	private final int pepperoni;
	private final int ham;
	
	public Pizza(String size, int cheese, int pepperoni, int ham) {
		this.size = size;
		this.cheese = cheese;
		this.pepperoni = pepperoni;
		this.ham = ham;
	}
	
	@Override
	public String toString() {
		return "Pizza{" +
				"size='" + size + '\'' +
				", cheese=" + cheese +
				", pepperoni=" + pepperoni +
				", ham=" + ham +
				", price=" + this.calcPrice() +
				'}';
	}
	
	public int calcPrice() {
		int price = PRICE_CHEESE * cheese + PRICE_PEPPERONI * pepperoni + PRICE_HAM * ham;
		return switch (size.toLowerCase()) {
			case "s" -> PRICE_SMALL + price;
			case "m" -> PRICE_MEDIUM + price;
			case "l" -> PRICE_LARGE + price;
			default -> 0;
		};
	}
}
