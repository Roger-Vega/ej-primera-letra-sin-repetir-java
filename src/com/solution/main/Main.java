package com.solution.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una cadena de caracteres: ");
		String string = sc.nextLine();
		sc.close();		
		System.out.println(Solution.First_not_repeating_char(string));
	}

}
