import java.util.Scanner;

public class Latihan3dan4 {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int nomor;
			String formatNomor;
			
			System.out.print("masukkan nomor: ");
			nomor = input.nextInt();
			
			formatNomor = String.format("%05d", nomor);
			System.out.printf("NO REGISTER:IBIK");
			
			if(formatNomor.isEmpty()) {
				System.out.println("Masukkan angka minimal 1 digit");
			}else {
				System.out.println(formatNomor);
			}
			input.close();
	}
}
