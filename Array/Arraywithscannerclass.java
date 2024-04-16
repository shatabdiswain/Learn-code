package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Arraywithscannerclass {

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
		System.out.println(Arrays.toString(roll));
		
		

	}

}
