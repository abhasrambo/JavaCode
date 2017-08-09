package occurance;
import java.util.*;
public class occurance {
	private static Scanner sc;
	public static int unique(int[] arr){
		int count= 0;
        for(int i=0;i<arr.length;i++){
        	 
            boolean isDistinct = false;
            for(int j=0;j<i;j++){
         
            	
                if(arr[i] == arr[j]){
                    isDistinct = true;
                    break;
                }
                
                
            }
           
            if(!isDistinct){
            	count++;
            }
        }
        return count;
           
        }

	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int[] countOf = new int[n];
		int[] arr = new int[n];
		int[] arrNew = new int[n];
		int z = unique(arr);
		for(int i=0; i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int m = 0;m<arr.length;m++)
		{
			for(int p = 0; p<arr.length;p++)
			{
				if(arr[m]==arr[p])
				{
					if(arrNew[p]!=arr[m])
					{
						arrNew[m]=arr[m];
						count++;
					}
				}
			}
			countOf[m]=count;
			count =0;
		}
		for(int i=0; i<=2;i++)
		{
			System.out.println("Occurance of"+" "+ arrNew[i]+"is"+" "+countOf[i]);
		}
	}

}
