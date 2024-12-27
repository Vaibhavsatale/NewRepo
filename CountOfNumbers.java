import java.util.*;
class CountOfNumbers 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        try 
        {
        int num = sc.nextInt();
        int count = 0;
        for(int i =num ; i>0 ; i/=10)
        {
            count++;
        }
        System.out.println("Count of Numbers : "+count);
        } catch (InputMismatchException e) {
           System.out.println("Invalid Input");
        }
        sc.close();
    }    
}
