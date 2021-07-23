package musicalLoop11496;
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new InputStreamReader(System.in));
		while (in.hasNext()) {
			int n = in.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i<n; i++) {
				list.add(in.nextInt());
			}
			int c = 0;
			boolean b = list.get(0) < list.get(1);
			for (int i = 1; i<n; i++) {
				if (b) {
					if (list.get(i) > list.get(i-1)) {
						c++;
						b = !b;
					}
				} else {
					if (list.get(i) < list.get(i-1)) {
						c++;
						b = !b;
					}
				}
			}
			if (list.get(list.size()-1) > list.get(0) && b) {
				c++;
			} else if (list.get(list.size()-1) < list.get(0) && !b) {
				c++;
			}
			System.out.println(c);
		}
	}

}
