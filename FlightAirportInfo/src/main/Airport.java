package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Airport 
{
	private String ville;
	private String pays;
	private String idIATA;
	private float latitude;
	private float longitude;
	private ArrayList<Flight> listDepart;
	private ArrayList<Flight> listDestination;
	
	public Airport(String chVille, String chPays, String chId,
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
			ArrayList <Airport> arr =  new ArrayList();
			while(line != null)
			{
				String[] array = line.split(",");
				String[] parts = array[0].split("///");
				System.out.println(parts[4]);
				arr.add(new Airport(parts[0],parts[1],parts[2],Float.parseFloat(parts[3]),Float.parseFloat(parts[4])));
				
				line = bufRead.readLine();
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
	public String getPays()
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
