package regularExpression;

import java.util.regex.*;  
class RegEx{  
   public static void main(String args[]){  
      String content = "This is Chaitanya " +
	    "from Beginnersbook.com.";

      String pattern = ".*book.*";

      boolean isMatch = Pattern.matches(pattern, content);
      System.out.println("The text contains 'book'? " + isMatch);
      
      String contentOne = "This is a tutorial Website!";
      String patternString = ".*tuToRiAl.*";
      Pattern patternOne = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
      Matcher matcher = patternOne.matcher(contentOne);
      boolean isMatched = matcher.matches();
      System.out.println("Is it a Match?" + isMatched);
   }
}  