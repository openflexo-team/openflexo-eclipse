package org.openflexo.emf.model.city.tooling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.thalesgroup.openflexo.emf.model.city1.City1Factory;
import com.thalesgroup.openflexo.emf.model.city1.House;
import com.thalesgroup.openflexo.emf.model.city1.HouseType;
import com.thalesgroup.openflexo.emf.model.city1.Resident;
import com.thalesgroup.openflexo.emf.model.city2.Appartment;
import com.thalesgroup.openflexo.emf.model.city2.Mansion;
import com.thalesgroup.openflexo.emf.model.city2.City2Factory;
import com.thalesgroup.openflexo.emf.model.city2.Mayor;

public class GenerateCitiesModel {

	// EMF Factories
	private static XMIResourceFactoryImpl  factory = new XMIResourceFactoryImpl();
	private static City1Factory city1Factory = City1Factory.eINSTANCE; 
	private static City2Factory city2Factory = City2Factory.eINSTANCE; 

	// Random numbers
	private static Random r = new Random();

	// Output Models
	private static String city1FilePrefix = "models/generated";
	private static String city2FilePrefix = "models/generated";

	// Input Data
	private static String cityDataFile = "data/villes_france.csv";
	private static String prenomsDataFile = "data/prenoms.csv";
	static List<String> listPrenoms = null;
	private static Integer MAX_PRENOMS = 500;
	private static String nomsDataFile = "data/noms_famille.csv";
	private static Integer MAX_NOMS = 250;
	static List<String> listNoms = null;

	// Number of random files to generate
	static int MAX_TRIES_NUMBER = 10;
	static int MAX_HOUSES = 50;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			// read lists of nom and Prenom
			listPrenoms = readInputData(prenomsDataFile);
			listNoms = readInputData(nomsDataFile);

			File citiesFile = new File (cityDataFile);

