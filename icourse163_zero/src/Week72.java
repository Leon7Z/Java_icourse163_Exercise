import java.util.Scanner;

public class Week72 {
    public static boolean isWan (int a)
    {
        boolean flag = false ;
        int sum = 0 ;
        for (int i =1; i<a; i++)
        {
            if( a % i == 0)
            {
                sum += i;
            }
        }
        if(sum == a)
        {
            flag = true;
        }
        return flag;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int is=0;
        for ( int i = n; i<= m ; i++)
        {
            if (isWan(i))
            {
                if(is==2)
                {
                    System.out.print(" ");
                }
                System.out.print(i);
                is=1;
                is++;
            }
        }
        if(is==0)
        {
            System.out.println();
        }
    }
}