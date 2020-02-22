package cs143.eelradie;

import java.util.ArrayList;

public class StockSpan {

	private ArrayList<Integer> prices = new ArrayList<Integer>();
	private ArrayList<Integer> spans = new ArrayList<Integer>();

	public StockSpan() {
		super();
	}

	/*
	 * Fill the spans arrayList with the span for the day or the same index in
	 * prices. ###### Use Brute Force ######
	 */
	void calculateSpansBruteForce() {
		for (int i = 0; i < prices.size(); i++) {
			int currSpan = 1;

			for (int j = i - 1; (j >= 0) && (prices.get(i) >= prices.get(j)); j--) {
				currSpan++;
			}
			spans.add(currSpan);
		}
	}

	/*
	 * Fill the spans arrayList with the span for the day or the same index in
	 * prices. ###### Use better algorithm -- Stack based algorithm?! ######
	 */
	private void calculateSpans() {

		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < prices.size(); i++) {

			while (!stack.isEmpty() && prices.get(stack.top()) <= prices.get(i)) {
				stack.pop();
			}
			spans.add(stack.isEmpty() ? (i + 1) : (i - stack.top()));
			stack.push(i);
		}
	}

	public void addPrices(int price) {

		prices.add(price);

	}

	public void print() {
		calculateSpansBruteForce();
		for (int i = 0; i < spans.size(); i++) {
			System.out.printf("| D:%d S:%d |", i, spans.get(i));
		}
		System.out.println();
	}

	public int getSpan(int day) {
		calculateSpansBruteForce();
		if (day >= spans.size()) {
			return -1;
		}
		return spans.get(day);
	}
}