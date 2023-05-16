package main;

public class SinglyLinkedList {
	private Node head;

	private static class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// TC is O(1) & SC is O(1) 
	public void insertAtBeginning() {
		Node newNode = new Node(0);
		newNode.next = head;
		head = newNode;
	}

	// TC is O(N) & SC is O(1)
	public void insertAtEnd() {
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		Node newNode = new Node(4);
		current.next = newNode;
	}
	
	// TC is O(N) & SC is O(1)
	public void insertAtGivenPosition(int position) {
		Node newNode = new Node(5);
		
		Node current = head;
        for (int i = 1; i < position-1; i++) {
        	current = current.next;
        }
		newNode.next = current.next;
		current.next = newNode;
	}
	
	public void insertInSortedLinkedList(int data) {
		Node current = head;
		Node insertNode = new Node(data);
		
		if (data <= current.data) {
			insertNode.next = current;
			
		}
		while (current.next.data <= data) {
			
		}
	}
	
	//TC is O(1) & SC is O(1)
	public void deleteFirstNode() {
		head = head.next;
	}
	
	// TC is O(N) & SC is O(1)
	public void deleteLastNode() {
		Node current = head;
		while (current.next.next != null) {
			current = current.next;
		}
		current.next = null;
	}
	
	public void deleteNodeWithPointer(Node nodeToDelete) {
		nodeToDelete.data = nodeToDelete.next.data;
		nodeToDelete.next = nodeToDelete.next.next;
	}

	// TC is O(N) & SC is O(1)
	public void traverse() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		list.head.next = second;
		second.next = third;
		list.insertAtBeginning();
		list.insertAtEnd();
		list.insertAtGivenPosition(3);
//		list.deleteFirstNode();
//		list.deleteLastNode();
//		list.deleteNodeWithPointer(third);
		list.traverse();
	}
}
