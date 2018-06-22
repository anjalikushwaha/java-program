import java.util.*;
class vowel
{
   import java.util.scanner;
public class Vowels
 public static void main(String Args[])
    {
        System.out.println("Enter a string");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("The vowels are :-");
        vowel(s);
    }
    
    public static void vowel(String st)
    {
        int i;
        for(i=0;i<st.length();i++)
        {
            if((st.charAt(i)=='a')||(st.charAt(i)=='u')||(st.charAt(i)=='o')||(st.charAt(i)=='i')||(st.charAt(i)=='e'))
            {
                System.out.println(st.charAt(i));
            }
        }
    }
}

