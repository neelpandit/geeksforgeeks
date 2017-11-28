import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int in[] = new int[n];
		    int b=0,s=0,flag=0;
		    for(int i=0;i<n;i++){
		        in[i]=sc.nextInt();
		    }
		    for(int i=1;i<n;i++){
		        if(in[i]>=in[i-1]){
		            s=i;
		        }
		        else{
		            if(b!=s){
		                flag=1;
		                System.out.print("("+b+" "+s+") ");
		            }
		            b=i;
		            s=i;
		        }
		    }
		    if(b!=s){
		                flag=1;
		                System.out.print("("+b+" "+s+") ");
		            }
		            if(flag==0){
		                System.out.print("No Profit");
		            }
		            System.out.println();
		}
	}
}