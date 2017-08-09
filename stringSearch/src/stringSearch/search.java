package stringSearch;

import java.util.*;

enum Directions{
	  EAST, 
	  WEST, 
	  NORTH, 
	  SOUTH
};
public class search
{
 Directions dir;
 public search(Directions dir) {
   this.dir = dir;
 }
 public void getMyDirection() {
   switch (dir) {
     case EAST:
        System.out.println("In East Direction");
        break;
                  
     case WEST:
        System.out.println("In West Direction");
        break;
                       
     case NORTH: 
        System.out.println("In North Direction");
        break;
                      
     default:
        System.out.println("In South Direction");
        break;
   }
 }
  
  public static void main(String[] args) {
      search obj1 = new search(Directions.EAST);
      obj1.getMyDirection();
      search obj2 = new search(Directions.SOUTH);
      obj2.getMyDirection();
      for (Directions dir : Directions.values()) {
  	    System.out.println(dir);
  	}
  }
}