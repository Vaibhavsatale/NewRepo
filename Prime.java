import java.util.Scanner;
class Prime 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter a Number : ");
        try 
        {
            int num = sc.nextInt();
            int count = 0;
            for(int i = 1 ; i<=num ; i++)
            {
                if(num%i==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println(num+" is a Prime Number");
            }
            else
            {
                System.out.println(num+" is not a Prime Number");
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Invalid Input");
        }
        sc.close();
    }    
}
