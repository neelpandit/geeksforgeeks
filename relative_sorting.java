import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- >0){
		    int m = sc.nextInt();
		    int n = sc.nextInt();
		    int a1[] = new int[m];
		    int a2[] = new int[n];
		    
		    for(int i=0;i<m;i++){
		        a1[i]=sc.nextInt();
		    }
		    
		    for(int i=0;i<n;i++){
		        a2[i]=sc.nextInt();
		    }
		    
		    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		    for(int i=0;i<m;i++){
		        if(hm.containsKey(a1[i])){
		            int x = hm.get(a1[i]);
		            x++;
		            hm.put(a1[i],x);
		        }
		        else{
		            hm.put(a1[i],1);
		        }
		    }
		    
		    for(int i=0;i<n;i++){
		        if(hm.containsKey(a2[i])){
		            int x = hm.get(a2[i]);
		            for(int j=0;j<x;j++){
		                System.out.print(a2[i]+" ");
		            }
		            hm.remove(a2[i]);
		        }
		    }
		    
		    ArrayList<Integer> al = new ArrayList<Integer>();
		    int i=0;
		    for(int x:hm.keySet()){
		        int f = hm.get(x);
		        while(f-- > 0){
		            al.add(x);
		        }
		    }
		    
		    Collections.sort(al);
		    for(int j=0;j<al.size();j++){
		        System.out.print(al.get(j)+" ");
		    }
		    System.out.println();
		}
	}
}