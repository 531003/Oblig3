import java.util.Scanner;

public class SnuTekst {
	
	private static Scanner in = new Scanner(System.in);
	private static int cunt = 0;
	
	public static void main(String[] args) {
		String userInput = validerString("Skriv inn en tekststreng for å inventere");
		
		baklengs(userInput);
	}
	
	public static void baklengs(String tekst) {
		int length = tekst.length() - 1;
		if (length >= 0) {
			System.out.print(tekst.charAt(length));
			cunt++;
			baklengs(tekst.substring(0, length));
		} else {
			System.out.printf("\nDet er totalt %d bokstaver i tekststrengen.\n", cunt);
			cunt = 0;
		}
	}
	
	public static String validerString(String prompt) {

		String respons = "";

		while (respons == null || respons.equals("")) {
			System.out.println(prompt);

			try {

				respons = in.nextLine();

			} catch (Exception ex) {

				System.out.println("Skriv inn en gyldig respons.");
			}
		}
		return respons;
	}
}


