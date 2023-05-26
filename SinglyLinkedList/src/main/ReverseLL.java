package main;


public class ReverseLL {
	private Node head;
	
	private static class Node {
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	private void reverse() {
		if (head == null) {
			return;
		}
		
		Node next = head.next;
		head.next = null;
		
		while (next != null) {
			Node current = next;
			
			if (next.next != null) {
			    next = next.next;
			} else {
				next = null;
			}
			
			current.next = head;
			head = current;
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
		ReverseLL list = new ReverseLL();
		list.head = new Node(1);
/*		Node nodeTwo = new Node(2);
		Node nodeThree = new Node(3);
		Node nodeFour = new Node(4);
		Node nodeFive = new Node(5);
		Node nodeSix = new Node(6); */
/*		list.head.next = nodeTwo;
		nodeTwo.next = nodeThree;
		nodeThree.next = nodeFour;
		nodeFour.next = nodeFive;
		nodeFive.next = nodeSix; */
		list.reverse();
		list.traverse();
	}
}
