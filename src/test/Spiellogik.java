package test;

public class Spiellogik {
	private static int startHoelzer;

	

	public int nenneStartHoelzer(){

		final int[] moeglicheAnzahl = { 5, 9, 13, 17, 21, 25, 29, 33, 37, 41 };

		startHoelzer=moeglicheAnzahl[(int)(Math.random()*10)];

		System.out.println(startHoelzer+" Streichhölzer liegen auf dem Tisch.");

		return startHoelzer;

	}

	

	public void spielzug(int gezogeneHoelzer){

			

		startHoelzer = startHoelzer-gezogeneHoelzer;

		System.out.println("Spieler zieht " + gezogeneHoelzer);

		System.out.println(startHoelzer+" Streichhölzer liegen auf dem Tisch.");

		

		/**Es werden soviele Streichhölzer abgezogen, 

		  *dass die Summe zusammen mit den vom Spieler gezogenen Streichhölzern 4 ergibt.

		  *So bleibt der Computer immer in der Gewinnsituation.

		  */

		startHoelzer = startHoelzer-(4-gezogeneHoelzer);

		System.out.println("PC zieht " + (4-gezogeneHoelzer));

		System.out.println(startHoelzer+" Streichhölzer liegen auf dem Tisch.");

		

		if (startHoelzer <=3){

			System.out.println("Leider verloren");

			System.exit(0);

		}



	}

}