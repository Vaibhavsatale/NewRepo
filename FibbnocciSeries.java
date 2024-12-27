import java.util.*;
class FibbnocciSeries 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number of Series you want : ");
        try 
        {
            int num = sc.nextInt();
            int a = 0;
            int b = 1;
            int c = 0;
            System.out.print(a+" "+b);
            for(int i = 2 ; i<num ; i++)
            {
                c = a+b;
                System.out.print(" "+c);
                a = b;
                b = c;
            }
        } 
        catch (InputMismatchException e) 
        {
            System.out.println("Invalid Input");
        }
        sc.close();
    }    
}
