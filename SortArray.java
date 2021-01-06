import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input how many numbers you want in array: ");

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
//		if (num =) {
//			System.err.println("Enter a number!");
//			System.exit(0);
//		}
		int[] Sort = new int[num];
		scan.close();

		RandomNumbers(Sort);
		Sort(Sort);
	}

	static Random rand = new Random();

	public static void RandomNumbers(int[] Sort) {
		for (int i = 0; i < Sort.length; i++) {
			if (i != Sort.length) {
				Sort[i] = rand.nextInt(89) + 10;
			} else if (i == Sort.length) {
				break;
			}
		}
	}

	public static void Sort(int[] Sort) {
		for (int i = 0; i < Sort.length; i++) {
			for (int j = i + 1; j < Sort.length; j++) {
				int tmp = 0;
				if (Sort[i] > Sort[j]) {
					tmp = Sort[i];
					Sort[i] = Sort[j];
					Sort[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(Sort));
	}
}
