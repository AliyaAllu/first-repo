
import java.io.*;
import java.lang.*;
class evensum
{
public static void main(String args[])
{
int n,ev;
even e=new even();
ev=e.evno();
System.out.println("sum of even is: " +ev);
}
}
class even
{
public int evno()
{
 
 int i, n, sum=0;  
DataInputStream dis=new DataInputStream(System.in);
try
{
    System.out.println("Enter any number: ");  
    n=Integer.parseInt(dis.readLine());  
    for(i=2; i<=n; i+=2)  
    {  
        sum += i;  
    }  
    
    
}catch(IOException e)
{
System.out.println(e);
}
return sum;
}}


