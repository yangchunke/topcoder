package net.remyang.topcoder.srm;

import net.remyang.topcoder.utils.AnswerChecker;

/**
 * http://community.topcoder.com/stat?c=problem_statement&pm=13553&rd=16085
 *
 */
public class ForgetfulAddition {

	public static void main(String[] args) {
		ForgetfulAddition c = new ForgetfulAddition();
		AnswerChecker.verify(4, c.minNumber("22"));
		AnswerChecker.verify(15, c.minNumber("123"));
		AnswerChecker.verify(101, c.minNumber("1289"));
		AnswerChecker.verify(9067, c.minNumber("31415926"));
		AnswerChecker.verify(863, c.minNumber("98765"));
		AnswerChecker.verify(1054, c.minNumber("96985"));
	}

	/**
	 * @param expression
	 *            expression will contain between 2 and 8 characters, inclusive.
	 *            Each character of expression will be between '1' and '9'.
	 * @return
	 */
	public int minNumber(String expression) {

		int halfLen = expression.length() / 2;
		if (expression.length() % 2 != 0) {
			int front = 0;
			int back = halfLen;
			while (front < halfLen) {
				if (expression.charAt(front) < expression.charAt(back)) {
					halfLen += 1;
					break;
				}
				front++;
				back++;
			}
		}

		int i1 = Integer.parseInt(expression.substring(0, halfLen));
		int i2 = Integer.parseInt(expression.substring(halfLen,
				expression.length()));
		return i1 + i2;
	}
}
