//4. WAP to sort an array using Merge Sort Algorithm.

import java.util.Arrays;


public class MergeSort 
{
  public static void main(String[] args)
  {
    //Unsorted Array
    int[] array = {23, 1, 55, 44, 2, 99, 84, 5};

    //Call to mergeSort method and passing Array
    mergeSort(array); 

    System.out.println("\nSorted array using MergeSort:\n");
    
    //Sorted array
    System.out.println(Arrays.toString(array));
    
  }


  private static void mergeSort(int[] array2)
  {
    int arrayLength = array2.length;
    
    if (arrayLength < 2) {
      return;
    }
    
    int midPoint = arrayLength / 2;
    int[] leftArray = new int[midPoint];
    int[] rightArray = new int[arrayLength - midPoint];
    
    for (int i = 0; i < midPoint; i++) {
      leftArray[i] = array2[i];
    }
    for (int i = midPoint; i < arrayLength; i++) {
      rightArray[i - midPoint] = array2[i];
    }
    
    mergeSort(leftArray);
    mergeSort(rightArray);
    
    merge(array2, leftArray, rightArray);
  }

  private static void merge (int[] array2, int[] leftArray, int[] rightArray) 
  {
    int leftArrayLength = leftArray.length;
    int rightArrayLength = rightArray.length;
    
    int x = 0;
    int y = 0;
    int z = 0;
    
    while (x < leftArrayLength && y < rightArrayLength)
    {
      if (leftArray[x] <= rightArray[y])
      {
        array2[z] = leftArray[x];
        x++;
      }
      else
      {
        array2[z] = rightArray[y];
        y++;
      }
      z++;
    }
    
    while (x < leftArrayLength)
    {
      array2[z] = leftArray[x];
      x++;
      z++;
    }
    
    while (y < rightArrayLength)
    {
      array2[z] = rightArray[y];
      y++;
      z++;
    }
    
  }
}