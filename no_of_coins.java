import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    int v = sc.nextInt();
		    int n = sc.nextInt();
		    int in[] = new int[n];
		    for(int i=0;i<n;i++){
		        in[i]=sc.nextInt();
		    }
		    
		    int dp[][]=new int[n+1][v+1];
		    for(int i=0;i<=v;i++){
		        dp[0][i]=10000000; 
		    }
		    for(int i=0;i<=n;i++){
		        dp[i][0]=0;
		    }
		    for(int i=1;i<=n;i++){
		        for(int j=1;j<=v;j++){
		            if(in[i-1] <= j){
		                dp[i][j]= Math.min(1+dp[i][j-in[i-1]] , dp[i-1][j]);
		            }
		            else{
		                dp[i][j] = dp[i-1][j];
		            }
		        }
		    }
		    /*for(int i=0;i<=n;i++){
		        for(int j=0;j<=v;j++){
		           System.out.print(dp[i][j]+" ");
		        }
		        System.out.println();
		    }*/
		    if(dp[n][v] != 10000000){
		    System.out.println(dp[n][v]);
		    }
		    else{
		        System.out.println(-1);
		    }
		}
	}
}