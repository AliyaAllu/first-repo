import java.io.*;
import java.lang.*;
class palindromefn {
 
    static int reversNumber(int n)
    {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev;
    }
 
    public static void main(String[] args)
    {
int n,r;
DataInputStream dis=new DataInputStream(System.in);
try
{
System.out.println("\n enter the no");
n=Integer.parseInt(dis.readLine());
r= reversNumber(n);
        System.out.println("Reverse of n = " + r);
        if (n == r)
            System.out.println("Palindrome = Yes");
        else
            System.out.println("Palindrome = No");
    }catch(IOException e)
{System.out.println(e);}
}
}
