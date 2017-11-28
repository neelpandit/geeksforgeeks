import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0){
		    int n=sc.nextInt();
		    int a[] =new int[n];
		    int l[] =new int[n];
		    int r[] =new int[n];
		    int ans[] =new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    
		    int maxl = a[0];
		    l[0]=0;
		    for(int i=1;i<n;i++){
		        l[i]=maxl;
		        if(a[i]>maxl){
		            maxl=a[i];
		        }
		    }
		    
		    int maxr = a[n-1];
		    r[n-1]=0;
		    for(int i=n-2;i>=0;i--){
		        r[i]=maxr;
		        if(a[i]>maxr){
		            maxr=a[i];
		        }
		    }
		    
		    int answer = 0;
		    for(int i=0;i<n;i++){
		        ans[i]=Math.max(Math.min(l[i],r[i])-a[i],0);
		        answer+=ans[i];
		    }
		    
		    System.out.println(answer);
		    
		    
		}
	}
}