package ro.acs.ase.Classes;

public class Wolf implements Runner {

	final int WOLF_SPEED = 100;
	
	public Wolf() {
		
	}
	
	@Override
	public int getSpeed() {
		return this.WOLF_SPEED;
	}

	@Override
	public String toString() {
		return "" + WOLF_SPEED;
	}
}
