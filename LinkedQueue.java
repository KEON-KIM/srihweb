package Queue;


public class LinkedQueue {
	private Node back;
	private Node front;
	
	private class Node{
		private Object data;
		private Node prevNode;
		private Node nextNode;
	
		Node(Object item,Node p,Node n){
			data=item;
			prevNode=p;
			nextNode=n;
		}
		public Object getData() {return data;}
		public Node getPrev() {return prevNode;}
		public Node getNext() {return nextNode;}
		public void setPrev(Node p) {prevNode=p;}
		public void setNext(Node n) {nextNode=n;}
	}
	public LinkedQueue() {
		back= new Node(null,null,null);
		front=new Node(null,back,null);
	}
		
	public boolean empty() {
		return (back.getNext()==null);
	}
	public boolean Empty() {
		return (front.getPrev()==back);
	}
	public void Enqueue(Object item) {

		if(empty()) {
			Node newNode = new Node(item,null,null);
			back.setNext(newNode);
			newNode.setNext(front);
			newNode.setPrev(back);

		}
		else{
			Node newNode = new Node(item,null,null);
			newNode.setNext(back.nextNode);
			newNode.setPrev(back);
			back.nextNode.setPrev(newNode);
			back.setNext(newNode);

		}
		
	}

	public Object peek() {
		if(Empty()) 
			throw new ArrayIndexOutOfBoundsException();
		System.out.println(front.getData());
		return front.getPrev().getData();
	}
	public Object Dequeue() {
		front.setPrev(front.getPrev().getPrev());
		return peek();
	}
	
}
