package tns;

public class Polymorphism{
	
	//overloading
	public int add(int a, int b) {
		int result = a+b;
		return result;
	}
	public float add(float a, float b,float c) {
		float result1 = a+b+c;
		return result1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism a = new Polymorphism();
		System.out.println(a.add(12,3));
		System.out.println(a.add(1.2f,1.0f,3.4f));
		
		Movie m = new Theatre();
		m.sing();
	}
}	
      //over riding
		class Movie{
			void sing() {
			System.out.println("She is singing");
			
		}
	}
		class Theatre extends Movie{
		public void sing() {
			System.out.println("She is singing a melody song");
			
		}
		}

