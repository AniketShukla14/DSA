import java.util.*;
class Pythagoras
{
 Scanner sc=new Scanner(System.in);
 int a=sc.nextInt();
 int b=sc.nextInt();
 int c=sc.nextInt();
 int max=a;
 if(max<=b)
 {
     max=b;
 }
if(max<=c)
 {
     max=c;
 }
if(max==a)
{
boolean flag=((c*c)+(b*b)==a*a);
System.out.println("a it the longest side");
}
else if(max==b)
{
    boolean var=((c*c)+(a*a)==b*b);
    System.out.println("b it the longest side");
}
else 
{
    boolean vat=((a*a)+(b*b)==c*c);
    System.out.println("c it the longest side");
}
sc.close();
};
