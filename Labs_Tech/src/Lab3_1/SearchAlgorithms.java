package Lab3_1;

public class SearchAlgorithms 
{
	public static void main(String[] args)
	{
		int [] test1 = {1,2,3,4,5,6,7,8,9,10};
		int [] test2 = {0,4,5,6,12,15,17,23,29};
		System.out.println(binarySearch(test1,3));//2
		System.out.println(linearSearch(test1,3));//2

		System.out.println(binarySearch(test2,23));//7
		System.out.println(linearSearch(test2,23));//7
	
		System.out.println(binarySearch(test2,25));//-1
		System.out.println(linearSearch(test2,25));//-1
	
		System.out.println(binarySearch(test1,10));//9
		System.out.println(linearSearch(test1,1));//0
	
		System.out.println(binarySearch(test1,1));//0
	}

	public static int linearSearch(int [] stuff, int num) 
	{	
		for(int i=0; i<stuff.length-1;i++) 
		{
			if(stuff[i]==num) 
			{
				return i;
			}	
		}
		return -1;
	}
	
	public static int binarySearch(int [] stuff, int num) 
	{
		int l = 0;
		int r = stuff.length-1;
		while(l<=r) 
		{
			int mid = (l+r)/2;
			if(stuff[mid] < num) 
			{
				l=mid+1;
			}
			else if(stuff[mid] > num)
			{
				r=mid-1;
			}
			else 
			{
				return mid;
			}	
		}
		return -1;
	}
}