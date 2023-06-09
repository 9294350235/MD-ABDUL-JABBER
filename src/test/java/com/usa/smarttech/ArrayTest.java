package com.usa.smarttech;

import java.util.Arrays;

public class ArrayTest {

	// 1, 2, 3, 4, 5, 6,
	// 2 2, 3, 4, 5, 6,
	// 3 7, 8, 9, 9, 4,
	// 4 3, 5, 6, 7, 8,

	public static void main(String[] args) {
		ArrayTest obj = new ArrayTest();
		obj.getSingleDimensionArray();

		// obj.getMultiDimensionArray();
		// How many types of array in java?
		// Ans: There are many types of array in java
		// ex: Single Dimension Array []
		// Multi Dimension Array [][]
		// Why is require Single Dimension Array[]?
		// Ans: In order to read single row or
		// single column data than we have to use Single Dimension Array []
		// Why is require Multi Dimension Array[][]?
		// Ans: In order to read multiple row and multiple column we have to use
		// Multi Dimension Array[][]

		// How to declare array in java?

	}

	public void getSingleDimensionArray() {
		int num[] = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(num);
		System.out.println(num[2]);

		System.out.println(Arrays.toString(num));
		String name = "1, 2, 3, 4, 5, 6, 7";
		System.out.println(name);
	}

	public void getMultiDimensionArray() {
		int num[][] = { { 1, 2, 3, 4, 5, 6, 7 }, 
				{ 1, 2, 6, 4, 5, 7, 8 }, 
				{ 1, 2, 3, 4, 5, 6 } };
		System.out.println(num[1][2]);
		// System.out.println(Arrays.toString(num));

	}

}
