package vacation12372;
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new InputStreamReader(System.in));
		int i  = 1;
		int num = in.nextInt();
		for (int k = 0; k<num; k++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			if (a <= 20 && b <= 20 && c <= 20) {
				System.out.println("Case "+ i++ +": good");
			} else {
				System.out.println("Case "+ i++ +": bad");
			}
		}
	}

}
