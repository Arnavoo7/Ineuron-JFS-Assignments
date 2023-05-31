// package in.ineuron.main;

import java.util.ArrayList;
import java.util.Arrays;

public class Common {

	public static void main(String[] args)
	{
		int v1[] = {3,4,2,2,4};
		int v2[] = {3,2,2,7};
		
		//Taking 3rd Array to store the result
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		//Sorting done
		Arrays.sort(v1);
		Arrays.sort(v2);
		
		int min=0, max=0;
        boolean r1=false;
		
		//Store min length so that we can traverse till that
		if(v1.length < v2.length)
		{
			min = v1.length;
			max = v2.length;
            r1 = true;

		}
		else
		{
			min = v2.length;
			max = v1.length;
		}
		
		
		for(int i=0; i<min; i++)
		{
			for(int j=0; j<max; j++)
			{
                if(r1)
                {
				    if(v1[i] == v1[j])
				    {
					    al.add(v1[i]);
					    break;
				    }
                }
                else
                {
                    if(v2[i] == v1[j])
				    {
					    al.add(v1[i]);
					    break;
				    }   
                }
			}
		}
		
		System.out.println(al);
		
		
		

	}

}
 