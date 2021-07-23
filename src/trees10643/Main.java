package trees10643;
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (new InputStreamReader(System.in));
		for (int i = in.nextInt(); i>0; i--) {
			int ctree = in.nextInt();
			/* insert code below*/
			
			int[] edges = new int[1002];
			edges[0] = 0;
			edges[2] = 3;
			edges[4] = 10;
			int counter = 1;
			for (int m = ctree-2; m > 0; m -= 2){
				if (ctree-2 == m)
					edges[ctree]++;
				for (int f = 2*counter; f < ctree-m; f += 2) {
					edges[ctree] += edges[f];
				}
				counter ++;
			}
			System.out.println(edges[ctree]);
			/*insert code above*/
			System.out.println("");
		}
		in.close();
	}

}
