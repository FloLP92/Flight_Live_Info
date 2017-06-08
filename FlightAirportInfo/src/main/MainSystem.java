package main;

import java.util.ArrayList;
import java.util.HashMap;

public class MainSystem 
{
	private ArrayList<Airport> listAirports;
	private ArrayList<Flight> listFlight;
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
}
