package io.OOPS.Inheritence;

class Mountaincycle extends Bicycle {
	
	public int seatHeight;

	public Mountaincycle(int seatHeight,int gear, int speed) {
		super(gear, speed);
		this.seatHeight=seatHeight;
	}
	
	public void setHeight(int newValue)
	{
		seatHeight=newValue;
	}

}
