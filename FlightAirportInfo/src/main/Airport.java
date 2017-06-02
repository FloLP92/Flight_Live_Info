package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Airport 
{
	private String ville;
	private Pays pays;
	private String idIATA;
	private float latitude;
	private float longitude;
	private ArrayList<Flight> listDepart;
	private ArrayList<Flight> listDestination;
	
	public Airport(String chVille, Pays chPays, String chId,
			float chLatitude, float chLongitude)
	{
		ville = chVille;
		pays = chPays;
		idIATA = chId;
		latitude = chLatitude;
		longitude = chLongitude;
		listDepart = new ArrayList<Flight>();
		listDestination = new ArrayList<Flight>();
		
	}
	public void ajoutVolDepart(Flight f)
	{
		listDepart.add(f);
	}
	public void ajoutVolDest(Flight f)
	{
		listDestination.add(f);
	}
	public static void lireFichier()
	{
		try
		{
			FileReader file = new FileReader("ressources/airports.dat");
			BufferedReader bufRead = new BufferedReader(file);
			
			String line = bufRead.readLine();
			while(line != null)
			{
				String[] array = line.split(",");
				int id = Integer.parseInt(array[0]);
				float val = Float.parseFloat(array[0]);
				line = bufRead.readLine();
				System.out.println(line);
			}
			bufRead.close();
			file.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	public String getVille()
	{
		return ville;
	}
	public Pays getPays()
	{
		return pays;
	}
	public ArrayList<Flight> getListDepart()
	{
		return listDepart;
	}
	public ArrayList<Flight> getListDestination()
	{
		return listDestination;
	}
	
	public static void main(String[] args){
		lireFichier();
	}
}
