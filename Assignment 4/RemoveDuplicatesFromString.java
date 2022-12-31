/*Q1. WAP to remove Duplicates from a String.(Take any String ex with duplicates character) */

class RemoveDuplicatesFromString
{
     public static void main(String[] args)
     {
        //Taking a string with duplicate values
        String str = "ineuron";

        System.out.println();
        //Printing the original string
        System.out.println("Original string: "+str);

        //Converting from string to array in order to traverse each char
        char[] c = str.toCharArray();

        //Taking a new string nstr to store the string with no duplicate character
        String nstr = "";

        //Traversing and checking
        for(char ch: c)
        {
                /*It's checking if the value is not there then get inside if but as the value found if get's false 
                and that char is not added to the string*/
                if(nstr.indexOf(ch) == -1)
                {
                        nstr += ch;
                }
        }

        System.out.println("After removing duplicate char: "+nstr);
        System.out.println();

     }
}


