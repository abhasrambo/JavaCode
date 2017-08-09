package largestAmongThree;

import java.util.Scanner;
 
class print
{
   public static void main(String args[])
   {
      int x, y, z;
      System.out.println("Enter three integers ");
      Scanner in = new Scanner(System.in);
 
      x = in.nextInt();
      y = in.nextInt();
      z = in.nextInt();
 
      if ( x > y && x > z )
      { System.out.println("First number is largest.");
      	if ( y > z)
      	{
      		System.out.println("Second number is second largest");
      		System.out.println("Third number is third largest");
      	}
      	else
      		System.out.println("Third number is second largest");
      	    System.out.println("Second number is Third largest");
      }	
      else if ( y > x && y > z )
      { System.out.println("Second number is largest.");
    	if ( x > z)
    	{
    		System.out.println("first number is second largest");
    		System.out.println("Third number is third largest");
    	}
    	else
    		System.out.println("Third number is second largest");
    	    System.out.println("first number is Third largest");
    }	
      else if ( z > x && z > y )
      { System.out.println("Third number is largest.");
    	if ( x > z)
    	{
    		System.out.println("first number is second largest");
    		System.out.println("second number is third largest");
    	}
    	else
    		System.out.println("Third number is second largest");
    	    System.out.println("first number is Third largest");
    }	
      else   
         System.out.println("Entered numbers are not distinct.");
   }
}
