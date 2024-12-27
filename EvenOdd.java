import java.util.*;
class EvenOdd
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number : ");
    try {
    int num = sc.nextInt();
    if((num/2)*2==num)
    System.out.print(num+" is a even number");
    else
    System.out.print(num+" is a odd Number");
    } catch (InputMismatchException imme) 
    {
        System.out.println("Invalid Input");
    }
    sc.close();
  }
}
