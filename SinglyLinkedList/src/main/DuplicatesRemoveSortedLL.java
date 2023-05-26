package main;

public class DuplicatesRemoveSortedLL {
	private Node head;
	
	private static class Node {
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	private void removeDuplicatesInSortedLL() {
		if (head == null) {
			return;
		}
		
		Node current = head;
		while (current != null && current.next != null && current.next.next != null) {
			if (current.next.data == current.next.next.data) {
				current.next = current.next.next;
			}
			current = current.next;
		}
		
		if (head.data == head.next.data) {
			head = head.next;
		}
	}
	
	public void traverse() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		DuplicatesRemoveSortedLL list = new DuplicatesRemoveSortedLL();
		list.head = new Node(1);
		Node nodeTwo = new Node(1);
		Node nodeThree = new Node(1);
		Node nodeFour = new Node(7);
		Node nodeFive = new Node(9);
		Node nodeSix = new Node(9); 
		list.head.next = nodeTwo;
		nodeTwo.next = nodeThree;
		nodeThree.next = nodeFour;
		nodeFour.next = nodeFive;
		nodeFive.next = nodeSix; 
		list.removeDuplicatesInSortedLL();
		list.traverse();
	}
}
