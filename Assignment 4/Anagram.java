/* Q5. WAP to implement Anagram Checking least inbuilt methods being used. */

import java.util.Scanner;

class Anagram
{
    public static void main(String[] args)
    {


        Scanner sc = new Scanner(System.in);

		System.out.println();
		
		//Input string from the user
		System.out.print("Enter the word: ");
		String str1 = sc.next();
		
		System.out.println();
		System.out.print("Enter the second String : ");
		String str2 = sc.next();


		//Checking length of both strings 
		if (str1.length() != str2.length())
		{
			System.out.println();
			System.out.println("Not a Anagram");
			System.out.println();
			System.exit(0);   
		}
		else
		{
			for (int i=0; i<str1.length(); i++)
			{
				for (int j=0; j<str2.length(); j++)
				{
					if (str1.charAt(i) == str2.charAt(j))
					{
						str2 = str2.substring(0, j) + str2.substring(j + 1);
						break;
					}
				}
			}
			
			if (str2.length() == 0)
			{
				System.out.println();
			    System.out.println("It's a Anagram");
				System.out.println();
				System.exit(0);
			}
			else
			{
				System.out.println();
			    System.out.println("Not a Anagram");
				System.out.println();
			}
        }
		
		System.out.println();
		System.out.println("Not a Anagram");   
    }
}