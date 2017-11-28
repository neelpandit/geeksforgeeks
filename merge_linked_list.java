/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

class gfg
{
    Node MergeLists(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method
     Node h;
     if(headA.data <= headB.data){
         h = headA;
         headA = headA.next;
     }
     else{
         h = headB;
         headB = headB.next;
     }
     Node temp=h;
     while(headA!=null && headB!=null){
         
         if(headA.data <= headB.data){
             temp.next=headA;
             temp=headA;
             headA=headA.next;
         }
         else{
             temp.next=headB;
             temp=headB;
             headB=headB.next;
         }
     }
     if(headA!=null){
         while(headA!=null){
             temp.next = headA;
             temp=headA;
             headA=headA.next;
         }
     }
     else{
         while(headB!=null){
             temp.next = headB;
             temp = headB;
             headB=headB.next;
         }
     }
     Node t = h;
     /*while(t!=null){
         System.out.print(t.data+" ");
         t=t.next;
     }*/
     return h;
   } 
}
