package boxOfBricks591;
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new InputStreamReader(System.in));
		int numOfBlocks = 0;
		int setNum = 0;
		while ((numOfBlocks = in.nextInt()) != 0) {
			setNum++;
			int sum = 0;
			int towers[] = new int[numOfBlocks];
			for (int i = 0; i<numOfBlocks; i++) {
				towers[i] = in.nextInt();
				sum += towers[i];
			}
			int avg = sum/numOfBlocks;
			int numMoved = 0;
			for (int i = 0; i<numOfBlocks; i++) {
				if (towers[i] > avg) {
					numMoved += (towers[i]-avg);
				}
			}
			System.out.println("Set #" + setNum);
			System.out.println("The minimum number of moves is " + numMoved + ".\n");
		}
		in.close();
	}
}
