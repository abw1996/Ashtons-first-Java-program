public class Csc
{
	private double top, bottom;

	public Csc(double top,double bottom) {
		this.top = top;
		this.bottom = bottom;
	}
	
	public Csc() {
		
	}
	
	public double getTop() {
		return this.top;
	}
	
	public double getBottom() {
		return this.bottom;
	}
	
	public boolean hasTop() {
		if (this.top == 0) {
			return false;
		} else {return true;}
	}

	public boolean hasBottom() {
		if (this.bottom == 0) {
			return false;
		} else {return true;}
	}
	
	public void setTop(double num) {
		this.top = num;
	}

	public void setBottom(double num) {
		this.bottom = num;
	}
}
