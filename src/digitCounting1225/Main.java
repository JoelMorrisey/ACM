package digitCounting1225;
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (new InputStreamReader(System.in));
		int inputNum = in.nextInt();
		for (int i = 0; i<inputNum; i++) {
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			int num = in.nextInt();
			for (int k = 1; k<=num; k++) {
				int temp = k;
				while (temp != 0) {
					int firstDig = temp%10;
					if (map.containsKey(firstDig)) {
						map.put((firstDig), (map.get(firstDig)+1));
					} else {
						map.put((firstDig), 1);
					}
					temp = temp/10;
				}
			}
			for (int k = 0; k<=9; k++) {
				if (map.containsKey(k)) {
					System.out.print(map.get(k));
				} else {
					System.out.print(0);
				}
				if (k != 9) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		in.close();
	}

}
