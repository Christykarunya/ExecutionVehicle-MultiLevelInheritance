package week3.day1;

public class ExecutionVehicleClass {

	public static void main(String[] args) {
		BMW b=new BMW();
		b.accelerate();
		b.applyBrake();
		b.closeDoor();
		b.driverVehicle();
		b.enableAirbag();
		b.fillFuel();
		b.shiftGear();
		System.out.println("Car Wheel Count: "+b.WheelCar);
		System.out.println();
		
		Audi a=new Audi();
		a.shiftGear();
		a.accelerate();
		a.applyBrake();
		a.driverVehicle();
		a.closeDoor();
		a.enableAirbag();
		a.fillFuel();
		System.out.println("Car Wheel Count:"+a.WheelCar);
		System.out.println();
		
		Auto autoObj= new Auto();
		autoObj.accelerate();
		autoObj.driverVehicle();
		System.out.println("Auto Wheel Count:"+autoObj.WheelAuto);
			
	}

}
