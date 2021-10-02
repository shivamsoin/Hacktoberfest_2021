import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class LongestConsecutiveSequence {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Boolean> hm = new HashMap<>();
        for(int x: arr)
        {
            hm.put(x,true);
        }
        for(int x : arr)
        {
            if(hm.containsKey(x-1))
            {
                hm.put(x,false);
            }
        }
        int msp=0;
        int ml=0;
        for(int x: arr)
        {
            if(hm.get(x))
            {
                int tl=1;
                while(hm.containsKey(x +tl))
                {
                    tl++;
                }
                if(tl>ml)
                {
                    ml=tl;
                    msp= x;
                }
            }
        }
        for(int i=0;i<ml;i++)
        {
            System.out.println(msp+i);
        }
    }
}
