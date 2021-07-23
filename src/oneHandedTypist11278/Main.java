package oneHandedTypist11278;
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new InputStreamReader(System.in));
		while (in.hasNext()) {
			String os = in.nextLine();
			String out = "";
			for (char x: os.toCharArray()) {
				if (x == '4') {
					out += 'q';
				} else if (x == '5') {
					out += 'j';
				} else if (x == '6') {
					out += 'l';
				} else if (x == '7') {
					out += 'm';
				} else if (x == '8') {
					out += 'f';
				} else if (x == '9') {
					out += 'p';
				} else if (x == '0') {
					out += '/';
				} else if (x == '-') {
					out += '[';
				} else if (x == '=') {
					out += ']';
				} 
				
				
				else if (x == 'q') {
					out += '4';
				} else if (x == 'w') {
					out += '5';
				} else if (x == 'e') {
					out += '6';
				} else if (x == 'r') {
					out += '.';
				} else if (x == 't') {
					out += 'o';
				} else if (x == 'y') {
					out += 'r';
				} else if (x == 'u') {
					out += 's';
				} else if (x == 'i') {
					out += 'u';
				} else if (x == 'o') {
					out += 'y';
				} else if (x == 'p') {
					out += 'b';
				} else if (x == '[') {
					out += ';';
				} else if (x == ']') {
					out += '=';
				} else if (x == '\\') {
					out += '\\';
				} 
				
				
				else if (x == 'a') {
					out += '7';
				} else if (x == 's') {
					out += '8';
				} else if (x == 'd') {
					out += '9';
				} else if (x == 'f') {
					out += 'a';
				} else if (x == 'g') {
					out += 'e';
				} else if (x == 'h') {
					out += 'h';
				} else if (x == 'j') {
					out += 't';
				} else if (x == 'k') {
					out += 'd';
				} else if (x == 'l') {
					out += 'c';
				} else if (x == ';') {
					out += 'k';
				} else if (x == '\'') {
					out += '-';
				} 
				
				
				else if (x == 'z') {
					out += '0';
				} else if (x == 'x') {
					out += 'z';
				} else if (x == 'c') {
					out += 'x';
				} else if (x == 'v') {
					out += ',';
				} else if (x == 'b') {
					out += 'i';
				} else if (x == 'n') {
					out += 'n';
				} else if (x == 'm') {
					out += 'w';
				} else if (x == ',') {
					out += 'v';
				} else if (x == '.') {
					out += 'g';
				} else if (x == '/') {
					out += '\'';
				} 
				
				else if (x == '$') {
					out += 'Q';
				} else if (x == '%') {
					out += 'J';
				} else if (x == '^') {
					out += 'L';
				} else if (x == '&') {
					out += 'M';
				} else if (x == '*') {
					out += 'F';
				} else if (x == '(') {
					out += 'P';
				} else if (x == ')') {
					out += '?';
				} else if (x == '_') {
					out += '{';
				} else if (x == '+') {
					out += '}';
				} 
				
				
				else if (x == 'Q') {
					out += '$';
				} else if (x == 'W') {
					out += '%';
				} else if (x == 'E') {
					out += '^';
				} else if (x == 'R') {
					out += '>';
				} else if (x == 'T') {
					out += 'O';
				} else if (x == 'Y') {
					out += 'R';
				} else if (x == 'U') {
					out += 'S';
				} else if (x == 'I') {
					out += 'U';
				} else if (x == 'O') {
					out += 'Y';
				} else if (x == 'P') {
					out += 'B';
				} else if (x == '{') {
					out += ':';
				} else if (x == '}') {
					out += '+';
				} else if (x == '|') {
					out += '|';
				}
				
				
				else if (x == 'A') {
					out += '&';
				} else if (x == 'S') {
					out += '*';
				} else if (x == 'D') {
					out += '(';
				} else if (x == 'F') {
					out += 'A';
				} else if (x == 'G') {
					out += 'E';
				} else if (x == 'H') {
					out += 'H';
				} else if (x == 'J') {
					out += 'T';
				} else if (x == 'K') {
					out += 'D';
				} else if (x == 'L') {
					out += 'C';
				} else if (x == ':') {
					out += 'K';
				} else if (x == '"') {
					out += '_';
				}
				
				
				else if (x == 'Z') {
					out += ')';
				} else if (x == 'X') {
					out += 'Z';
				} else if (x == 'C') {
					out += 'X';
				} else if (x == 'V') {
					out += '<';
				} else if (x == 'B') {
					out += 'I';
				} else if (x == 'N') {
					out += 'N';
				} else if (x == 'M') {
					out += 'W';
				} else if (x == '<') {
					out += 'V';
				} else if (x == '>') {
					out += 'G';
				} else if (x == '?') {
					out += '"';
				}

				
				else {
					out += x;
				}
			}
			System.out.println(out);
		}
	}

}
