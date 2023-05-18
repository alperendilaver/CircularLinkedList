package veriyapilarivize;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int m,n;

		System.out.println("N degeri giriniz(listenin eleman sayisi)");
		n = input.nextInt();

		System.out.println("M degeri giriniz(kacar kacar atlayacaginiz)");
		m = input.nextInt();
		Uygulama.balonPozisyonuBul(m, n);
				
	}

}
