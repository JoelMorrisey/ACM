package saveSetu12403;
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (new InputStreamReader(System.in));
		int amount = 0;
		for (int i = in.nextInt(); i>0; i--) {
			String command = in.next();
			if (command.equals("donate")) {
				amount += in.nextInt();
			} else {
				System.out.println(amount);
			}
		}
		in.close();
	}

}
