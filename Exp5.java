
public class Exp5 {

	public static void main(String[] args) {
		
		try {
			System.out.println("str1");
			System.out.println(10/0);
			System.out.println("str3");
		}
catch(Exception e)
		{
	      System.out.println(20/0);
		}
		
		finally 
		{
			System.out.println("st5");
		}
	}

}