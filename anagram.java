import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t=sc.nextInt();
	    
	    while(t-- > 0){
	        String s1 = sc.next();
	        char[] c1 = s1.toCharArray();
	        Arrays.sort(c1);
	        String x = new String(c1);
	        
	        String s2 = sc.next();
	        char[] c2 = s2.toCharArray();
	        Arrays.sort(c2);
	        String y = new String(c2);
	        
	        if(x.equals(y)){
	            System.out.println("YES");
	        }
	        else{
	            System.out.println("NO");
	        }
	    }
	}
}