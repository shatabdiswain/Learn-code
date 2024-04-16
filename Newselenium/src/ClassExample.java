
public class ClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int i=0;
		System.out.println(i);
		i=10;
		System.out.println(i);
		i=100;
		System.out.println(i);
		String n="Hello World!";
		System.out.println(n);
		String s=new String("Hello world");
		System.out.println(s);*/
		ClassExample cls=new ClassExample();
		String a= new String(getData());
		System.out.println(a);
		/*String outputfrommethod=getData();
		System.out.println(outputfrommethod);*/
		getData();
		

	}
	public static String getData() {
		System.out.println("Using Data");
		return "Using return";
	}
}
