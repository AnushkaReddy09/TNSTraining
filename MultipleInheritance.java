package tns;

interface MultipleInheritance {
	void human();

}
interface Monkey {
	public void human();
	
}
class HumanBeings implements Monkey,MultipleInheritance{
	public void human() {
		System.out.println("Humans Behave like monkey");
	}
	
}

