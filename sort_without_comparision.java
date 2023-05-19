
import java.util.*;

class Node
{

	static void sortArr(int arr[], int n, int min, int max)
	{
	
		int m = max - min + 1;


		int[] c = new int[m];
		for (int i = 0; i < n; i++)
		{
			c[arr[i] - min]++;
		}

		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < c[i]; j++)
			{
				System.out.print((i + min) + " ");
			}
		}
	}


	public static void main(String[] args)
	{
		int arr[] = {10, 1, 4, 2, 15};
		int min = 0, max = 100;
		int n = arr.length;
		sortArr(arr, n, min, max);
	}
}


