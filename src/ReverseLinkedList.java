
public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1,null);
		head.next = new ListNode(2,null);
		head.next.next = new ListNode(3,null);
		head.next.next.next = new ListNode(4,null);
		head.next.next.next.next = new ListNode(5,null);
		
		ListNode.printListNode(head);
		head = ListNode.reverseListNode(head);
		System.out.println("");
		ListNode.printListNode(head);
	}

}
class ListNode{
	int val;
	ListNode next;
	
	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
	
	public static void printListNode(ListNode node) {
		if(node==null) {
			return;
		}
		System.out.print(node.val);
		System.out.print(" ");
		printListNode(node.next);
	}
	
	public static ListNode reverseListNode(ListNode node) {
		if(node==null || node.next==null)
			return node;
		ListNode newHead = reverseListNode(node.next);
		node.next.next = node;
		node.next = null;
		
		return newHead;
	}
}
