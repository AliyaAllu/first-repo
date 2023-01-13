import java.io.*;
import java.lang.*;
class array
{
public static void main(String args[])
{
int a[];
int n,i;
DataInputStream dis=new DataInputStream(System.in);
try
{
System.out.println("enter the size");
n=Integer.parseInt(dis.readLine());
a= new int[n];
System.out.println("enter the elements");
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(dis.readLine());
}
for(i=0;i<n;i++)
{
System.out.println("a[i] =" +a[i]);}

}catch(IOException e)
{
System.out.println(e);
}}
}
