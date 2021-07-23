package HardestProblemEver12478;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("KABIR");
		/*
		char[][] search = {	{'o','b','i','d','a','i','b','k','r'},
							{'r','k','a','u','l','h','i','s','p'},
							{'s','a','d','i','y','a','n','n','o'},
							{'h','e','i','s','a','w','h','i','a'},
							{'i','r','a','k','i','b','u','l','s'},
							{'m','f','b','i','n','t','r','n','o'},
							{'u','t','o','y','z','i','f','a','h'},
							{'l','e','b','s','y','n','u','n','e'},
							{'e','m','o','t','i','o','n','a','l'}};
		
		String[] words = {"RAKIBUL", "ANINDYA", "MOSHIUR", "SHIPLU", "KABIR", "SUNNY", "OBAIDA", "WASI"};
		
		for (int i = 0; i<words.length; i++) {
			words[i] = words[i].toLowerCase();
		}
		
		ArrayList<String> list = new ArrayList<String>();
		
		for (int i = 0; i<search.length; i++) {
			int k = i, j = 0;
			String Line = "";
			while (k<search.length && j<search[0].length) {
				Line += search[j][k];
				k++;j++;
			}
			for (String s: words) {
				for (String w: perm(s)) {
					if (Line.contains(w) || reverse(Line).contains(w)) {
						if (list.contains(s)) {
							System.out.println(s);
						}
						list.add(s);
					}
				}
			}
		}
		
		for (int i = 0; i<search[0].length; i++) {
			int k = 0, j = i;
			String Line = "";
			while (k<search.length && j<search[0].length) {
				Line += search[j][k];
				k++;j++;
			}
			for (String s: words) {
				for (String w: perm(s)) {
					if (Line.contains(w) || reverse(Line).contains(w)) {
						if (list.contains(s)) {
							System.out.println(s);
						}
						list.add(s);
					}
				}
			}
		}
		
		
		
		
		for (int i = 0; i<search.length; i++) {
			String horzLine = "";
			for (int k = 0; k<search[0].length; k++) {
				horzLine += search[i][k];
			}
			String vertLine = "";
			for (int k = 0; k<search.length; k++) {
				vertLine += search[k][i];
			}
			
			for (String s: words) {
				for (String w: perm(s)) {
					if (horzLine.contains(w) || reverse(horzLine).contains(w)) {
						if (list.contains(s)) {
							System.out.println(s);
						}
						list.add(s);
					}
					if (vertLine.contains(w) || reverse(vertLine).contains(w)) {
						if (list.contains(s)) {
							System.out.println(s);
						}
						list.add(s);
					}
				}
			}
		}
		
		System.out.println(list);
		*/
	}
	
	public static String reverse(String a) {
		String rev = "";
		for (char c: a.toCharArray()) {
			rev = c+rev;
		}
		return rev;
	}
	
	public static HashSet<String> perm(String a) {
		HashSet<String> p = new HashSet<String>();
		if (a.length() <= 0) {
			p.add("");
			return p;
		}
		
		char first = a.charAt(0);
		HashSet<String> sp = perm(a.substring(1));
		for (String s: sp) {
			for (int i = 0; i<=s.length(); i++) {
				p.add(insert(s, first, i));
			}
		}
		return p;
	}
	
	public static String insert(String a, char c, int idx) {
		String start = a.substring(0, idx);
		String end = a.substring(idx);
		return start+c+end;
	}
}
