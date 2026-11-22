import java.util.*;
public class Characterfreq {
    public static String frequency(String str)
    {
        String result="";
        for(int i=0;i<str.length();i++)
        {
            char ch1=str.charAt(i);
            int count=0;
            boolean alreadycounted=false;
            for(int k=0;k<i;k++)
            {
                if(str.charAt(k)==ch1)
                {
                    alreadycounted=true;
                    break;
                    
                }
            }
            if(alreadycounted)
            {
                continue;
            }
        for(int j=0;j<str.length();j++)
        {
            if(ch1==str.charAt(j))
            {
                count++;
            }
        }
        result+=ch1 + ":" + count + '\n';

        }
        return result;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String res=frequency(str);
        System.out.println(res);
    }
}
