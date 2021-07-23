package skewBinary575;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new InputStreamReader(System.in));
		while (in.hasNext()) {
			String s = in.next();
			if (s.equals("0")) {
				in.close();
				return;
			}
			long r = abc(s);
			System.out.println(r);
		}
	}

	private static long abc(String a) {
		char c[] = a.toCharArray();
		int arr[] =  new int[c.length];
		long out = 0l;
		for (int i = 0; i < c.length; i++) {
			arr[i] = c[i]-48;
		}
		for (int i = 0; i < arr.length; i++) {
			out += arr[i]*(Math.pow(2, arr.length-i)-1);
		}
        return out;
	}
}
