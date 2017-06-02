package main;

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
}
