import java.util.*;
class Neven
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int i,n,d,square,c=0;
  System.out.println("Enter the Number");
  n=sc.nextInt();
  square=n*n;
for(i=square;i>0;i=i/10)
{
d=i%10;
c=c+d;
}
if(c==n)
{
System.out.println("It is a Neven Number");
}
else
{
System.out.println("Not a Neven Number");
}
}
}