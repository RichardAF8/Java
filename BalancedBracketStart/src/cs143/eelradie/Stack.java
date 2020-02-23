package cs143.eelradie;

import java.util.*;

public class Stack<Item> implements StackInterface<Item> {

	private ArrayList<Item> array;
	private Item top;

	public Stack() {
		array = new ArrayList<>();
	}

	@Override
	public void push(Item item) {

		array.add(0, item);
	}

	@Override
	public void pop()throws EmptyStackException  {
		if (this.isEmpty() == false) {
			array.remove(0);
		} else {
			System.out.print("Stack is Empty!");
		}
	}

	@Override
	public Item top() throws EmptyStackException   {
		if (this.isEmpty() == false) {
			return array.get(0);
		} else {
			System.out.print("Stack is Empty!");
			return null;
		}
	}

	@Override
	public Item topAndPop()throws EmptyStackException  {
		if (this.isEmpty() == false) {
			top = array.get(0);
			this.pop();
			return top;
		} else {
			System.out.print("Stack is Empty!");
			return null;
		}
	}

	@Override
	public boolean isEmpty() {
		if (this.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void makeEmpty() {
		array.clear();
	}

	@Override
	public int size()throws EmptyStackException  {

		return array.size();
	}
}
