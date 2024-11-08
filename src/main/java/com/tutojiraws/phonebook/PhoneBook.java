package com.tutojiraws.phonebook;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PhoneBook {

	public static Scanner sc = null;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		String lastName = getUserInput("nom : ");
		String firstName = getUserInput("prénom : ");
		String city = getUserInput("city : ");
		String phone = getUserInput("phone : ");
		
		Contact newContact = new Contact(firstName, lastName, city, phone);
		System.out.println(newContact.toString());
		
		File phoneBookContacts = new File("C:\\DEV\\Java\\phoneBookContacts_3.txt");
		
		if(phoneBookContacts.exists()) {
			try {
				BufferedWriter fileWriter = new BufferedWriter(new FileWriter(phoneBookContacts, true));
				fileWriter.append(newContact.toString());
				fileWriter.close();
				System.out.println("Le contact a été ajouté.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try {
				phoneBookContacts.createNewFile();
				BufferedWriter fileWriter = new BufferedWriter(new FileWriter(phoneBookContacts, true));
				fileWriter.append(newContact.toString());
				fileWriter.close();
				System.out.println("Le fichier vient d'être créé.");
				System.out.println("Le contact a été ajouté.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		sc.close();
	}

	public static String getUserInput(String message) {
		System.out.println(message);
		String userInput = sc.nextLine();
		return userInput;
	}

}
