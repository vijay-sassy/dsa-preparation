package main;

import java.util.Stack;

public class NthNodeFromEndLL {
	private Node head;
	private static int nthNodeIterator;
	
	private static class Node {
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	private void getNthNodeFromEndWithStack(int nthNode) {
		Stack<Node> stack = new Stack<>();
		
		Node current = head;
		while (current != null) {
			stack.add(current);
			current = current.next;
		}
		
		for (int i = 0; i < nthNode; i++) {
			if (i != nthNode-1) {
				stack.pop();
			} else {
				System.out.println(stack.pop().data);
			}
		}
	}
	
	private void getNthNodeFromEndWithRecursion(int nthNode, Node head) {
		if (head == null) {
			return;
		}
		
		getNthNodeFromEndWithRecursion(nthNode, head.next);
		nthNodeIterator++;
		
		if (nthNode == nthNodeIterator) {
		    System.out.println(head.data);
		    return;
		}
		
	}
	
	public static void main(String[] args) {
		NthNodeFromEndLL list = new NthNodeFromEndLL();
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
//		list.getNthNodeFromEndWithStack(6);
		list.getNthNodeFromEndWithRecursion(1, list.head);
	}
}
