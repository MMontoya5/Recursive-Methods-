import java.util.Scanner;

class Main 
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    System.out.println( "What is you balance (must be greater than 10 and only whole numbers)");
    int balance = scan.nextInt();

    System.out.println( " Price per gallon of gas (must be less than 5 and only whole numbers)");
    int priceGas = scan.nextInt();

    int gallons = yourGallons(balance, priceGas) ;
    System.out.println( " You can afford " + gallons + " gallons of gas");
    
    System.out.println(gas(int gallons));
  
  }
  static int yourGallons(int balance, int priceGas) 
  {
   return balance/priceGas;
  }

  public static void gas(int gallons)
  {
    if(gallons>balance)
    {
      System.out.println("Your car is full");
    }else
    {
      System.out.println("You added another gallon");
      balance--;
      gas(gallons);
    }
  }
}
