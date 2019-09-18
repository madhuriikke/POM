package pom.edusol.rough;

public class Test {

	public static void main(String[] args) {
		
		Car c= new Car();
		/*
		 * c.start(); c.stop(); c.dashboard();
		 */
		Brake b= new Brake();
		Car c1 =new Car(b);
		c1.accessBrake();
		

	}

}
