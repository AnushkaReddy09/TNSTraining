package tns;
//no output
public class Keywords {
	
		void display() {
			System.out.println("This is Parent class");
		}

		
		static void StaticMethod() {
			System.out.println("This is Static method");
		}
		
		
		class Child extends Keywords{
			void display() {
				super.display();  //super
				System.out.println("This is Child class");
			}
		
			void show() {  
				this.display();   //this
			
	         }
		
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Keywords key = new  Keywords();
		Child  ch = key.new  Child();
		if(ch instanceof Child) {
			System.out.println("Key is an instance of Child");
		}
		
		
		Child obj = key.new Child();
		obj.show();               //This & super
		
		Child.StaticMethod();     //Static
		
		final int value = 9;      //Final
		System.out.println("The final value is :"+ value);
		
	
}
}	
