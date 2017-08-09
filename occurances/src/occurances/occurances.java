package occurances;
import java.util.Scanner;
public class occurances {
	public static void unique(int[] arr){
		int count= 0;
		//int[] arrNew = new int[n];
        for(int i=0;i<arr.length;i++){
        	 
            boolean isDistinct = false;
            for(int j=0;j<i;j++){
         
            	
                if(arr[i] == arr[j]){
                    isDistinct = true;
                    break;
                }
                
                
            }
           
            if(!isDistinct){
            	System.out.println(arr[i]+" "+"occured"+" "+count);
            }
           
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		unique(arr);
		
		
	}
	
}