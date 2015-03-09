import java.util.Scanner;

public class TowerOfHanoi {

	private static Scanner input = new Scanner(System.in);
	private static long cunt = 1;
	private static long callCunt = 1;

	public static void main(String[] args) {
		System.out.print("Skriv inn antall skiver: ");
		int n = input.nextInt();

		System.out.println("Trekkene er:");
		moveDicks(n, 'A', 'B', 'C');

		System.out.printf("\nAntall tegn ble: %5d\n", cunt);
		System.out.printf("\nAntall call til metoden ble: %5d\n", callCunt);
	}

	public static void moveDicks(int n, char fromTower, char toTower,
			char auxTower) {
		callCunt++;

		if (n == 1) {
			System.out.printf(
					"Trekk nummer: %5d Flytt skiven %2d fra %c til %c\n", cunt,
					n, fromTower, toTower);
			cunt++;
		} else {
			moveDicks(n - 1, fromTower, auxTower, toTower);
			System.out.printf(
					"Trekk nummer: %5d Flytt skiven %2d fra %c til %c\n", cunt,
					n, fromTower, toTower);
			cunt++;
			moveDicks(n - 1, auxTower, toTower, fromTower);
		}
	}
}

