import java.util.*;
class solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int or1=a;
        int or2=b;
        while(a%b!=0)
        {
            int rem=a%b;
            a=b;
            b=rem;
        }
        int gcd=b;
        int lcm=(or1*or2)/gcd;
        sc.close();
        System.out.println(gcd);
        System.out.println(lcm);
    }
}