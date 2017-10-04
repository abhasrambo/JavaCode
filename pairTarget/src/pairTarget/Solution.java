package pairTarget;

import java.util.Scanner;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
   
        for(int i = 0; i < nums.length-1 ; i++)
        {
            for(int j = i+1; j < nums.length-1 ; j++)
            {
                int sum = 0;
                sum = nums[i]+nums[j];
                if(sum == target)
                {
                	return new int[] { i, j };
                }
            }
        }
		return null;
      
    }
	 
   public static void main(String[] args)
    {
        Solution obj = new Solution();
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int target = sc.nextInt();
        int[] num = new int[size];
        for(int i = 0 ; i < size ; i++)
        {
        	num[i] = sc.nextInt();
        }
        int [] arr = obj.twoSum(num, target);
        
      
        	for(int j = 0 ; j < 2 ; j++)
            {
            	System.out.println(arr[j]);
            }
        
    } 
}
