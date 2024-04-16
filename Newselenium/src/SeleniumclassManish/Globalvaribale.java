package SeleniumclassManish;

public class Globalvaribale {
	String name="b";
	int age=1;
	double weight=90.3;
	void add(String name,int age,double weight) {
		System.out.println("het my bio data is "+name+age+weight);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Globalvaribale g1=new Globalvaribale();
		System.out.println(g1.name);
		System.out.println(g1.age);
		//g1.add("ram",2,22.23);

	}

}
