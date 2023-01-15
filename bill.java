import java.io.*;
import java.lang.*;
final class billpayment
{
public billpayment()
{
System.out.println("BILL");
}
public final void  payment(int b)
{
System.out.println("TOTAL AMOUNT = " +b);
}
}

class bill
{
public static void main(String args[])
{
DataInputStream dis= new DataInputStream(System.in);
int a[];
String s[];
int qu[];
final int amount[];
int tot_amount=0;
int i,n;
try
{
System.out.println("RECEIPT");
System.out.println("Enter the customer name");
String c=dis.readLine();
System.out.println("Enter the no of items");
n=Integer.parseInt(dis.readLine());
a=new int[n];
amount=new int[n];
qu= new int[n];
s= new String[n];
for(i=0;i<n;i++)
{
System.out.println("Enter the product code");
a[i]=Integer.parseInt(dis.readLine());
System.out.println("Enter the product name");
s[i]=dis.readLine();
System.out.println("Enter the amount");
amount[i]=Integer.parseInt(dis.readLine());
System.out.println("Enter the quantity");
qu[i]=Integer.parseInt(dis.readLine());
}
for(i=0;i<n;i++)
{
	tot_amount=tot_amount+amount[i]*qu[i];
}
	
		for(i=0;i<n;i++)
		{   
            System.out.println("CUSTOMER NAME :" +c);
			System.out.println("PRODUCT CODE : " +a[i]);
            System.out.println("PRODUCT NAME :" +s[i]);
            System.out.println("AMOUNT : " +amount[i]);
            System.out.println("QUANTITY : " +qu[i]);

	    }
billpayment b = new billpayment();
b.payment(tot_amount);
}catch(IOException e)
{
	System.out.println(e);
}
}}