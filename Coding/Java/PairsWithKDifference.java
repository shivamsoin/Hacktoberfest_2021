import java.util.HashMap;
import java.util.Scanner;


class PairsWithKDifference
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int num=sc.nextInt();
        HashMap<Integer,Boolean> hs = new HashMap<>();
        for(int i: arr)
        {
            hs.put(i,true);
        }
        int count=0;
        for(int j : hs.keySet())
        {
            int x=j+num;
            if(hs.containsKey(x) && hs.get(x)==true)
            {
                hs.put(j,false);
                count++;
            }
        }
        System.out.println(count);
    }
}
