import java.lang.*;
import java.util.Scanner;

public class Regula_Falsi
{
    public static float f(float x)
    {
        return (x*x-x-1);
    }
    public static void main(String[] args)
    {
        float a, b, m ,e;
        int i=0;
        Scanner read= new Scanner(System.in);
        System.out.println("Enter initial point a :");
        a=read.nextFloat();
        System.out.println("Enter Final point b :");
        b=read.nextFloat();
        System.out.println("Enter Error e :");
        e=read.nextFloat();
        float mul=f(a)*f(b);
        while(mul<0)
        {
            m=(a*f(b)-b*f(a))/(f(b)-f(a));
            i=i+1;
            float k=Math.abs(f(m));
            if(k>e)
            {
                System.out.println("i :"+i);
                System.out.println("a :"+a);
                System.out.println("b :"+b);
                System.out.println("m :"+m);
                System.out.println("f(m) :"+f(m));
                System.out.println("f(a)*f(m) :"+f(a)*f(m));
                if((f(a)*f(m))>0)
                {
                    a=m;
                }
                else
                {

                    b=m;
                    break;
                }
                System.out.println("Root :"+m);
            }
            else
            {
                System.out.println("Root :"+m);
                break;
            }
        }
        System.out.println("Invalid Internals");
    }
}
