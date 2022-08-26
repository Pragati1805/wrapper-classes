
public class Boxing {

	public static void main(String[] args) 
	{
		int i=20;
		Integer io=new Integer(i);		//boxing
		//Integer io=i;					//auto boxing
		int z=io;							//AutounBoxing
		io.intValue();				//un Boxing
	String s="10";
	int x=Integer.parseInt(s);
	int a=100;
	String s1=Integer.toString(a);
	System.out.println(s1+5);
	}

}
