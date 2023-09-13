package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	
public static void main(String[] args) {
	
    // Crea un oggetto Scanner per acquisire l'input dell'utente
    Scanner scanner = new Scanner(System.in);

    // Richiedi all'utente il numero di chilometri da percorrere
    System.out.println("Inserisci il numero di chilometri da percorrere:");
    int chilometri = scanner.nextInt();

    // Richiedi all'utente l'età del passeggero
    System.out.println("Inserisci l'età del passeggero:");
    int eta = scanner.nextInt();
    
    scanner.close();

    // Calcola il prezzo del biglietto
    double prezzoBase = chilometri * 0.21;

    // Applica lo sconto in base all'età del passeggero
    double prezzoScontato = prezzoBase;
    if (eta < 18) {
        prezzoScontato *= 0.8;
    } else if (eta > 65) {
        prezzoScontato *= 0.6;
    }

    // Stampa il prezzo totale del viaggio
    System.out.println("Il prezzo totale del viaggio è di €" + prezzoScontato);
	
}
}
