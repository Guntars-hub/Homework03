import java.util.ArrayList;
import java.util.Scanner;

public class PrimeGenerator {

	public static void main(String[] args) {
		System.out.println("How many prime numbers do you want to generate?");
		Scanner scan = new Scanner(System.in);
		int prime = scan.nextInt();
		scan.close();
		if (prime < 0 || prime > 100) {
			System.err.println("You can only generate from 0 - 100 numbers!");
			System.exit(0);
		}
		int maxCheck = 1000;
		boolean isPrime = true;
		var primeNum = new ArrayList<Integer>();

		for (int i = 1; i <= maxCheck; i++) {
			isPrime = CheckPrime(i);
			if (isPrime) {
				primeNum.add(i);
			}
		}
		System.out.println(primeNum.subList(0, prime));
	}

	
	
	
	public static boolean CheckPrime(int numberToCheck) {
		int remainder;
		for (int i = 2; i <= numberToCheck / 2; i++) {
			remainder = numberToCheck % i;
			if (remainder == 0) {
				return false;
			}
		}
		return true;
	}
}