package net.remyang.topcoder.utils;

public class ArrayHelper {

	public static void print(int[] array) {
		System.out.print("{ " + array[0]);
		for (int i = 1; i < array.length; i++) {
			System.out.print(", " + array[i]);
		}
		System.out.println(" }");
	}
}
