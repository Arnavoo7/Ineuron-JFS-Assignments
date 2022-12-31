/* Q7. WAP to find if String contains all unique characters. */

class Unique
{
    public static void main(String[] args)
    {
        //Original string
        String str = "ineuron";
        String nstr = "";
        
        char[] ch = str.toCharArray();

        for(char c: ch)
        {
            if(nstr.indexOf(c) == -1)
                nstr += c;
            else
            {
                System.out.println();
                System.out.println("Not Unique");
                System.out.println();
                System.exit(0);
            }
        }

        System.out.println();
        System.out.println("All characters present in the string are Unique.");
        System.out.println();
    }
}