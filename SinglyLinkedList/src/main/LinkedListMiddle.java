package main;

public class LinkedListMiddle {
	private Node head;
	
	private static class Node {
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	private void getMiddleNode() {
		Node slowPointer = head, fastPointer = head;
		while (slowPointer.next != null && fastPointer.next != null && fastPointer.next.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
		}
		System.out.println("Middle Node Data: " + slowPointer.data);
	}
	
	public static void main(String[] args) {
		LinkedListMiddle list = new LinkedListMiddle();
		list.head = new Node(1);
		Node nodeTwo = new Node(2);
		Node nodeThree = new Node(3);
		Node nodeFour = new Node(4);
		Node nodeFive = new Node(5);
		Node nodeSix = new Node(6);
		list.head.next = nodeTwo;
		nodeTwo.next = nodeThree;
		nodeThree.next = nodeFour;
		nodeFour.next = nodeFive;
		nodeFive.next = nodeSix;
		list.getMiddleNode();
	}
}
