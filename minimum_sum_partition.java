import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    int sum=0;
		    for(int i=0;i<n;i++){
		        a[i] = sc.nextInt();
		        sum+=a[i];
		    }
		    boolean ans[]=new boolean[sum/2+1];
		    ans[0]=true;
		    for(int i=0;i<n;i++){
		        for(int j=ans.length-1;j>=0;j--){
		            if(ans[j]){
		                if(j+a[i]<ans.length){
		                    ans[j+a[i]]=true;
		                }
		            }
		        }
		    }
		    int index=0;
		    for(int j=ans.length-1;j>=0;j--){
		         if(ans[j]){
		             index = j;
		             break;
		         }
		    }
		    index = (sum/2)-index;
		    if(sum%2==0){
		        System.out.println(2*index);
		    }
		    else{
		        System.out.println(2*index + 1);
		    }
		}
	}
}