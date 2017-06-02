package main;

public class Flight 
{
	private String idVol;
	private String airportDepart;
	private String airportDestination;
	private String codeCompagnie;
	private String modele;
	
	public Flight(String chId, String chAirportDep, String chAirportDest,
			String chCode, String chModele)
	{
		idVol = chId;
		airportDepart = chAirportDep;
		airportDestination = chAirportDest;
		codeCompagnie = chCode;
		modele = chModele;
	}
	 
}
