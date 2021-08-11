package Day14;

public class SingleLinkedList {
	// Create a HEAD node of type instance variable
	private static ListNode head;

	// ListNode is a Inner Class
	public static class ListNode {
		private int data; // Data May be generic
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

		public static void main(String[] args) {
			SingleLinkedList singleLinkedList = new SingleLinkedList();
			singleLinkedList.head = new ListNode(56);
			ListNode second = new ListNode(30);
			ListNode third = new ListNode(70);
			singleLinkedList.head.next = second;
			second.next = third;
			ListNode newNode = new ListNode(40);
			newNode.next = third;
			second.next = newNode;
			singleLinkedList.printLinkedList();
			if (singleLinkedList.find(singleLinkedList.head, 30)) {
				System.out.println("Search Key found !!!");
			} else {
				System.out.println("Search Key not found !!!");
			}
		}

	}

	public boolean find(ListNode head, int searchkey) {
		if (head == null) {
			return false;
		}
		ListNode current = head;
		while (current != null) {
			if (current.data == searchkey) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public static void printLinkedList() {
		ListNode pointer = head;
		while (pointer != null) {
			System.out.print(pointer.data + "===>");
			pointer = pointer.next;
		}
		System.out.println("null");
	}

}
