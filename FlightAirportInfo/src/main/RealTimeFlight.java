package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RealTimeFlight 
{
	private int currentTime;
	private String idVol;
	private float latitude;
	private float longitude;
	private int vitesse;
	private int direction;
	private int lastUpdate;
	private int vitesseVert;
	private String codeICAO;
	private boolean positionSol;
	private static BufferedReader bufRead;
	
	public RealTimeFlight(int chCurrent, String chId, float chLat,
			float chLong, int chVitesse, int chDir, int chLast,
			int chVitesseVert, String chCode, boolean chPos)
	{
		currentTime = chCurrent;
		idVol = chId;
		latitude = chLat;
		longitude = chLong;
		vitesse = chVitesse;
		direction = chDir;
		lastUpdate = chLast;
		vitesseVert = chVitesseVert;
		codeICAO = chCode;
		positionSol = chPos;
		

		
	}
	
	public static void affichagePositionsAvions() throws IOException{
		try {
			FileReader file = new FileReader("ressources/realtime_flights.dat");
			bufRead = new BufferedReader(file);
			String line = bufRead.readLine();
			int compteur =1;
			while(line != null){ //Tant qu'on a des lignes a lire dans le fichier
				String[] array = line.split(",");
				String[] parts = array[0].split("///");
				System.out.println("Avion "+compteur+" :\n");
				line = bufRead.readLine();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
