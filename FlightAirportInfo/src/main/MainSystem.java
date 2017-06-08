package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class MainSystem 
{
	private static ArrayList<Airport> listAirports;
	private static ArrayList<Flight> listFlight;
	private static HashMap<String,Pays> listPays;
	
	public MainSystem()
	{
		listAirports = new ArrayList<Airport>();
		listFlight = new ArrayList<Flight>();
		listPays = new HashMap<String,Pays>();
	}
	public static HashMap<String,Pays> getListPays()
	{
		return listPays;
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
				if(listPays.containsKey(parts[1]))
				{
					
				}
				arr.add(new Airport(parts[0],MainSystem.getListPays().get(parts[1]),
						parts[2],Float.parseFloat(parts[3]),Float.parseFloat(parts[4])));
				
				line = bufRead.readLine();
			}
			bufRead.close();
			file.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) throws IOException{
		//MainSystem.lireFichier();
		RealTimeFlight r = new RealTimeFlight(50,"",50, 50, 50, 50, 50,50, "",true);
		r.affichagePositionsAvions();
	}
	
	
}
