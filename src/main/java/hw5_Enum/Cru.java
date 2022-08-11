package hw5_Enum;

public enum Cru {
	BASE(80), PREMIER(90), GRAND(100);
	
	 private final int quality;
	
	Cru(int quality) {
		this.quality = quality;
	}
	public int getQuality() {
		return quality;
	}
}
