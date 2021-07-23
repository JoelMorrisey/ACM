package counterfeitDollar608;
import java.util.*;
import java.io.*;

public class Main {
	
	static int counter = 1;
	public static void main(String[] args) {
		Scanner in = new Scanner(new InputStreamReader(System.in));
		while (in.hasNext()) {
		int numfri = in.nextInt();
		numfri++;
		
		double m = in.nextInt();
		m*=numfri;
		
		double tea = in.nextInt()*numfri;
		
		int numOfItems = in.nextInt();
		
		m = m*0.9;
		m -= tea;
		
		//System.out.println(m + " : " + numfri);
		numOfItems*=2;
		int[] values = new int[numOfItems];
		int[] weights = new int[numOfItems];
		for (int i = 0; i<numOfItems; i+=2) {
			int we = in.nextInt();
			weights[i] = we;
			weights[i+1] = we;
			for (int k = 0; k<numfri; k++) {
				int va = in.nextInt();
				values[i]+=va;
				values[i+1]+=va;
			}
		}
		double W = m;
		System.out.printf("%.02f\n",(double)(knapsack(values, weights, W,numfri)/numfri));//should be 70
		if (counter == 10) {
			System.out.println(numOfItems/2);
		}
		counter++;
		}
	}

	public static double knapsack(int[] vals, int[] weights, double w, int numfri) {
		double[][][] table = new double [vals.length+1][(int) (w+1)][2];
		for (int i = 0; i<table.length; i++) {
			for (int k = 0; k<table[0].length; k++) {
				if (i == 0 || k == 0) {
					table[i][k][0] = 0; continue;
				}
				if (table[i][k][1] >= numfri*2) {					
					continue;
				}
				if (weights[i-1] <= k) {
					table[i][k][0] = Math.max(vals[i-1] + table[i-1][k-weights[i-1]][0], table[i-1][k][0]);
					if (vals[i-1] + table[i-1][k-weights[i-1]][0] == table[i-1][k][0] &&  table[i-1][k-weights[i-1]][1] > table[i-1][k][1]) {
						table[i][k][1] = table[i-1][k][1];
					} else if (vals[i-1] + table[i-1][k-weights[i-1]][0] == table[i-1][k][0] && table[i-1][k-weights[i-1]][1] < table[i-1][k][1]) {
						table[i][k][1] = table[i-1][k-weights[i-1]][1];
					} else if (vals[i-1] + table[i-1][k-weights[i-1]][0] > table[i-1][k][0]) {
						table[i][k][1] = table[i-1][k-weights[i-1]][1];
					} else {
						table[i][k][1] = table[i-1][k][1];
					}
				} else {
					table[i][k][0] = table[i-1][k][0];
					table[i][k][1] = table[i-1][k][1];
				}
			}
		}
		return table[table.length-1][table[0].length-1][0];
	}

}
