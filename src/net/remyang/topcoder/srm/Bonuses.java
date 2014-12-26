/**
 * 
 */
package net.remyang.topcoder.srm;

import net.remyang.topcoder.utils.AnswerChecker;

/**
 * http://community.topcoder.com/stat?c=problem_statement&pm=1677&rd=4530
 * 
 */
public class Bonuses {
	public static void main(String[] args) {
		Bonuses c = new Bonuses();
		AnswerChecker.verify(new int[] { 6, 13, 20, 27, 34 },
				c.getDivision(new int[] { 1, 2, 3, 4, 5 }));

		AnswerChecker.verify(new int[] { 17, 17, 17, 17, 16, 16 },
				c.getDivision(new int[] { 5, 5, 5, 5, 5, 5 }));

		AnswerChecker.verify(
				new int[] { 8, 6, 4, 2, 8, 5, 5, 3, 1, 4, 5, 4, 6, 3, 5, 4, 1,
						8, 1, 6, 3, 8 },
				c.getDivision(new int[] { 485, 324, 263, 143, 470, 292, 304,
						188, 100, 254, 296, 255, 360, 231, 311, 275, 93, 463,
						115, 366, 197, 470 }));
	}

	public int[] getDivision(int[] points) {

		int[] ret = new int[points.length];
		int sum = 0;
		for (int i = 0; i < points.length; i++) {
			sum += points[i];
		}
		int fracSum = 0;
		for (int i = 0; i < points.length; i++) {
			ret[i] = (int) Math.floor(points[i] * 100.0 / sum);
			fracSum += ret[i];
		}
		int bonusLeft = 100 - fracSum;
		if (bonusLeft > 0) {
			int[] ranking = new int[points.length];
			for (int i = 0; i < points.length; i++) {
				ranking[i] = i;
			}

			for (int i = 0; i < bonusLeft; i++) {
				for (int j = i; j < points.length; j++) {
					if (points[ranking[i]] < points[ranking[j]]) {
						int t = ranking[i];
						ranking[i] = ranking[j];
						ranking[j] = t;
					}
				}
			}

			for (int i = 0; i < bonusLeft; i++) {
				ret[ranking[i]] = ret[ranking[i]] + 1;
			}
		}
		return ret;
	}
}
