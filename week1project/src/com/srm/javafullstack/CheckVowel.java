package com.srm.javafullstack;

import java.util.Scanner;

public class CheckVowel {
	public void vowel() {
		boolean status = false;
		// TODO Auto-generated method stub
		System.out.println("Enter String : ");
		Scanner sc = new Scanner(System.in);
		String val = sc.nextLine().toLowerCase();
		for (int j = 0; j < val.length(); j++) {
			if (val.charAt(j) == 'a' ||  val.charAt(j) == 'e'||
					 val.charAt(j) == 'i'|| val.charAt(j) == 'o'
					|| val.charAt(j) == 'u') {
				System.out.println(val.charAt(j));
				status = true;
			}

			if (checkVovels(val.charAt(j))) {

			}
		}
		if (status == false) {
			System.out.println("No Vowels Found");
		} else {
			System.out.println("Vowels Found");
		}

	}

	private Boolean checkVovels(char input) {
		Boolean result = false;
		if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') {
			result = true;
		}

		return result;
	}

	public static void main(String[] args) {
		CheckVowel cv = new CheckVowel();
		cv.vowel();
	}

}
