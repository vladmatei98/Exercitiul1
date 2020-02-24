package ro.acs.ase.Classes;

public class Grizzly extends Bear {
	
	final int GRIZZLY_SPEED = 50;
	
	public Grizzly() {
	
	}
	
	@Override
	public int getSpeed() {
		return this.GRIZZLY_SPEED;
	}
	
	@Override
	public String toString() {
		return "" + GRIZZLY_SPEED;
	}

}
