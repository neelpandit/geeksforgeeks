import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-- > 0){
		    String ans;
		    String s = sc.next();
		    int flag = 1;
		    Stack<Character> st = new Stack<Character>();
		    for(int i=0;i<s.length();i++){
		        char c = s.charAt(i);
		        if(open(c)){
		            st.push(c);
		        }
		        else{
		            char p;
		            if(!st.empty()){
		                p = st.pop();
		            }
		            else{
		               ans = "not balanced";
		               flag = 0;
			                break; 
		            }
		            if(c==')'){
		            	if(p!='('){
		            		ans = "not balanced";
		            		flag = 0;
			                break;
		            	}
		            }
		            if(c=='}'){
		            	if(p!='{'){
		            		ans = "not balanced";
		            		flag = 0;
			                break;
		            	}
		            }
		            if(c==']'){
		            	if(p!='['){
		            		ans = "not balanced";
		            		flag = 0;
			                break;
		            	}
		            }
		        }
		    }
		    if(flag==1 && st.empty()){
		        ans = "balanced";
		    }
		    else{
		        ans = "not balanced";
		    }
		    System.out.println(ans);
		    
		}
	}
	
	public static boolean open(char c){
	    if(c=='('||c=='{'||c=='['){
	        return true;
	    }
	    else{
	        return false;
	    }
	}
}

