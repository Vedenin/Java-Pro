package hw2;

public class ColorDot {
	private int coordinateX;
	private int coordinateY;
	private int rcolor;
	private int gcolor;
	private int bcolor;
	
	public ColorDot() {
	}
	
	public ColorDot(int coordinateX, int coordinateY, int rcolor, int gcolor, int bcolor) {
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
		setRcolor(rcolor);
		setGcolor(gcolor);
		setBcolor(bcolor);
	}
	
	public ColorDot(int rcolor, int gcolor, int bcolor) {
		setRcolor(rcolor);
		setGcolor(gcolor);
		setBcolor(bcolor);
	}
	
	public void setRcolor(int rcolor) {
		if (rcolor >=0 && rcolor <=255) {
			this.rcolor = rcolor;
		}
		else {
			System.err.println("ERROR!");
		}
	}
	
	public void setGcolor(int gcolor) {
		if (gcolor >=0 && gcolor <=255) {
			this.gcolor = gcolor;
		}
		else {
			System.err.println("ERROR!");
		}
	}
	
	public void setBcolor(int bcolor) {
		if (bcolor >=0 && bcolor <=255) {
			this.bcolor = bcolor;
		}
		else {
			System.err.println("ERROR!");
		}
	}
	
	public void setCoordinateX(int coordinateX) {
		this.coordinateX = coordinateX;
	}
	
	public void setCoordinateY(int coordinateY) {
		this.coordinateY = coordinateY;
	}
	
	public int getCoordinateX() {
		return coordinateX;
	}
	
	public int getCoordinateY() {
		return coordinateY;
	}
	
	public int getRcolor() {
		return rcolor;
	}
	
	public int getGcolor() {
		return gcolor;
	}
	
	public int getBcolor() {
		return bcolor;
	}
	
	public void changeColor (int red, int green, int blue) {
		setRcolor(red);
		setGcolor(green);
		setBcolor(blue);
	}
	
	@Override
	public String toString() {
		return "ColorDot{" +
				"coordinateX=" + coordinateX +
				", coordinateY=" + coordinateY +
				", rcolor=" + rcolor +
				", gcolor=" + gcolor +
				", bcolor=" + bcolor +
				'}';
	}
	
	public void getProperties () {
		System.out.println("Red: " + getRcolor() + " Green: " + getGcolor() + " Blue: " + getBcolor());
		System.out.println("Coordinate X: " + getCoordinateX() + " Y: " + getCoordinateY());
		System.out.println();
	}
}
