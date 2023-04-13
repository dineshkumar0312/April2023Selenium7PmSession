package javaSession;

public class IncrementalAndDecrementalOperator {
	/*
	 * Post Inc - var++ Assignment / Increment Pre Inc - ++var
	 * 
	 */

	public static void main(String[] args) {

		int x = 10;

		System.out.println(x++);

		System.out.println(x);

		int p = 25;

		System.out.println(p++);

		System.out.println(p);

		int l = 25;
		l++;
		System.out.println(l);

		int i1 = 22;

		int i2 = i1++;

		System.out.println(i1);
		System.out.println(i2);

		int k1 = 14;
		k1 = k1++;
		System.out.println(k1);

		int l1 = 10;
		int l2 = l1--;

		System.out.println(l1);
		System.out.println(l2);

		int k11 = 100;
		k11 = k11--;

		System.out.println(k11);

		int g1 = 10;

		System.out.println(--g1); // 9
		System.out.println(++g1); // 10
		System.out.println(g1++); // 10
		System.out.println(g1--); // 11

	}

}
