package com.greatlearning.skyscraper;

import java.util.Stack;

public class SkyscraperImpl {

	public void order(int total_floors, int[] floor_size) throws Exception {

		int max = 0;
		// gives the largest floor size
		for (int i = 0; i < total_floors; i++) {
			max = Math.max(max, floor_size[i]);
		}

		Stack<Integer> stk = new Stack<Integer>();
		Stack<Integer> stk1 = new Stack<Integer>();
		int[] arr = new int[total_floors];

		boolean flag = true;

		for (int i = 0, temp = 0; i < total_floors; i++) {
			temp = (int) floor_size[i];
			// inserts the elements in to array until we get largest floor
			// which turns flag to false after getting largest floor
			if (temp == max) {
				flag = false;
				arr[i] = temp;
				System.out.println("Day: " + (i + 1));
				// pushes the elements in to stack which are of less size
				for (int j = 0; j <=i; j++) {
					try {
						if (floor_size[i + 1] > arr[j]) {
							stk.push(arr[j]);
						}

						else {
							// prints the floor which are max size compared to other floors in the array
							stk1.push(arr[j]);
							
						}
					} catch (Exception e) {
						stk.push(arr[j]);
					}
				}
				// to pop from stack after getting max size
				while (!stk1.isEmpty() ) {
					System.out.print(stk1.pop() + " ");
				}
				// to pop from stack pointer reaches to final day
				while (!stk.isEmpty() && i == total_floors - 1) {
					System.out.print(stk.pop() + " ");
				}
				System.out.println("");
				continue;
			}
			if (flag) {
				System.out.println("Day: " + (i + 1));
				arr[i] = floor_size[i];
				System.out.println("");
			} else {
				// check if stack is empty and perform push or pop operations
				if (stk.isEmpty()) {
					System.out.println("Day: " + (i + 1));
					stk.push(floor_size[i]);

					try {
						if (floor_size[i + 1] < stk.peek()) {
							System.out.println(stk.pop());
						}
					} catch (Exception e) {
						System.out.println(stk.pop());
					}
					System.out.println("");
				}
				// pop from stack
				else if (stk.peek() > floor_size[i]) {
					System.out.println("Day: " + (i + 1));

					while (!stk.isEmpty() && floor_size[i + 1] < stk.peek()) {
						System.out.print(stk.pop() + " ");
					}

					System.out.println("");

				}

				// push into stack
				else if (stk.peek() < floor_size[i]) {
					System.out.println("Day: " + (i + 1));
					stk.push(floor_size[i]);

					while (!stk.isEmpty() && (i == total_floors - 1 || floor_size[i + 1] < stk.peek())) {
						System.out.print(stk.pop() + " ");
					}

					System.out.println("");
				}
			}
		}

	}
}
