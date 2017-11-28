/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 class for LinkedList creation
class Intersect
{
    Node head;  // head of list
   
}
This is method only submission.  You only need to complete the method. */



class gfg
{
         Intersect llist3 = new Intersect();
         Node head;
         // object of LinkedList having Intersection of two LinkedLists
        // Function  to find Intersection of two LinkedLists
	void getIntersection(Node head1, Node head2)
        {
            Node l1 = head1;
            Node l2 = head2;
            Node temp = null;
            while(l1!=null && l2!=null){
                if(l1.data==l2.data){
                    if(llist3.head!=null){
                        Node t2 = new Node(l1.data);
                        temp.next = t2;
                        temp = temp.next;
                       // temp.next=null;
                    }
                    else{
                        Node t1 = new Node(l1.data);
                        temp = t1;
                        temp.next=null;
                        llist3.head = temp;
                        
                    }
                    l1 = l1.next;
                    l2 = l2.next;
                }
                else if(l1.data > l2.data){
                    l2 = l2.next;
                }
                else{
                    l1 = l1.next;
                }
            }
            
             // Your code here
	 }
}