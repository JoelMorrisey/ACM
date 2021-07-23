package hangmanJudge489;
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new InputStreamReader(System.in));
		int num = 0;
		top:
		while((num = in.nextInt()) != -1) {
			System.out.println("Round " + num);
			String thro = in.nextLine();
			String sol = in.nextLine();
			String guess = in.nextLine();
			LinkedHashSet<Character> gs = new LinkedHashSet<Character>();
			for (char c: guess.toCharArray()) {
				gs.add(c);
			}
			Iterator<Character> it = gs.iterator();
			int numOfGuesses = 0;
			while (it.hasNext()) {
				numOfGuesses++;
				char c = it.next();
				if (sol.indexOf(c) != -1) {
					it.remove();
					numOfGuesses--;
				}
				sol = sol.replaceAll(c+"", "");
				if (sol.isEmpty()) {
					System.out.println("You win.");
					continue top;
				}
			}
			
			if (gs.size() < 7) {
				System.out.println("You chickened out.");
			} else {
				System.out.println("You lose.");
			}
		}
		
		in.close();
	}

}
