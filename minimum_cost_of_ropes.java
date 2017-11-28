import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-- > 0){
		    int n=sc.nextInt();
		    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(n);
		    for(int i=0;i<n;i++){
		        int x=sc.nextInt();
		        pq.add(x);
		    }
		    int ans=0;
		    while(pq.size()!=1){
		        int x = pq.poll();
		        int y = pq.poll();
		        pq.add(x+y);
		        ans += (x+y);
		    }
		    System.out.println(ans);
		    
		}
	}
}