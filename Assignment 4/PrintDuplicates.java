/* Q2. WAP to print Duplicate character from the String. */

class PrintDuplicates
{
    public static void main(String[] args)
    {
        //Original string taken consisting duplicate char
        String str = "ineuron";

        //For storing string without dupliacte char
        String nstr = "";

        //For storing duplicate char string
        String dstr = "";

        //Converting string to char Array to
        char[] ch = str.toCharArray();

        //Traversing and checking for getting removed duplicate string and the duplicate char
        for(char c: ch)
        {
            if(nstr.indexOf(c) == -1)
                nstr += c;
            else
                dstr += c;
        }

        System.out.println();
        //Printing original string
        System.out.println("Original string: "+str);

        //Printing the duplicate char
        System.out.println("The duplicate char present in the \""+str+"\" is: "+dstr);
        System.out.println();


    }
}