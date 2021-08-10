import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn =new Scanner(System.in);
        int n= scn.nextInt();
        int m = scn.nextInt();
        System.out.println(getMazePaths(0,0,n-1,m-1));

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sc ==dc && sr==dr)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        ArrayList<String> mr=new ArrayList<>();
            for(int i=1;i<=(dc-sc);i++)
            {
                ArrayList<String> hpaths=getMazePaths(sr,sc+i,dr,dc);
                for(String hpath:hpaths)
                    mr.add("h"+i+hpath);
                
            }
            for(int i=1;i<=(dr-sr);i++)
            {
                ArrayList<String> vpaths=getMazePaths(sr+i,sc,dr,dc);
                for(String vpath:vpaths)
                    mr.add("v"+i+vpath);
                
            }
        
            for(int i=1;i<=(dc-sc) && i<=(dr-sr);i++)
            {
                ArrayList<String> dpaths=getMazePaths(sr+i,sc+i,dr,dc);
                for(String dpath:dpaths)
                    mr.add("d"+i+dpath);
                
            }
            
        
        
        
        return mr ;
    }

}
