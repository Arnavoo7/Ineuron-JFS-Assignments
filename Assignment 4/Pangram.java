/* Q6. WAP to implement Pangram Checking with least inbuilt methods being used. */


class Pangram
{
    public static void main(String[] args)
    {
        //Original string
        String str = "The quick brown fox jumps over a lazy dog";

        //To store result
        boolean result = true;

        //Converting to one word with lowercase char
        str = str.toLowerCase(  );
        str = str.replaceAll("\\s","");

        for(char ch='a'; ch<='z'; ch++)
        {
            for(int i=0; i<str.length(); i++)
            {
                if(str.indexOf(ch) == -1)
                {
                    result = false;
                    break;
                }
            }
        }

        System.out.println();

        if(result)
            System.out.println("String is Pangram.");
        else
            System.out.println("String is not Pangram.");
            
        System.out.println();

    }
}