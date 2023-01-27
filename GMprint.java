import java.io.*;

class GMprint
{
	public static <G> /* Give any data variable "Here G " can also give like Gii,etc */ printa(G[] a) //generic method
	{
		for(G a:el) //for data type arrayname :element)
		{
			System.out.println(el);
		}
	public static void main(String args[])
	{
		int i = 100;
	//more than 1 data type
	// same logic , only data type differs
		int[] ia = {1,2,3,4};
		double[] da = {1.2,2.4,5.4,6.7};
		char[] ca = {'a','b','c','d'};
	}
	//generic method
	printa(ia);
	printa(da);
	printa(ca);
	
}