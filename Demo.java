import java.util.Scanner;
public class Demo {	
	public static void main(String[] args) {
		Galgje galgje = new Galgje();
		galgje.starten();
		System.out.println("Bedankt voor het spelen");
	}
}
class Galgje{
	void starten() {
		System.out.println("Welkom bij Galgje");
		System.out.println("Voer een woord in: ");
		Scanner scanner = new Scanner(System.in);
		String geheimWoord = scanner.nextLine();
		int lengteWoord = geheimWoord.length();
		for(int i = 0 ; i < lengteWoord ; i++) {
			System.out.print("_ ");
		}			
		System.out.println("");
	}
}



