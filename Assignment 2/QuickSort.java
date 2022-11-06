//2. WAP to sort an array using Quick Sort Algorithm.

import java.util.Arrays;

public class QuickSort 
{
  public static void main(String[] args) 
  {
    //Unsorted Array
    int[] array = new int[] { 22, 1, 3, 60, 93, 6, 51, 9 };
 
    //Call to quickSort method and passing array, low and high
    quickSort( array, 0, array.length - 1 );

    System.out.println("\nSorted array using QuickSort:\n");
    System.out.println(Arrays.toString(array));
  }

  //Declaring quickSort method as static to call from static main method
  private static void quickSort(int[] arr, int low, int high) 
  {
    //check for empty or null array
    if (arr == null || arr.length == 0)
    {
      return;
    }
     
    if (low >= high)
    {
      return;
    }
 
    //Get the pivot/key element from the middle of the list
    int middle = low + (high - low) / 2;
    int pivot = arr[middle];
 
    // make left < pivot and right > pivot
    int i = low, j = high;
    while (i <= j) 
    {
      //Check until all values on left side array are lower than pivot
      while (arr[i] < pivot) 
      {
        i++;
      }
      //Check until all values on left side array are greater than pivot
      while (arr[j] > pivot) 
      {
        j--;
      }
      //Now compare values from both side of lists to see if they need swapping 
      //After swapping move the iterator on both lists
      if (i <= j) 
      {
        swap (arr, i, j);
        i++;
        j--;
      }
    }
   
    if (low < j)
    {
      quickSort(arr, low, j);
    }
    if (high > i)
    {
      quickSort(arr, i, high);
    }
  }

  //Swapping logic
  public static void swap (int array[], int x, int y)
  {
    int temp = array[x];
    array[x] = array[y];
    array[y] = temp;
  }
}
 