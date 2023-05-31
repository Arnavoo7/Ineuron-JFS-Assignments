import java.util.ArrayList;

public class Practice 
{
    public static void main(String[] args)
    {   
        int nums[] = {1,2,3,4};
        ArrayList<Integer> arr = new ArrayList<Integer>(nums.length);
        ArrayList<Integer> narr = new ArrayList<Integer>(nums.length);

        for(int i=0; i<nums.length; i++)
        {
            arr.add(nums[i]);
        }

        System.out.println(arr);

        // String str = Arrays.toString(nums);
        // String naya = "";


        // System.out.println(str);
        // char[] ch = str.toCharArray();

        // System.out.println(ch);
        
        
        //If every element is distinct then false
        boolean result = false;
        for(int elem: nums)
        {
            if(narr.indexOf(elem) == -1)
                narr.add(elem);
            else
                System.out.println(true);
        }

        

        System.out.println(result);
    }
}
