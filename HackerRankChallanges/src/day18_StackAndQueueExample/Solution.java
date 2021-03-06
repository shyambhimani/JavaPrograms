/**
 * Copyright 2016 Shyam Bhimani
 */
package day18_StackAndQueueExample;

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {

	LinkedList queue;
	LinkedList stack;

	public Solution() {
		queue = new LinkedList();
		stack = new LinkedList();
	}

	// Pushes characters in stack
	public void pushCharacter(char ch) {
		stack.addFirst(ch);
	}

	// Add characters at back of queue
	public void enqueueCharacter(char ch) {
		queue.addLast(ch);
	}

	// Remove first element of Stack LIFO
	public char popCharacter() {
		return (char) stack.pop();
	}

	// Remove element for head of queue FIFO
	public char dequeueCharacter() {
		return (char) queue.removeFirst();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		Solution p = new Solution();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		// Pop/Dequeue the chars at the head of both data structures and compare
		// them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length / 2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;
				break;
			}
		}

		// Finally, print whether string s is palindrome or not.
		System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));

	}

}
