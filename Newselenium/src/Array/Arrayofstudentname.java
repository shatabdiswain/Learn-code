package Array;

public class Arrayofstudentname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]=new String[3];
		names[0]="j";
		names[1]="k";
		names[2]="o";
		
		int[]roll=new int[3];
		roll[0]=1;
		roll[1]=2;
		roll[2]=3;
		
		char gender[]= new char[3];
		gender[0]='f';
		gender[1]='m';
		gender[2]='m';
		for(int i=0;i<=2;i++)
		{
			System.out.println(names[i]+" "+
		roll[i]+" "+gender[i]);
		}
		
		
	}

}
