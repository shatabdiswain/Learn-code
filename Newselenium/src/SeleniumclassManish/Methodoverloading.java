package SeleniumclassManish;

public class Methodoverloading {
	int age=19;
	void add() {
		int a=100;
		System.out.println(a+6);
	}
	void add(int a)
	{
		System.out.println(a+6);
	}
	static void add(double a) {
		System.out.println(a+6);
	}
	public static void main(String [] args) {
		// TODO Auto-generated method stub
     add(0.9);
     Methodoverloading n=new Methodoverloading();
     n.add();
     n.add(90000);
     
     
	}

}
