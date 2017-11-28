import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int a[]=new int[n];
		    int l[]=new int[n];
		    int r[]=new int[n];
		    Arrays.fill(l,-10);
		    Arrays.fill(r,-10);
		    l[0]=-1;
		    r[n-1]=n;
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    Stack<Integer> st = new Stack<Integer>();
		    st.push(0);
		    for(int i=1;i<n;i++){
		        int p = st.peek();
		        if(a[i]<a[p]){
		            r[p]=i;
		            p=st.pop();
		            while(!st.empty()){
		            	p=st.pop();
		                if(a[i]<a[p]){
		                    r[p]=i;        
		                }
		                else{
		                	st.push(p);
		                    break;
		                }
		            }
		            st.push(i);
		        }
		        else{
		            st.push(i);
		        }
		    }
		    for(int i=0;i<n;i++){
		        if(r[i]==-10){
		            r[i]=n;
		        }
		        //System.out.print(r[i]+" ");
		    }
		    //System.out.println();
		    
		    Stack<Integer> st2 = new Stack<Integer>();
		    st2.push(n-1);
		    for(int i=n-2;i>=0;i--){
		        int p = st2.peek();
		        if(a[i]<a[p]){
		            l[p]=i;
		            p=st2.pop();
		            while(!st2.empty()){
		            	p=st2.pop();
		                if(a[i]<a[p]){
		                    l[p]=i;        
		                }
		                else{
		                	st2.push(p);
		                    break;
		                }
		            }
		            st2.push(i);
		        }
		        else{
		            st2.push(i);
		        }
		    }
		    for(int i=0;i<n;i++){
		        if(l[i]==-10){
		            l[i]=-1;
		        }
		        //System.out.print(l[i]+" ");
		    }
		    //System.out.println();
		    
		    int ans[] = new int[n];
		    int max = 0;
		    for(int i=0;i<n;i++){
		    	ans[i] = ((r[i])-(l[i]+1))*a[i];
		    	if(ans[i]>max){
		    		max = ans[i];
		    	}
		    }
		    System.out.println(max);
		}
	}
}