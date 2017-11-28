import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-- > 0){
	        int r=sc.nextInt();
	        int c=sc.nextInt();
	        int a[][]=new int[r][c];
	        for(int i=0;i<r;i++){
	            for(int j=0;j<c;j++){
	                a[i][j]=sc.nextInt();
	            }
	        }
	        int e=sc.nextInt();
	        System.out.println(find(a,0,c-1,r,c,e));
	        
	    }
	}
	public static int find(int a[][],int x,int y,int r,int c,int e){
	    if(x<0 || y<0 || x>=r || y>= c){
	        return 0;
	    }
	    else{
	        if(a[x][y] == e){
	            return 1;
	        }
	        else if(a[x][y] > e){
	            return find(a,x,y-1,r,c,e);
	        }
	        else{
	            return find(a,x+1,y,r,c,e);
	        }
	        //return 0;
	    }
	}
}