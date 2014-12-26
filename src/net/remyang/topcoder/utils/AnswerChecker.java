package net.remyang.topcoder.utils;

public class AnswerChecker {
	public static void verify(int[] expected, int[] actual) {
		assert expected.length == actual.length : build("expected.length",
				expected.length) + "==" + build("actual.length", actual.length);
		for (int i = 0; i < expected.length; i++) {
			assert expected[i] == actual[i] : build("expected[" + i + "]",
					expected[i]) + "==" + build("actual[" + i + "]", actual[i]);
		}
	}

	private static String build(String name, int value) {
		return name + "(" + value + ")";
	}

	public static void verify(int expected, int actual) {
		assert expected == actual : build("expected", expected) + "=="
				+ build("actual", actual);
	}
}
