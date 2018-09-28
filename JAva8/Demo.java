package JAva8;


//This is a functional Interace
public class Demo {

	public static void main(String[] args) 
	{
		
		operation op =(a,b) -> a+b; 
	
		
	System.out.println(op.add(2,3));

	}

}

interface operation
{
	int add(int a,int b);
	}

