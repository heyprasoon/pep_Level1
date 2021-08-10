
	
	import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m=scn.nextInt();
        
        printMazePaths(1,1,n,m,"");
        

    }
    public static void printMazePaths(int sr, int sc, int dr, int dc, String asf) {
        
        
        if(sc==dc && sr==dr)
        {
            System.out.println(asf);
            return;
        }
        
        if(sc!=dc)
            printMazePaths(sr,sc+1,dr,dc,asf+'h');
        if(sr!=dr)
        printMazePaths(sr+1,sc,dr,dc,asf+'v');
        }

}
