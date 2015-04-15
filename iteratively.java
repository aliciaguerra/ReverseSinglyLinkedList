package ds;
public class ReverseSingleListIterative
{
public ReverseSingleListIterative(){
}

public ListNode ReverseList(ListNode headerNode)
{
ListNode prevNode=null;
ListNode currNode=headerNode;
ListNode nextNode=null;

while (currNode != null)
{
nextNode=currNode.next;
currNode.next=prevNode;
prevNode=currNode;
currNode=NextNode;
}
return prevNode;
}

public static void main(String[] args)
{
//Constructing singly linked list
//1-> 2 -> 3 -> 4 -> 5

SingleLinkedList newList = new SingleLinkedList();
newList.add(1);
newList.add(2);
newList.add(3);
newList.add(4);
newList.add(5);
System.out.println("List before reversal");
newList.printList();

ListNode headerNode = newList.getList();
ReverseSingleListIterative reverseListIter = new ReverseSingleListIterative();
headerNode=reverseListIter.reverseList(headerNode);
newList.setList(headerNode);
System.out.println("List after traversal");
newList.printList();
}

