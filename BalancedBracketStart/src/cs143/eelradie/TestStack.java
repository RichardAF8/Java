package cs143.eelradie;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.EmptyStackException;

import org.junit.jupiter.api.Test;

//No need to update this file
class TestStack {

	@Test
	public void testSizeStackEmpty() {
		
		Stack<Integer> stack = new Stack<Integer>();
		assertEquals(0, stack.size());		
		
	}
	@Test
	public void testisEmptyStackEmpty() {
		
		Stack<Integer> stack = new Stack<Integer>();
		assertTrue(stack.isEmpty());		
		
	}
	

	@Test
	public void testTopEmptyStack() throws EmptyStackException {
		
		Stack<Integer> stack = new Stack<Integer>();
    	assertThrows(EmptyStackException.class, ()->stack.top(), "Exception not throw as expected");
	  
	}
	
	@Test
	public void testPopEmptyStack() throws EmptyStackException {
		
		Stack<Integer> stack = new Stack<Integer>();
						
		assertThrows(EmptyStackException.class, ()->stack.pop(), "Exception not throw as expected");
	  
	 
	}
	@Test
	public void testTopAndPopEmptyStack() throws EmptyStackException {
		
		Stack<Integer> stack = new Stack<Integer>();
						
		
		assertThrows(EmptyStackException.class, ()->stack.topAndPop(), "Exception not throw as expected");
	}
	@Test
	public void testisEmptyAfterOnePush() {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		assertFalse(stack.isEmpty());		
		
	}
	
	@Test
	public void testSizeAfterOnePush() {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		assertEquals(1, stack.size());		
		
	}	
	@Test
	public void testTopAfterOnePush() {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		Integer expected = 5;
		assertEquals(expected, stack.top());		
		
	}
	
	
	@Test
	public void testTopAfterPushPop() throws EmptyStackException {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		stack.pop();
		assertThrows(EmptyStackException.class, ()->stack.top(), "Exception not throw as expected");
	}
	@Test
	public void testTopAfterPushPushPop()  {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(9);
		stack.push(7);
		stack.pop();
		Integer expected = 9;
		assertEquals(expected, stack.top());	
	}
	@Test
	public void testSizeAfterMultiplePush() {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		stack.push(4);
		stack.push(8);
		stack.push(3);		
		assertEquals(4, stack.size());		
		
	}
	@Test
	public void testSizeAfterPushPop() {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		stack.pop();		
		assertEquals(0, stack.size());		
		
	}
	
	@Test
	public void testisEmptyAfterMultiplePush() {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		stack.push(4);
		stack.push(8);
		stack.push(3);		
		assertFalse(stack.isEmpty());	
		
	}
	@Test
	public void testTopAfterMultiplePush() {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		stack.push(4);
		stack.push(8);
		stack.push(3);		
		Integer expected = 3;
		assertEquals(expected, stack.top());		
		
	}
	@Test
	public void testSizeAfterMultiplePushThenPop() {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		stack.push(4);
		stack.push(8);
		stack.push(3);	
		stack.pop();	
		assertEquals(3, stack.size());		
		
	}
	
	@Test
	public void testisEmptyAfterMultiplePushThenPop() {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		stack.push(4);
		stack.push(8);
		stack.push(3);	
		stack.pop();	
		assertFalse(stack.isEmpty());	
		
	}
	@Test
	public void testTopAfterMultiplePushThenPop() {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		stack.push(4);
		stack.push(8);
		stack.push(3);	
		stack.pop();	
		Integer expected = 8;
		assertEquals(expected, stack.top());	
		assertEquals(3, stack.size());	
		
	}
	@Test
	public void testTopAfterMultiplePushThenTopPop() {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		stack.push(4);
		stack.push(8);
		stack.push(3);	
		Integer expected = 3;
		assertEquals(expected, stack.topAndPop());		
		assertEquals(3, stack.size());	
		Integer expected2 = 8;
		assertEquals(expected2, stack.top());	
	}
	
	@Test
	public void testTopAfterMultiplePushPops() {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		stack.pop();	
		stack.push(4);
		stack.pop();	
		stack.push(8);
		stack.push(3);	
		
		Integer expected = 3;
		assertEquals(expected, stack.top());		
		
	}
	@Test
	public void testismakeEmptyAfterMultiplePush() {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		stack.push(4);
		stack.push(8);
		stack.push(3);	
		stack.makeEmpty();	
		assertTrue(stack.isEmpty());	
		assertEquals(0, stack.size());
		
	}
	@Test
	public void balanced()  {
String input = "{([()])}";
		String leftBrackets = "[{(";
		String rightBrackets = "]})";
		
		assertTrue(Main.balanced(input, leftBrackets, rightBrackets));
	}
	@Test
	public void unbalanced()  {
String input = "{([)])}";
		String leftBrackets = "[{(";
		String rightBrackets = "]})";
		
		assertFalse(Main.balanced(input, leftBrackets, rightBrackets));
	}
	
	@Test
	public void testTopAfterPushMakeEmpty() throws EmptyStackException {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		stack.push(4);
		stack.push(8);
		stack.push(3);	
		stack.makeEmpty();	
		assertThrows(EmptyStackException.class, ()->stack.top(), "Exception not throw as expected");
	
	}
	
	@Test
	public void testMain()  {
	    System.out.println("main");
	    String[] args = null;
	    Main.main(args);
	   
	}
}
