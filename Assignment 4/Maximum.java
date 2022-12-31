/* Q8. WAP to find the maximum occurring character in a String. */

class Maximum
{
    public static void main(String[] args)
    {
        //Original string
        String str = "ineuron";

        //All ASCII chars value taken as size
        int[] arr = new int[256];

        for(int i=0; i<str.length(); i++)
        {
            //Incrementing the value by one whenever it occurs again
            arr[str.charAt(i)] += 1;
        }

        int max=0;
        char c = '\0';

        for(int i=0; i<str.length(); i++)
        {
            if(max < arr[str.charAt(i)])
            {
                max = arr[str.charAt(i)];
                c = str.charAt(i);
            }
        }

        System.out.println();
        System.out.println("The maximum occurred char in \""+str+"\" is: "+c);
        System.out.println();


    }
}