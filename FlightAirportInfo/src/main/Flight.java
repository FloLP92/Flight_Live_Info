package main;

import java.util.ArrayList;

public class Flight 
{
	private String idVol;
	private Airport airportDepart;
	private Airport airportDestination;
	private String codeCompagnie;
	private String modele;
	
	public Flight(String chId, Airport chAirportDep, Airport chAirportDest,
			String chCode, String chModele)
	{
		idVol = chId;
		airportDepart = chAirportDep;
		airportDestination = chAirportDest;
		airportDepart.ajoutVolDepart(this);
		airportDestination.ajoutVolDest(this);
		codeCompagnie = chCode;
		modele = chModele;
	}
	public String toString()
	{
		return "Flight "+idVol+" "+airportDepart+" -> "+airportDestination
				+" "+codeCompagnie+" "+modele;
	}
	
	public String getVilleDepart()
	{
		return airportDepart.getVille();
	}
	public String getVilleDestination()
	{
		return airportDestination.getVille();
	}
	public String getPaysDepart()
	{
		return airportDepart.getPays();
	}
	public String getPaysDestination()
	{
		return airportDestination.getPays();
	}
}
