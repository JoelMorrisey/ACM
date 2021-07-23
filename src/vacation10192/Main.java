package vacation10192;
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new InputStreamReader(System.in));
		String loc1;
		String loc2;
		int cas = 0;
		while (!((loc1 = in.nextLine()).equals("#"))) {
			loc2 = in.nextLine();
			System.out.println("Case #" + ++cas + ": you can visit at most " + lcss(loc1, loc2) + " cities.");
			//Case #1: you can visit at most 3 cities.
		}
		in.close();
	}
	
	public static int lcss(String a, String b) {
		int t[][] = new int[a.length()+1][b.length()+1];
		for (int i = 0; i<t.length; i++) {
			for (int k = 0; k<t[0].length; k++) {
				if (i == 0 || k == 0) {
					t[i][k] = 0;
				} else if (a.charAt(i-1) == b.charAt(k-1)) {
					t[i][k] = t[i-1][k-1]+1;
				} else {
					t[i][k] = (t[i-1][k] > t[i][k-1] ? t[i-1][k]: t[i][k-1]);
				}
			}
		}
		return t[t.length-1][t[0].length-1];
	}

}
