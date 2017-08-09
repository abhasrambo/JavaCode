import java.util.Scanner;
public class Sum
{
    public static void main(String[] args) 
    {
        int a,b,sum;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two numbers");
        a = s.nextInt();
        b = s.nextInt();
        sum = a + b;
        System.out.print("Sum of the two numbes" + sum);
        
    }
}