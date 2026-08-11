package Logical_Programs;

import java.util.Stack;
// using stack
public class ReverseString_03 {

	public static void main(String[] args) {
		String str = "Ajinkya";
		Stack<Character> stack = new Stack<>();
		for (char ch : str.toCharArray()) {
			stack.push(ch);
		}
		while (!stack.isEmpty()) {
			System.out.print(stack.pop());
		}

	}

}
