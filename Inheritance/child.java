package Inheritance;
class parent_class
{
	
void mul() {
	
}

void div() {
	
}
}


public class child extends parent_class{
	static void sub() {
		System.out.println("sub");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child w=new child();
		w.div();
		sub();

	}

}
