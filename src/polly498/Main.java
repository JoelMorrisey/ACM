package polly498;
import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new InputStreamReader(System.in));
		while (in.hasNext()) {
			String[] list1 = in.nextLine().split(" ");
			ArrayList<BigInteger> l1 = new ArrayList<BigInteger>();
			String[] list2 = in.nextLine().split(" ");
			ArrayList<BigInteger> l2 = new ArrayList<BigInteger>();
			
			
			
			for (String c: list1) {
				if (c.equals("")) {continue;}
				l1.add(new BigInteger(c));
			}
			for (String c: list2) {
				if (c.equals("")) {continue;}
				l2.add(new BigInteger(c));
			}
			
			int n = l1.size()-1;
			for (int i = 0; i<l2.size(); i++) {
				BigInteger k = l2.get(i);
				BigInteger sum = new BigInteger("0");
				int cn = n;
				for (BigInteger x: l1) {
					sum  = sum.add(x.multiply(k.pow(cn)));
					cn--;
				}
				if (i == l2.size()-1) {
					System.out.print(sum);
					break;
				}
				System.out.print(sum + " ");
			}
			System.out.println();
		}
		in.close();
		
	}

}
