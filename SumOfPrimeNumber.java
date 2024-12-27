import java.util.InputMismatchException;
import java.util.Scanner;
class SumOfPrimeNumber 
{
 public static void main(String[] args) 
 {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number : ");
    try 
    {
    int num = sc.nextInt();
    int sum =0;
    String str = " ";
    while (num != 0)
    {
    int rem = num % 10;  
    if (rem > 1 && (rem == 2 || rem/1==rem || rem/rem==1 || rem%2!=0))
    {
        str =rem+" "+str;
        sum += rem;    
    }
    num/=10;
    }
    if (sum == 0)
    {
        System.out.println("No Prime Number Found");
    }
    else
    {
        System.out.println("Prime Number : "+str);
        System.out.println("Sum of Prime Number : "+sum);
    }
    }
    catch (InputMismatchException imme) 
    {
        System.out.println("Invalid Input");
    }
    sc.close();
}
}

