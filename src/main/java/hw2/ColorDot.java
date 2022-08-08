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
		if (rcolor < 0) {
			this.rcolor = 0;
		}
		else if (rcolor > 255){
			this.rcolor = 255;
		}
		else {
			this.rcolor = rcolor;
		}
	}
	
	public void setGcolor(int gcolor) {
		if (gcolor < 0) {
			this.gcolor = 0;
		}
		else if (gcolor > 255){
			this.gcolor = 255;
		}
		else {
			this.gcolor = gcolor;
		}
	}
	
	public void setBcolor(int bcolor) {
		if (bcolor < 0) {
			this.bcolor = 0;
		}
		else if (bcolor > 255){
			this.bcolor = 255;
		}
		else {
			this.bcolor = bcolor;
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
