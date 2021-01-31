package sajid;
import java.util.*;

public class happy {
	public static int check(int n)
    {
        int r=0;
        int sum=0;
        while(n>0)
        {
          r=n%10;
          n=n/10;
          sum=sum+(r*r);
        }
        return sum;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=check(n);
        while(sum/10 >0)
        {
            sum=check(sum);
        }
        if(sum==1)
            System.out.println("happy number");
        else
            System.out.println("not a happy number and final number is "+sum);
    }
}
