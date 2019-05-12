package com.java.ds.linkedList;

public class SingleNode<T>{
	private Node<T> head;
	private Node<T> tail;
	
	public void push(T value){
		Node<T> node = new Node<T>();
		node.setValue(value);
		if(head == null){
			head = node;
			tail = node;
		}else{
			tail.setNext(node);
			tail = node;
		}
	}
	
	public void traverse(){
		Node<T> tmp = head;
		while (true) {
			if(tmp == null){
				break;
			}
			System.out.println(" Iterate the values: "+ tmp.getValue());
			tmp = tmp.getNext();
		}
	}
	public static void main(String[] args) {
		SingleNode<Integer> singleNode = new  SingleNode<Integer>();
		singleNode.push(10);
		singleNode.push(20);
		singleNode.push(30);
		singleNode.traverse();
	}

	class Node<T> implements Comparable<T> {
		private T value;
		private Node<T> next;

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

		@Override
		public int compareTo(T args) {
			if (args == this.value) {
				return 0;
			} else {
				return 1;
			}
		}

	}
}
