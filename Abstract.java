package tns;

public class Abstract {

	abstract class Eat{
		abstract void eat();
	}
	class Food extends Eat{
		void eat() {
			System.out.println("Ice cream");
		
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract obj = new  Abstract();
		Food fo = obj.new Food();
		fo.eat();

	}


}