package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Airport 
{
	private String ville;
	private String pays;
	private String idIATA;
	private float latitude;
	private float longitude;
	
	public Airport(String chVille, String chPays, String chId,
			float chLatitude, float chLongitude)
	{
		ville = chVille;
		pays = chPays;
		idIATA = chId;
		latitude = chLatitude;
		longitude = chLongitude;
	}
	public void lireFichier()
	{
		try
		{
			FileReader file = new FileReader("name_fichier.txt");
			BufferedReader bufRead = new BufferedReader(file);
			
			String line = bufRead.readLine();
			while(line != null)
			{
				String[] array = line.split(",");
				int id = Integer.parseInt(array[0]);
				float val = Float.parseFloat(array[0]);
				line = bufRead.readLine();
			}
			bufRead.close();
			file.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}
