/* 6. WAP to check whether an array is a subset of another array.
Ex: arr1 = {2,4,3,5,6,7}  and  arr2 = {4,6,7} then array2 is a subset of array1 set. */


import java.util.Arrays;


class SubsetArray
{

    public static void main(String[] args)
	{
        //Array1
		int arr1[] = { 11, 1, 13, 21, 3, 7 };
        //Array2
		int arr2[] = { 11, 3, 7, 1 };

        //Storing length of arr1 in m
		int m = arr1.length;
        //Storing length of arr1 in n
		int n = arr2.length;

		if (isSubset(arr1, arr2, m, n))
			System.out.println("\narr2 is a subset of arr1");
		else
			System.out.println("\narr2 is not a subset of arr1");
	}


	private static boolean isSubset(int arr1[], int arr2[], int m, int n)
	{
		int i = 0, j = 0;

		if (m < n)
			return false;

		Arrays.sort(arr1); 
		Arrays.sort(arr2); 

		while (i < n && j < m)
		{
			if (arr1[j] < arr2[i])
				j++;
			else if (arr1[j] == arr2[i])
			{
				j++;
				i++;
			}
			else if (arr1[j] > arr2[i])
				return false;
		}

		if (i < n)
			return false;
		else
			return true;
	}

	
	
}



