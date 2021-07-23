package hajjEAkbar12577;
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new InputStreamReader(System.in));
		String temp = "";
		int num = 0;
		while (!(temp = in.nextLine()).equals("*")) {
			System.out.println("Case " + ++num + ": " + (temp.equals("Hajj") ? "Hajj-e-Akbar":"Hajj-e-Asghar"));
		}
		
		in.close();
	}

}
