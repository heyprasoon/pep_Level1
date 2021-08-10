import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        System.out.println(gss(str));
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0)
        {
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String> rr=gss(ros);
        ArrayList<String> ms=new ArrayList<>();
        for(int i=0;i<rr.size();i++)
        {
            ms.add(rr.get(i));
        }
        for(int i=0;i<rr.size();i++)
        {
            ms.add(ch+rr.get(i));
        }
        
        return ms;
    }

}
