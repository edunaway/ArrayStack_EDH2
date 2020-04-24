/**
 * This is the test class it test all the methods from the ArrayStack class.
 * It can tell if the array is empty, size, and the peek of the stack. 
 */

package jsjf;

import java.util.Arrays; 
import jsjf.ArrayStack; 

public class TestStack {

	public static void main(String[] args) {
		ArrayStack<Integer> stack = new ArrayStack<Integer>();
		
		System.out.println("Testing");
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.pop(); 
		
		//top would be 3 
		
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.pop();
		stack.push(9);
		stack.push(10);
		
		System.out.println("the peek would be:"+stack.peek());
		System.out.println("the size would be:"+stack.size());
		System.out.println("Stack is empty:"+stack.isEmpty()); 

	}

}
