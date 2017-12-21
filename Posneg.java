import java.io.*;
import java.util.*;
class Posneg
{
	public static void main (String[] args)
	{
		int a;
        Scanner ob=new Scanner(System.in);
        a=ob.nextInt();
        if(a>0)
        System.out.println("the number is positive:"+a);
        else if(a<0)
        System.out.println("the number is negative:"+a);
        else
        System.out.println("the number is neutral:"+a);
    }
        
}
