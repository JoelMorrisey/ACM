package auVoting10142;
import java.util.*;
import java.io.*;

public class Main {
	
	static Scanner in = new Scanner(new InputStreamReader(System.in));
	
	public static void main(String[] args) {
		while (in.hasNext()) {
			int numOfTestCases = 1;
			for (; numOfTestCases != 0; numOfTestCases--) {
				String winner = abc();
				System.out.println(winner);
			}
		}
	}

	public static String abc() {
		int numOfCan = in.nextInt();
		ArrayList<String> can = new ArrayList<String>();
		for (int i = numOfCan; i>0; i--) {
			can.add(in.next());
		}
		System.out.println(can); //TODO debug line
		ArrayList<ArrayList<Integer>> votes = new ArrayList<ArrayList<Integer>>();
		int num = -1;
		while (num != 4) { //TODO add real condition
			votes.add(new ArrayList<Integer>());
			num++;
			for (int i = 0 ; i<numOfCan; i++) {
				votes.get(num).add(in.nextInt());
			}
		}
		String r = decide(can, votes);
		return r;
	}

	private static String decide(ArrayList<String> can, ArrayList<ArrayList<Integer>> votes) {
		
		return null;
	}
}
