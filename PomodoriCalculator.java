//import Time.java;
//import Pomodoro.java;
import java.util.Scanner;

public class PomodoriCalculator {

	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		System.out.println("Inserisci Orario D'inizio");
		System.out.print("Ora:");
		int o=keyboard.nextInt();
		System.out.print("Minuti:");
		int m=keyboard.nextInt();
		System.out.print("Secondi:");
		int s=keyboard.nextInt();
		Time inizio=new Time(o,m,s);
		System.out.println("Inserisci Orario Finale");
		System.out.print("Ora:");
		int of=keyboard.nextInt();
		System.out.print("Minuti:");
		int mf=keyboard.nextInt();
		System.out.print("Secondi:");
		int sf=keyboard.nextInt();
		Time fine=new Time(of,mf,sf);
		System.out.println(" ");
		System.out.println("************************ Risultato ************************");
		System.out.print("Orario di inizio:".toUpperCase());
		inizio.stampa();
		System.out.print("Orario di fine:".toUpperCase());
		fine.stampa();
		System.out.println("Orari pause lunghe:".toUpperCase());
		Pomodoro Pom=new Pomodoro(inizio,fine);
		Pom.stampa();
	}

}
