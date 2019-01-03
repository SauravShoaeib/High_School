package Lab3_2;

import java.util.Arrays;

public class SortAlgorithmHelpers 
{
	public static void main(String[] args) 
	{
		//Testing Code
		String[] test1 = { "apple","cucumber", "microsoft", "zorro" };
		String[] test2 = { "banana", "cherry", "mahogany","oreos", "pinata"};
		int[] test3 = {3,4,2,7,12,22,0,1};
		
		//Merge Test
		long start = System.nanoTime();
		String[] mresult = merge(test1,test2);
		long end = System.nanoTime();
		long time = end-start;
		System.out.println("Merge Test Result: "+Arrays.toString(mresult));
		System.out.println("									Time Taken: " + time + " nanoseconds");

		
		//Partition Test
		start = System.nanoTime();
		int pps = partition(test3,0,test3.length-1);
		end = System.nanoTime();
		time = end = start;
		System.out.println("Partition Test Result: "+Arrays.toString(test3) + " & Pivot Position: " + pps);
		System.out.println("									Time Taken: " + time + " nanoseconds");
	}

	//Merges two arrays
	public static String[] merge(String[] list1, String[] list2) 
	{
		//Precondition : Both lists are sorted
		//Takes two arrays and merges them in ascending order	
		String[] full = new String [(list1.length) + (list2.length)]; //i made it work but am confused about why its minus 1 and not 2
		
		int j = 0;
		int l = 0;
		int r = 0;
		
		while(l < list1.length && r < list2.length && j < full.length) 
		{
			if (list1[l].compareTo(list2[r]) >= 0)
			{
				full[j] = list2[r];
				j++;
				r++;
			}			
			else
			{
				full[j] = list1[l];
				j++;
				l++;
			}
		}
		while(j < full.length && l < list1.length) 
		{
			full[j] = list1[l];
			j++;
			l++;
		}		
		while(j < full.length && r < list2.length) 
		{
			full[j] = list2[r];
			j++;
			r++;
		}
		return full;
	}
	
	//Takes an array, calls first number pivot and places bigger numbers to the right, and the smaller numbers to the left
	 public static int partition(int[] list, int front,int back) 
	 {
		 int low = front + 1;
	     int pivot = list[front];

	     while (back > low) 
	     {
	    	 while (low <= back && list[low] <= pivot) 
	    	 {
	    		 low++;
	    	 }
	         while (low <= back && list[back] > pivot) 
	         {
	        	 back--;
	         }
	         if (back > low) 
	         {
	        	 swapperi(list,back,low);
	         }
	     }
	     while (back >= low && list[back] >= pivot)
	     {
	    	 back--;   
	     }
	     if (back > front)
	     {
	    	 swapperi(list,back,front);
	    	 return back;
	     } 
	     else   
	     {
	    	 return front;
	     }
	 }
	
	//Swaps two items in an array of integers
		public static void swapperi(int[] arr, int x, int y) 
		{
			int holder = arr[x];
			arr[x] = arr[y];
			arr[y] = holder;	
		}
}
