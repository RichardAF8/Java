package cs143.eelradie;

public class Stack<Item> implements StackInterface<Item> {

	private Node<Item> head = new Node<Item>();
	private int size;

	private static class Node<Item> {
		private Item data;
		private Node<Item> next;

		public Node(Item data, Node<Item> next) {
			this.data = data;
			this.next = next;
		}

		public Node(Item data) {
			this.data = data;
			this.next = next;

		}

		public Node() {
			this.data = null;
			this.next = null;
		}
	}

	public Stack() {
		head = null;
		size = 0;
	}

	@Override
	public void push(Item item) {
		// TODO Auto-generated method stub
		head.next = new Node(item,head.next);
		size++;
	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		head = head.next;
	}

	@Override
	public Item top() {
		// TODO Auto-generated method stub
		return head.data;
	}

	@Override
	public Item topAndPop() {
		// TODO Auto-generated method stub
		Item temp = this.top();
		this.pop();
		return temp;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (size == 0);
	}

	@Override
	public void makeEmpty() {
		// TODO Auto-generated method stub
		head = null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
}