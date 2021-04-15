import java.util.Scanner;

class Main 
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    System.out.println( "What is you balance (must be greater than 7 and only whole numbers)");
    //will save users input
    int balance = scan.nextInt();

    System.out.println( " Price per gallon of gas (must be less than 5 and only whole numbers)");
    //will save users input
    int priceGas = scan.nextInt();

   //change your gallons to just gallons 
    int gallons = yourGallons(balance, priceGas) ;
    System.out.println( " You can afford " + gallons + " gallons of gas");
    
    gas(gallons);
    
  
  }
  static int yourGallons(int balance, int priceGas) 
  {
  // will divide balance by price of gas
   return balance/priceGas;
  }
public static void gas(int gallons  )
  {
    //will stop when gallons equal 0
    if(gallons==0)
    {
      System.out.println("Your car is full");
    }
    //if gallons does not equal 0 this will print
    else
    {
      System.out.println("You added another gallon");
      //subtracts 1 from gallons
      gallons--;
      gas(gallons);
  
    }
  }
  
}
