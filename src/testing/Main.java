package testing;
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(new InputStreamReader(System.in));
		int i = 0;
		int c = in.nextInt();
		while (in.hasNext()) {
			i++;
			int a = in.nextInt();
			int b = in.nextInt();
			int k = in.nextInt();
			if (a >= 20 && b >= 20 && k >= 20) {
				System.out.println("case " + i + ": good");
			} else {
				System.out.println("case " + i + ": bad");
			}
			if (i == c) {
				return;
			}
		}
	}
}