package groupRevese11192;
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new InputStreamReader(System.in));
		while (in.hasNext()) {
			int gSize = in.nextInt();
			if (gSize == 0) {
				in.close();
				return;
			}
			String word = in.next();
			int size = word.length()/gSize;
			System.out.println(reverseGroup(size, word));
		}
	}
	
	public static String reverseGroup(int groupSize, String s) {
		String result = "";
		for (int i =0; i<s.length(); i+=groupSize) {
			result += reverseWord(s.substring(i, i+groupSize));
		}
		return result;
	}
	
	public static String reverseWord(String s) {
		char c[] = s.toCharArray();
		s = "";
		for (int i = 0; i<c.length; i++) {
			s = c[i] + s;
		}
		return s;
	}

}
