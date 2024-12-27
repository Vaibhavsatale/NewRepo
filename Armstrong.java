import java.util.*;
class Armstrong 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        try 
        {
            int num = sc.nextInt();
            int temp = num;
            int sum = 0 ;
            int count = 0;
            for(int i = num ; i>0 ; i/=10)
            {
                count++;
            }
            while (num > 0) 
            {
                int rem = num%10;
                int pow = 1;
                for(int i = 1 ; i<=count ; i++)
                {
                    pow *= rem;
                }    
                sum += pow;
                num/=10;
            }
            if (sum == temp)
            {
                System.out.println(temp+" is a Armstrong Number");
            }
            else
            {
                System.out.println(temp+" is not a Armstrong Number");
            }
        }
        catch (InputMismatchException e) 
        {
           System.out.println("Invalid Input");
        }
        sc.close();
    }    
}
