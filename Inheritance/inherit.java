package Inheritance;

class Grant_parent
{
	static void add()
	{
		System.out.println("add");
	}
	
}

class Parent_lass extends Grant_parent
{
	static void mul() {
		System.out.println("mul");
	}
	
}
public class inherit extends Parent_lass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		add();
		mul();
	}

}
