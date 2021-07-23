package sqrNum;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new InputStreamReader(System.in));
		int[] list = new int[1000];
		for (int i = 0; i<1000; i++) {
			list[i] = ((int) Math.pow(i,2));
		}
		while (in.hasNext()) {
			int a = in.nextInt();
			int b = in.nextInt();
			int counter =0;
			if (a == 0 && b == 0) {
				break;
			}
			for (int i = 0; i<1000; i++) {
				if (list[i] > b) {
					break;
				}
				if (list[i] >= a) {
					counter++;
				}
			}
			System.out.println(counter);
		}
		in.close();
	}

}
