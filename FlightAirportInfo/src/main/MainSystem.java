package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class MainSystem 
{
	private static HashMap<String,Airport> listAirports;
	private static HashMap<String,Flight> listFlights;
	private static HashMap<String,Pays> listPays;
	
	public MainSystem()
	{
		listAirports = new HashMap<String,Airport>();
		listFlights = new HashMap<String,Flight>();
		listPays = new HashMap<String,Pays>();
		
		MainSystem.lireFichier("ressources/airports.dat");
		MainSystem.lireFichier("ressources/flights.dat");
		System.out.println(listAirports.size());
		System.out.println(listFlights.size());
		//RealTimeFlight r = new RealTimeFlight(50,"",50, 50, 50, 50, 50,50, "",true);
		//r.affichagePositionsAvions();
	}
	public static HashMap<String,Pays> getListPays()
	{
		return listPays;
	}
	public static HashMap<String,Airport> getListAirports()
	{
		return listAirports;
	}
	public static HashMap<String,Flight> getListFlight()
	{
		return listFlights;
	}
	public String getVilleDepart(String id)
	{
		if(listFlights.containsKey(id))
		{
			return listFlights.get(id).getVilleDepart();
		}
		else
			return null;
	}
	public String getVilleDest(String id)
	{
		if(listFlights.containsKey(id))
		{
			return listFlights.get(id).getVilleDest();
		}
		else
			return null;
	}
	public Pays getPaysDepart(String id)
	{
		if(listFlights.containsKey(id))
		{
			return listFlights.get(id).getPaysDepart();
		}
		else
			return null;
	}
	public Pays getPaysDest(String id)
	{
		if(listFlights.containsKey(id))
		{
			return listFlights.get(id).getPaysDest();
		}
		else
			return null;
	}
	public static void lireFichier(String nameFile)
	{
		try
		{
			FileReader file = new FileReader(nameFile);
			BufferedReader bufRead = new BufferedReader(file);
			String line = bufRead.readLine();
			if(nameFile.compareTo("ressources/airports.dat")==0)
			{
				while(line != null)
				{
					String[] array = line.split(",");
					String[] parts = array[0].split("///");
					if(!listPays.containsKey(parts[1]))
					{
						listPays.put(parts[1],new Pays(parts[1]));
					}
					Airport a = new Airport(parts[0],MainSystem.getListPays().get(parts[1]),
							parts[2],Float.parseFloat(parts[3]),Float.parseFloat(parts[4]));
					listPays.get(parts[1]).ajouterAirport(a);
					listAirports.put(parts[2],a);
					
					line = bufRead.readLine();
				}
				bufRead.close();
				file.close();
			}
			else if(nameFile.compareTo("ressources/flights.dat")==0)
			{
				while(line != null)
				{
					String[] array = line.split(",");
					String[] parts = array[0].split("///");
					Flight f = new Flight(parts[0],MainSystem.getListAirports().get(parts[1]),
							getListAirports().get(parts[2]),parts[3],parts[4]);
					listAirports.get(parts[1]).ajoutVolDepart(f);
					listAirports.get(parts[2]).ajoutVolDest(f);
					listFlights.put(parts[0],f);
					
					line = bufRead.readLine();
				}
				bufRead.close();
				file.close();
			}	
		}catch(IOException e){
			e.printStackTrace();
		}	
	}
	public static void main(String[] args) throws IOException
	{
		new MainSystem();
	}
	
	
}
