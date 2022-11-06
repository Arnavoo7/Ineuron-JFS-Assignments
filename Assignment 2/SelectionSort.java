//5. WAP to sort an array using Selection Sort Algorithm.

import java.util.Arrays;


class SelectionSort 
{

    public static void main(String args[])
    {
        int[] array = { 5,1,2,99,8,1,0 };
        //SelectionSort s = new SelectionSort();
        selectionSort(array);
        
        System.out.println("\nSorted array using SelectionSort:\n");
        //Sorted Array
        System.out.println(Arrays.toString(array));
    }

    private static void selectionSort(int array[])
    {
        int size = array.length;

        for (int step = 0; step < size - 1; step++) {
        int min_idx = step;

        for (int i = step + 1; i < size; i++) {

        // To sort in descending order, change > to < in this line.
        // Select the minimum element in each loop.
        if (array[i] < array[min_idx]) {
          min_idx = i;
        }
      }

      // put min at the correct position
      int temp = array[step];
      array[step] = array[min_idx];
      array[min_idx] = temp;
    }
  }


  
}