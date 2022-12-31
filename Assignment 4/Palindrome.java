/* Q3. WAP to check if “2552” is palindrome or not. */

class Palindrome
{
    public static void main(String[] args)
    {
        //Original string
        String str = "2552";

        //For storing the result
        boolean result = false;

        //Converting from string to char array
        char[] arr = str.toCharArray();

        //Taking the start position and end position
        int start = 0, end = arr.length-1;
        
        while(start < end)
        {
            if(arr[start] == arr[end])
            {
                result = true;
                start++;
                end--;
            }
            else
            {
                result = false;
                break;
            }
        }
        
        System.out.println();
        //Depending upon the result checking string is Palindrome or not.
        if(result)
            System.out.println("\""+str+"\""+" is Palindrome.");
        else
            System.out.println("\""+str+"\""+" is not Palindrome.");

        System.out.println();
        

    }
}