import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str= scn.nextLine();
        printEncodings(str,"");
    }

    public static void printEncodings(String str,String asf) {
        
        if(str.length()==0)
            {
                System.out.println(asf);
                return;
            }
            int f1=Integer.parseInt(str.substring(0, 1));
            if(f1>=1 && f1<=9)
            {   String ros=str.substring(1);
                char ch =(char)((f1-1)+'a');
                printEncodings(ros, asf+ch);
            }
            if(str.length()>1)
            {
                int f2=Integer.parseInt(str.substring(0, 2));

                if(f2>=10 && f2<=26)
                {   
                    String ros=str.substring(2);
                    char ch =(char)((f2-1)+'a');
                    printEncodings(ros, asf+ch);
                }
            }
    }

}
