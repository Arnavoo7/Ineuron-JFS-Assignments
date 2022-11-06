package hellloworld;

public class Design3 {

	public static void main(String[] args) 
	{
		int n=14;
		System.out.println();
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(i==0 || i==n-1 || i+j<=(n-1)/2 || i-j>=(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}

	}

}
