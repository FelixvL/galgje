import java.util.Scanner;
public class Demo {	
	public static void main(String[] args) {
		Galgje galgje = new Galgje();
		galgje.starten();
		System.out.println("Bedankt voor het spelen");
	}
}
class Galgje{
	String geheimWoord;
	Scanner scanner = new Scanner(System.in);
	void woordInvoeren() {
		System.out.println("Welkom bij Galgje");
		System.out.println("Voer een woord in: ");
		geheimWoord = scanner.nextLine();
	}
	void radenLetterInWoord() {
		int lengteWoord = geheimWoord.length();
		for(int i = 0 ; i < lengteWoord ; i++) {
			System.out.print("_ ");
		}			
		System.out.println("");
		System.out.println("Voer een letter in:");
		String geradenLetter = scanner.nextLine();
		for(int j = 0 ; j < lengteWoord; j++) {
			if( geheimWoord.charAt(j) == geradenLetter.charAt(0)  ) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
	}
	void starten() {
		woordInvoeren();
		radenLetterInWoord();		
	}
}



