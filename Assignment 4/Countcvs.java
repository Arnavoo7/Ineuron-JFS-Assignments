/* Q4. WAP to count the number of consonants, vowels, special characters in a String. */

class Countcvs
{
    public static void main(String[] args)
    {
        //ccount for consonants, vcount for vowels, scount for special chars
        int ccount = 0, vcount = 0, scount = 0;

        //Original string
        String str = "$ineu!ron$";
        // String str = "aeious";

        //Converting string to character array
        char[] ch = str.toCharArray();

        for(char c: ch)
        {

            if(Character.toString(c).matches("[A-Za-z]") && Character.toString(c).matches("[^aeiou]"))
                ccount++;
            else if(Character.toString(c).matches("[AEIOUaeiou]"))
                vcount++;
            else
                scount++;
        }

        System.out.println();
        System.out.println("Consonants: "+ccount);
        System.out.println("Vowels: "+vcount);
        System.out.println("Special chars: "+scount);
        System.out.println();


    }
}