/* Structure of Linked List
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}*/
class GfG
{
    Node removeDuplicates(Node head)
    {
	// Your code here	
	if(head.next==null){
	    return head;
	}
	else{
	    Node h = head;
	    Node current=head;
	    Node n = head.next;
	    while(n!=null){
	    if(current.data==n.data){
	        n=n.next;
	    }
	    else{
	        current.next=n;
	        current=n;
	        n=n.next;
	    }
	    }
	    current.next=null;
	    return h;
	}
    }
}
