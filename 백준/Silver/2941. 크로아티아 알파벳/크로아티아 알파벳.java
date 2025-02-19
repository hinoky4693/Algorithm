import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String words = br.readLine();
		int count = 0;
		for(int i=0;i<words.length();i++) {
			switch(words.charAt(i)) {
			case 'c':
				if ((i+1 < words.length() && words.charAt(i+1) == '=') || (i+1 < words.length() && words.charAt(i+1) == '-')) {
					count++;
					i++;
				} else {
					count++;
				}
				break;
				
			case 'd':
				if (i+1 < words.length() && words.charAt(i+1) == '-') {
					count++;
					i++;
				}
				else if(i+2 <words.length() && words.charAt(i+1) == 'z' &&  words.charAt(i+2) == '=') {
					count++;
					i+=2;
				} else {
					count++;
				}
				break;
			
			case 'l':
				if (i+1 < words.length() && words.charAt(i+1) == 'j') {
					count++;
					i++;
				} else {
					count++;
				}
				break;
				
			case 'n':
				if (i+1 < words.length() && words.charAt(i+1) == 'j') {
					count++;
					i++;
				} else {
					count++;
				}
				break;
				
			case 's':
				if (i+1 < words.length() && words.charAt(i+1) == '=') {
					count++;
					i++;
				} else {
					count++;
				}
				break;
				
			case 'z':
				if (i+1 < words.length() && words.charAt(i+1) == '=') {
					count++;
					i++;
				} else {
					count++;
					}
				break;
				
			default:
				count++;
			} 
		}
		
		System.out.println(count);
		
	}
}
