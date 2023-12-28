
public class MergeTwoSortedList {
	public static ListNode mergeTwoSortedList(ListNode l1, ListNode l2) {
		if(l1==null)
			return l2;
		if(l2==null)
			return l1;
		if(l1.val<l2.val) {
			l1.next = mergeTwoSortedList(l1.next, l2);
			return l1;
		}
		else {
			l2.next = mergeTwoSortedList(l1, l2.next);
			return l2;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1,null);
		l1.next = new ListNode(4,null);
		l1.next.next = new ListNode(7,null);
		l1.next.next.next = new ListNode(9,null);
		l1.next.next.next.next = new ListNode(12,null);
		
		ListNode l2 = new ListNode(2,null);
		l2.next = new ListNode(5,null);
		l2.next.next = new ListNode(8,null);
		l2.next.next.next = new ListNode(10,null);
		l2.next.next.next.next = new ListNode(15,null);
		
		ListNode mergedList = mergeTwoSortedList(l1, l2);
		ListNode.printListNode(mergedList);
	}

}