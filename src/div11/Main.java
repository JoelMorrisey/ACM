package div11;

import java.math.BigInteger;
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new InputStreamReader(System.in));
		while (in.hasNext()) {
			String Sin = in.nextLine().replaceAll(" ", "");
			BigInteger a = new BigInteger(Sin);
			if (a.equals(new BigInteger("0"))) {
				break;
			} else if (a.mod(new BigInteger("11")).equals(new BigInteger("0"))) {
				System.out.println(Sin + " is a multiple of 11.");
			} else {
				System.out.println(Sin + " is not a multiple of 11.");
			}
		}
		in.close();
	}
}
