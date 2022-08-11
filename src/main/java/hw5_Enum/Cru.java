package hw5_Enum;

public enum Cru {
	BASE(80), PREMIER(90), GRAND(100);
	
	final int quality;
	
	Cru(int quality) {
		this.quality = quality;
	}

}
