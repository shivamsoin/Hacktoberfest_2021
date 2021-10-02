import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class AnagramString {
    public static void main(String args[])
    {

        String str1="CodeQuotient";
        String str2="QuxtientCode";
        if(str1.length()!=str2.length())
        {
            System.out.println(false);
        }
        char[] st1= new char[str1.length()];
        char[] st2= new char[str1.length()];
        for(int i=0;i<str1.length();i++)
        {
            st1[i]=str1.charAt(i);
            st2[i]=str2.charAt(i);
        }
        Arrays.sort(st1);
        Arrays.sort(st2);
        for(int i=0;i< str1.length();i++)
        {
            if(st1[i]!=st2[i])
            {
                System.out.println(false);
                break;
            }
        }
    }
}
