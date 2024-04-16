package Stringfunctions;

public class Stringfun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="school";
		int a =name.length();
		System.out.println(a);
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf('o'));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.concat("shatabdi"));
        String first_name="SHatabdi";
        String last_name="Swain";
        System.out.println(first_name.concat(" ").concat(last_name));
        System.out.println(name.contains("Sch"));
	}

}
