package com.fscoding;

public class LinkedList {

	public class Node {

		int data;
		Node next;

		public Node(int data) {

			this.data = data;
			this.next = null;
		}
	}

	private Node head = null;
	private Node tail = null;

	// add node
	public void add(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;

		}

		tail.next = newNode;
		tail = newNode;
	}
	
// add Node
	public void adds(int data) {

		if (head == null)
			head = new Node(data);
		else {
			add(head, data);
		}
	}

	public void add(Node head, int data) {

		if (head.next == null)
			head.next = new Node(data);
		else
			add(head.next, data);

	}

	@Override
	public String toString() {

		String str = "{";

		Node node = head;
		while (node != null) {

			str += node.data+",";
			node = node.next;
		}

		return str + "}";
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
	
		
		System.out.println(list.toString());

	}
}
