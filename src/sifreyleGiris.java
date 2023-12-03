import java.util.Scanner;

public class sifreyleGiris {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Şifrenizi belirleyiniz: ");
		String sifre = input.next();
		System.out.println("Şifrenizi giriniz:");
		String sifreDeneme = input.next();
		

			for (int j = 0; j < 4; j++) {
				if (sifre.equals(sifreDeneme)) {
					System.out.println("Giriş başarılı. Hoşgeldiniz");
					break;

				}
				else {
					System.out.println("Hatalı giriş tekrar deneyiniz");
					sifreDeneme = input.next();
				}
				

			}
			if(sifre.equals(sifreDeneme)==false) {
				System.out.println("Giriş başarısız");
				System.exit(1);
				
			}

			

		

	}
}
