package tns;

public class DemoInheritance {
	
	class Animal{
		void sound()
		{
			System.out.println("Animals makes a sound");
		}
		
	}
	class Dog extends Animal{
		void shout()
		{
			System.out.println("Dogs bark");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoInheritance outer = new DemoInheritance();
		Dog R = outer.new Dog();
		R.sound();
		R.shout();
		

	}

}
