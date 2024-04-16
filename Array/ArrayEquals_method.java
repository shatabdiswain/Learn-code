package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEquals_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int roll[]=new int[3];
		for(int i=0;i<=2;i++) 
			
		{
			System.out.println("enter the Array->" +i);
			roll[i]=s1.nextInt();
			//System.out.println(roll[i]);
		}
		
		
		
		int rollno[]=new int[3];
		System.out.println("starting the second Array");
		for(int i=0;i<=2;i++) 
			
		{
			System.out.println("enter the Array->" +i);
			rollno[i]=s1.nextInt();
			//System.out.println(rollno[i]);
		}
		System.out.println(Arrays.toString(roll));
		
		System.out.println(Arrays.toString(rollno));
		
		if(Arrays.equals(roll,rollno)==true) {
			System.out.println("equals");
		}
		else {
			System.out.println("not equals");
		}

	}

}
