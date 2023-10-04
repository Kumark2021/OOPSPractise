package io.OOPS.Inheritence;

public class MainInheritenceDemo {

	public static void main(String[] args) {

		Mountaincycle mcycle=new Mountaincycle(30,20,10);
		System.out.println("Gear is :" + mcycle.gear);
		System.out.println("SeatHeight is :" + mcycle.seatHeight);
		System.out.println("Speed is :" + mcycle.speed);
		mcycle.applyBreak(2);
		System.out.println("After applying the breat the speed is" +mcycle.speed);
		
		
	}

}
