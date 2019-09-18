package pom.edusol.rough;

public class Car extends vehicle {

	public Brake b;
	
	public Car() {
		
	}

	public Car(Brake b) {
		this.b = b;
	}

	public void dashboard() {
		System.out.println("car has dashboard");

	}
	public void accessBrake() {
		b.applybrake();
	}

}
