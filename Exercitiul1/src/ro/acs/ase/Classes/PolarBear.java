package ro.acs.ase.Classes;

public class PolarBear extends Bear {

	final int POLAR_BEAR_SPEED = 40;
	
	public PolarBear() {

	}
	
	@Override
	public int getSpeed() {
		return this.POLAR_BEAR_SPEED;
	}
	
	@Override
	public String toString() {
		return "" + POLAR_BEAR_SPEED;
	}
}
