package com.gitYo;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {

		String validPin = "0000";
		String pin;
		String Saving = "Saving";
		String Checking = "Checking";
		String account;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your");
		pin = scan.next();
		if (pin.equals(validPin)) {
			System.out.println("Checking or Savings");
		      account = scan.next();
			if (account.equals(Saving)) {
				System.out.println("2000");
			} else if (account.equals(Checking)) {
				System.out.println("1000");
			} else {
				System.out.println("invalid account");
			}
		} else {
			System.out.println("invalid");

		}

	}

}
