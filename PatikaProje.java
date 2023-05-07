import java.util.Scanner;

public class PatikaProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Taban değeri giriniz : ");
		int base = input.nextInt();
		System.out.print("Üs değerini giriniz : ");
		int exponent = input.nextInt();
		System.out.println("Sonuç : " + pow(base, exponent));
	}

	private static int pow(int base, int exponent) {
		if (exponent == 0) return 1;
		return base * pow(base, exponent - 1);
	}
	
}
