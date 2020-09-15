package Recursion;

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            ArrayList<String> ans = new LexSort().powerSet(st);
            Collections.sort(ans);
            for(String s: ans)
                System.out.print(s + " ");
            System.out.println();    
        }
    }
}


 // } Driver Code Ends


//User function Template for Java


class LexSort
{
    // complete the function
    static ArrayList<String> powerSet(String s)
    {
        // add your code here
        if(s.length()==0)
        {
            ArrayList<String> baseResult=new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
        char cc = s.charAt(0);
        String ros = s.substring(1);
        ArrayList<String> myResult = new ArrayList<>();
        ArrayList<String> recResult = powerSet(ros);
        for(int i=0;i<recResult.size();i++)
        {
            myResult.add(recResult.get(i));
            myResult.add(cc+recResult.get(i));
        }
        return myResult;
    }
}
