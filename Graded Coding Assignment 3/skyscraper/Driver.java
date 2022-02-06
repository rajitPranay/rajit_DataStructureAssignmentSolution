package com.greatlearning.skyscraper;

import java.util.Scanner;

public class Driver {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		System.out.println("Enter the total no of floors in the building");
		int total_floors = sc.nextInt();

		// get the input floor from user
		int[] floor_size = new int[total_floors];
		for (int i = 0; i < total_floors; i++) {
			System.out.println("Enter the floor size given on day : " + (i + 1));
			floor_size[i] = sc.nextInt();
		}

		SkyscraperImpl sky = new SkyscraperImpl();
		sky.order(total_floors, floor_size);
	}
}
