import java.io.*;
import java.lang.*;
 class  smallestno
{
   public static void main(String args[])
 {
String str,str1,str2;
int num1,num2,num3,temp,smallest;

DataInputStream dis=new DataInputStream(System.in);
try
{
System.out.println("enter the first no");
str=dis.readLine();
num1=Integer.parseInt(str);
System.out.println("enter the second no");
str1=dis.readLine();
num2=Integer.parseInt(str1);
System.out.println("enter the third no");
str2=dis.readLine();
num3=Integer.parseInt(str2);
temp=num1<num2?num1:num2;  
smallest=num3<temp?num3:temp;  
  
System.out.println("The smallest number is: "+smallest);  
      
   }catch(IOException e)
{
System.out.println(e);
}}
}
