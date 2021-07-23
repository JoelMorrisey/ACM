package clockHands579;
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new InputStreamReader(System.in));
		while (in.hasNext()) {
			String[] s = in.next().split(":");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			if (a == 0 && b==0) {
				break;
			}
			double ad = (a*30) + (b/2.0);
			double bd = b*6;
			System.out.printf("%.03f\n" , (double)(Math.min(360-Math.abs(ad-bd), Math.abs(bd-ad))));
		}
	}

}
