package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String text = sc.nextLine();
		
		String formattedText = text.toLowerCase();
		
		char array[] = formattedText.toCharArray();
		boolean visited[] = new boolean[formattedText.length()];
		
		int repLetters = 0;
		
		for(int i = 0; i < array.length; i++) {
			int count = 0;
			for(int j = i + 1; j < array.length; j++) {
				if(visited[j] == false) {
					if(array[i] == array[j]) {
						count++;
						visited[j] = true;
					}
				}
			}
			if(count >= 1) {
				repLetters++;
			}
		}
		System.out.println(repLetters);
	}

}
