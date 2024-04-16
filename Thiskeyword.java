package SeleniumclassManish;
public class Thiskeyword {
	Thiskeyword()
	{
		
		System.out.println("1");
	}
	Thiskeyword(int a)
	{
		this(1.1);
		System.out.println("2");
	}
	Thiskeyword(double a)
	{	this();
		System.out.println("3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thiskeyword s= new Thiskeyword(3);

	}

}