			generateIdenticFilesForCitiesMoreThanXinhab(citiesFile,0);
			generateIdenticFilesForCitiesMoreThanXinhab(citiesFile,10);
			generateIdenticFilesForCitiesMoreThanXinhab(citiesFile,110);
			generateIdenticFilesForCitiesMoreThanXinhab(citiesFile,120);
			generateIdenticFilesForCitiesMoreThanXinhab(citiesFile,150);
			generateIdenticFilesForCitiesMoreThanXinhab(citiesFile,1000);
			int i = MAX_TRIES_NUMBER;
			while (i>0){
				generateDifferentFilesForCitiesMoreThanXinhab(citiesFile,0,"Try"+i);
				generateDifferentFilesForCitiesMoreThanXinhab(citiesFile,10,"Try"+i);
				generateDifferentFilesForCitiesMoreThanXinhab(citiesFile,110,"Try"+i);
				generateDifferentFilesForCitiesMoreThanXinhab(citiesFile,120,"Try"+i);
				generateDifferentFilesForCitiesMoreThanXinhab(citiesFile,150,"Try"+i);
				generateDifferentFilesForCitiesMoreThanXinhab(citiesFile,1000,"Try"+i);
				i--;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	/** 
	 * 
	 * Generates CityFiles with some random differences, for cities that have more than (maxNbInhab * 1000) inhabitants
	 * 
	 * @param citiesFile
	 * @param maxNbInhab
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void generateDifferentFilesForCitiesMoreThanXinhab(File citiesFile, int maxNbInhab, String suffix) throws NumberFormatException, IOException{
		// Create EMF Resource

		Resource r1 = makeResource(city1FilePrefix + "_" + maxNbInhab +"kh" + suffix+".city1");
		Resource r2 = makeResource(city2FilePrefix  +"_" + maxNbInhab+"kh" + suffix+".city2");
		com.thalesgroup.openflexo.emf.model.city1.City cit1 = null;
		com.thalesgroup.openflexo.emf.model.city2.City cit2 = null;
		Mayor mayor = null;

		// ReadFile
		if(citiesFile.canRead()){

			FileInputStream fstream;
			fstream = new FileInputStream(citiesFile);
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

			String line;
			boolean genInCity1, genInCity2;

			while ((line = br.readLine()) != null){
				String[] data = line.split(",");
				Integer size = new Integer(data[2]);
				genInCity1 = r.nextBoolean();
				genInCity2 = r.nextBoolean();
				if (size > maxNbInhab*1000) {
					String mayorName = listNoms.get(r.nextInt(MAX_NOMS)) + " " + listPrenoms.get(r.nextInt(MAX_PRENOMS));

					if (genInCity1){
						cit1 = genInCity1(data[0],new Integer(data[1]),mayorName);
						r1.getContents().add(cit1);
					}
					if (genInCity2){
						cit2 = genInCity2(data[0],new Integer(data[1]),mayorName);
						r2.getContents().add(cit2);
					}

					int nbhouses = r.nextInt(MAX_HOUSES);
					while (nbhouses>0){
						generateHouse(cit1,cit2,true);
						nbhouses--;
					}
				}

			}

		}

		// Save Resources
		r1.save(null);
		r2.save(null);
	}

	/** 
	 * 
	 * Generates identic CityFiles with cities that have more than (maxNbInhab * 1000) inhabitants
	 * 
	 * @param citiesFile
	 * @param maxNbInhab
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void generateIdenticFilesForCitiesMoreThanXinhab(File citiesFile, int maxNbInhab) throws NumberFormatException, IOException{
		// Create EMF Resource

		Resource r1 = makeResource(city1FilePrefix + "_" + maxNbInhab +"kh.city1");
		Resource r2 = makeResource(city2FilePrefix  +"_" + maxNbInhab+"kh.city2");
		com.thalesgroup.openflexo.emf.model.city1.City cit1 = null;
		com.thalesgroup.openflexo.emf.model.city2.City cit2 = null;
		Mayor mayor = null;
		Resident resident = null;

		// ReadFile
		if(citiesFile.canRead()){

			FileInputStream fstream;
			fstream = new FileInputStream(citiesFile);
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

			String line;

			while ((line = br.readLine()) != null){
				String[] data = line.split(",");
				Integer size = new Integer(data[2]);
				if (size > maxNbInhab*1000) {
					String mayorName = generateRandomCitizenName();

					cit1 = genInCity1(data[0],new Integer(data[1]),mayorName);
					cit2= genInCity2(data[0],new Integer(data[1]),mayorName);

					int nbhouses = r.nextInt(MAX_HOUSES);
					while (nbhouses>0){
						generateHouse(cit1,cit2,false);
						nbhouses--;
					}

					r1.getContents().add(cit1);
					r2.getContents().add(cit2);
				}

			}

		}

		// Save Resources
		r1.save(null);
		r2.save(null);
	}

	/** Makes new EMF Resources
	 * 
	 * @param filename
	 * @return
	 */

	public static Resource makeResource  (String filename){

		URI uri = (org.eclipse.emf.common.util.URI.createFileURI(filename));

		Resource emfResource = factory.createResource(uri);

		return emfResource;
	}

	/** Generate a random citizen name
	 * 
	 */

	public static String generateRandomCitizenName(){
		return listNoms.get(r.nextInt(MAX_NOMS)) + " " + listPrenoms.get(r.nextInt(MAX_PRENOMS));
	}

	/** 
	 * Generate a new House (with some difference if diff = true) in each city 
	 */

	public static void generateHouse (com.thalesgroup.openflexo.emf.model.city1.City cit1 , com.thalesgroup.openflexo.emf.model.city2.City cit2, boolean diff){

		boolean genInCity1 = r.nextBoolean();
		boolean genInCity2 = r.nextBoolean();
		boolean appartment = r.nextBoolean();

		String ownerSurname = listNoms.get(r.nextInt(MAX_NOMS));
		String houseName = "House Of "+ ownerSurname;
		String ownerName = ownerSurname + " " + listPrenoms.get(r.nextInt(MAX_PRENOMS));
		int apptNumber = r.nextInt();

		if (!diff || genInCity1 && cit1 != null ){
			House house = city1Factory.createHouse();
			Resident resident = city1Factory.createResident();
			resident.setName(ownerName);

			if (appartment){
				house.setType(HouseType.APPARTMENT);
				house.setInfo("Apparment N°" + apptNumber);
			}
			else {
				house.setType(HouseType.MANSION);
				house.setInfo(houseName);
			}
			house.setOwner(resident);
			cit1.getResidents().add(resident);
			cit1.getHouses().add(house);
		}

		if (!diff || genInCity2 && cit2 != null){

			com.thalesgroup.openflexo.emf.model.city2.House house=null;

			if (appartment){
				house = city2Factory.createAppartment();
				((Appartment) house).setLabel(houseName);
			}
			else {
				house = city2Factory.createMansion();
				((Mansion) house).setNumber(apptNumber);
			}
			house.setOwner(ownerName);
			cit2.getHouses().add(house);
		}
	}


	/** Generate a City for city1 MM
	 * 
	 * @return
	 */

	public static com.thalesgroup.openflexo.emf.model.city1.City genInCity1(String cityName, Integer zipcode, String mayorName){

		com.thalesgroup.openflexo.emf.model.city1.City  cit1 = city1Factory.createCity();

		Resident resident = city1Factory.createResident();
		resident.setName(mayorName);

		city1Factory.createCity();
		cit1.setName(cityName);
		cit1.setZipcode(zipcode);
		cit1.getResidents().add(resident);
		
		// adding max 5 residents per city
		int i =r.nextInt(5);
		while (i>0){
			resident = city1Factory.createResident();
			resident.setName(generateRandomCitizenName());
			cit1.getResidents().add(resident);
		}

		return cit1;

	}

	/** Generate a City for city2 MM
	 * 
	 * @return
	 */

	public static com.thalesgroup.openflexo.emf.model.city2.City genInCity2(String cityName, Integer zipcode, String mayorName){

		com.thalesgroup.openflexo.emf.model.city2.City  cit2 = city2Factory.createCity();

		cit2 = city2Factory.createCity();
		cit2.setName(cityName);
		Mayor mayor = city2Factory.createMayor();
		mayor.setName(mayorName);
		cit2.setMayor(mayor);

		return cit2;

	}

	/**
	 * Reads data from a file into a list
	 * 
	 * @param filename
	 * @return
	 * @throws IOException
	 */
	public static List<String> readInputData(String filename) throws IOException{
		ArrayList<String> list = new ArrayList<String>();


		// ReadFile
		File file = new File (filename);		
		FileInputStream fstream = new FileInputStream(file);
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		String line;

		while ((line = br.readLine()) != null){
			list.add(line);
		}
		br.close();
		fstream.close();
		return list;
	}

}
