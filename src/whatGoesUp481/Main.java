package whatGoesUp481;

import java.util.*;
import java.io.*;


public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new InputStreamReader(System.in));
		ArrayList<Integer> l = new ArrayList<Integer>();
		while (in.hasNext()) {
			int i = 0;
			if ((i = in.nextInt()) == -1000000) {
				break;
			}
			l.add(i);
		}
		int i = -1;
		int[] a = new int[l.size()];
		for (int x: l) {
			i++;
			a[i] = x;
		}
		//int[] a = new int[]{-8, 10, 9, 2, 3, 8, 8, 6, 0};
		seq(a, a.length);
		in.close();
	}

	static int CeilIndex(Integer A[], int l, int r, int key) 
	{ 
		while (r - l > 1) 
		{ 
			int m = l + (r - l)/2; 
			if (A[m]>=key) {
				r = m; 
			} else {
				l = m; 
			}
		} 
		return r; 
	} 

	static void seq(int A[], int size) 
	{ 
		// Add boundary case, when array size is one 

		Integer[] tailTable   = new Integer[size]; 
		int len; // always points empty slot 

		tailTable[0] = A[0]; 
		len = 1; 
		for (int i = 1; i < size; i++) { 
			if (A[i] < tailTable[0]) {
				// new smallest value 
				tailTable[0] = A[i];
				

			} else if (A[i] > tailTable[len-1]) {
				// A[i] wants to extend largest subsequence 
				tailTable[len++] = A[i]; 
				
			} else {
				// A[i] wants to be current end candidate of an existing 
				// subsequence. It will replace ceil value in tailTable 
				tailTable[CeilIndex(tailTable, -1, len-1, A[i])] = A[i];
			} 
		}
		System.out.println(len + "\n-");
		for (int i = 0; i<tailTable.length; i++) {
			if (tailTable[i] != null) {
				System.out.println(tailTable[i]);
			}
		}
	}

}
