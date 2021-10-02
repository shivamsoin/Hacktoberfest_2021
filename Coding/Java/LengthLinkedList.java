class node<T>
{
 T data;
 node next;
 node(T data)
 {
  this.data= data;
 }
}

class LengthLinkedList {
 public static node<Integer> createLinkedlist()
 {
  node<Integer> n1 = new node<>(10);
  node<Integer> n2 = new node<>(20);
  node<Integer> n3 = new node<>(30);
  node<Integer> n4 = new node<>(40);
  n1.next=n2;
  n2.next=n3;
  n3.next=n4;
  return n1;
 } 
 public static void printIth(node<Integer> head,int n)
 {
  int count=0;
  node<Integer> temp = head;
  while(temp!=null)
  {
   count++;
   if(n==count)
   {
    System.out.println(temp.data);
   }
   temp=temp.next;
  } 
 }
 public static void main(String args[])
 {
   node<Integer> head = createLinkedlist();
   printIth(head ,3);
 }
}
