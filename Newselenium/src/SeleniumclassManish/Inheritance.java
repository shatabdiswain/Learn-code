package SeleniumclassManish;

class ice{
	static void add() {
		System.out.println("add");
	}
}
public class Inheritance extends ice{

	static void sub() {
		System.out.println("sub");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		sub();
		add();
	}

}
