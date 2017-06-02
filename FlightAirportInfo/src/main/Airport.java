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
	
	public Airport(String chVille, String chPays, String chId,
			float chLatitude, float chLongitude)
	{
		ville = chVille;
		pays = chPays;
		idIATA = chId;
		latitude = chLatitude;
		longitude = chLongitude;
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
				char[] res;
				array[0].getChars(0,6,res,0);
				System.out.println(res);
				ArrayList <String> villeA = new ArrayList();
				ArrayList <String> paysA = new ArrayList();
				ArrayList <String> codeA = new ArrayList();
				ArrayList <String> latitudeA = new ArrayList();
				ArrayList <String> longitudeA = new ArrayList();
				int i=0;
				while(!(array[i].equals("/"))){
					villeA.add(array[i]);
					i++;
				}
				while(array[i].equals("/")){
					i++;
				}
				while(!array[i].equals("/")){
					paysA.add(array[i]);
					i++;
				}
				while(array[i].equals("/")){
					i++;
				}
				while(!array[i].equals("/")){
					codeA.add(array[i]);
					i++;
				}
				while(array[i].equals("/")){
					i++;
				}
				while(!array[i].equals("/")){
					latitudeA.add(array[i]);
					i++;
				}
				while(array[i].equals("/")){
					i++;
				}
				while(!array[i].equals("/")){
					longitudeA.add(array[i]);
					i++;
				}
				Iterator <String> it = villeA.iterator();
				while(it.hasNext()){
					System.out.println(it.next());
				}
				
				//int id = Integer.parseInt(array[0]);
				//float val = Float.parseFloat(array[0]);
				line = bufRead.readLine();
			}
			bufRead.close();
			file.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args){
		lireFichier();
	}
}
