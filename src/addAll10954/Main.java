package addAll10954;
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new InputStreamReader(System.in));
		int num;
		int arr[];
		while((num = in.nextInt()) != 0) {
			arr = new int[num];
			for (int i = 0; i<arr.length; i++) {
				arr[i] = in.nextInt();
			}
			Arrays.sort(arr);
			int cost = arr[0]+arr[1];
			int pr = cost;
			for (int i = 2; i<arr.length; i++) {
				cost += pr + arr[i];
				pr = pr + arr[i];
			}
			System.out.println(cost);
		}
		in.close();
	}

}
