package circusProblem;

public class circusSort {
public void sort(int[] height, int[] weight){
	int size = height.length;
	
	
	for( int i= 0;i<size-1;i++)
	{
		for( int j= 0;j<size-i-1;j++)
		{
			if( height[j]<height[j+1] && weight[j]<weight[j+1] ){
				int temp = height[j];
				height[j]=height[j+1];
				height[j+1]=temp;
				int tempOne = weight[j];
				weight[j]=weight[j+1];
				weight[j+1]=tempOne;
				}
		}
		
		
	}
	
	int count = 0;
	try{for( int i= 0;i<size;i++)
		{
			if((height[i]>height[i+1] && weight[i]>weight[i+1]) || (height[i]<height[i-1] && weight[i]<weight[i-1]))
			{
			
				System.out.println("["+height[i]+","+weight[i]+"]");
				count++;
			}
			
			
			
		}
	
	
	}catch (Exception e)
	{
			System.out.print(" ");
	}
	if(height[size-2]>height[size-1] && weight[size-2]>weight[size-1])
	{
		System.out.println("["+height[size-1]+","+weight[size-1]+"]");
		count++;
	}
	System.out.print("Total such person available " + count);
	
	
}


}
