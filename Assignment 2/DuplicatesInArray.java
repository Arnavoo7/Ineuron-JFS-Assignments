//1. WAP to find the duplicates present in an array.

import java.util.Arrays;


class DuplicatesInArray
{
    public static void main(String[] args)
    {
        int[] arr = {7,11,10,1,2,22,1,11};
        int[] krr;
        int i=1, k=0;

        Arrays.sort(arr);

        System.out.println("Sorted Array:\n");
        System.out.println(Arrays.toString(arr));

        System.out.println();

        System.out.println("\nDuplicates no. Found: ");

        while(i != arr.length-1 )
        {
            for(; i<arr.length; i++)
            {
                if(arr[i] == arr[i-1])
                {
                    System.out.println(arr[i]);
                }
            }
        }

    }
}