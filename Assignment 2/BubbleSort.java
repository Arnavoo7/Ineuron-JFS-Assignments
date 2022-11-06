//3. WAP to sort an array using Bubble Sort Algorithm.

import java.util.Arrays;


class BubbleSort
{
    public static void main(String[] args)
    {
        //Unsorted Array
        int[] arr={5,1,2,99,8,1,0};
        int temp;
        
        //Loop untill Array is sorted
        for(int i=0; i<arr.length; i++)
        {
            for(int j=1; j<arr.length-i; j++)
            {
                //Swapping logic: doing linear search and swapping
                if(arr[j] < arr[j-1])
                {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                }
            }
            
        }
        System.out.println("\nSorted array using BubbleSort:\n");
        //Sorted Array
        System.out.println(Arrays.toString(arr));

    }
}                                                           