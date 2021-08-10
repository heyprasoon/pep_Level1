import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(getStairPaths(n));
  }
   // public static ArrayList<String> mr= new ArrayList<>();
  public static ArrayList<String> getStairPaths(int n) {
      
      if(n==0)
      {
          ArrayList<String> base= new ArrayList<>();
          base.add("");
          return base;
      }
      if(n<0)
      {     ArrayList<String> base= new ArrayList<>();
      
          return base;
      }
    
    ArrayList<String> s1=getStairPaths(n-1);
    ArrayList<String> mr= new ArrayList<>();
    for(int i=0;i<s1.size();i++)
    {
        mr.add(1+s1.get(i));
        
    }
    ArrayList<String> s2=getStairPaths(n-2);
    for(int i=0;i<s2.size();i++)
    {
        mr.add(2+s2.get(i));
        
    }
    ArrayList<String> s3=getStairPaths(n-3);
    for(int i=0;i<s3.size();i++)
    {
        mr.add(3+s3.get(i));
        
    }
    return mr;

    
  }

}
*/ old
import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(getStairPaths(n));
  }

  public static ArrayList<String> getStairPaths(int n) {
    if (n == 0)
    {
      ArrayList<String> base = new ArrayList<>();
      base.add("");
      return base;
    }
    if (n < 0)
    {
      ArrayList<String> base = new ArrayList<>();

      return base;
    }
    ArrayList<String> mr = new ArrayList<>();
    for (int i = 1; i <= 3; i++)
    {
      ArrayList<String> rr = getStairPaths(n - i);
      
      for (int j = 0; j < rr.size(); j++)
      {
        mr.add(i + rr.get(j));
      }
    }
    return mr;

  }

} /*
