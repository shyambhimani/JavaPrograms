package thirtyDaysChallange;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StrtingManipulation {
	int t;
	char s;

	Scanner sc = new Scanner(System.in);

	public void gettingStringInput() {
		for (t = sc.nextInt(); t > 0; t--) {

			char s[] = sc.next().toCharArray();

			for (int i = 0; i < s.length; i++) {
				if (i % 2 == 0) {
					System.out.print(s[i]);

				}

			}

			System.out.print(" ");

			for (int i = 0; i < s.length; i++) {
				if (i % 2 != 0) {

					System.out.print(s[i]);
				}

			}
			System.out.println();

		}

	}

	public void putStringInArray() {

	}

	public static void main(String[] args) {

		StrtingManipulation s1 = new StrtingManipulation();

		s1.gettingStringInput();

	}
}