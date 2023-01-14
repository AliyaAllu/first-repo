import java.io.*;
import java.lang.*;

class arraysearch 
{  
	public static void main(String args[])
	{
		DataInputStream dis=new DataInputStream(System.in);
            int i,n,s,flag=0;
try
{
		System.out.println("Enter the number of elements:") ;
 		n = Integer.parseInt(dis.readLine());
		int[] a = new int[n];
 
    		System.out.println("Enter the elements") ;
    		for(i=0;i<n;i++)
    		{
        		a[i] = Integer.parseInt(dis.readLine());
    		}
		
		System.out.println("Enter the element to be seached");
		s =Integer.parseInt(dis.readLine());
    
    	
    		for(i=0;i<n;i++)
    		{
        		if(a[i]==s)
        		{
            			System.out.println("Element "+s+" found at "+i+" position");
            			flag=1;
            			break;
        		}
    		}
    		if(flag==0)
    		{
        		System.out.println("Element "+s+" not found");
    		}
           }catch(IOException e)
{
System.out.println(e);
}
	}

}