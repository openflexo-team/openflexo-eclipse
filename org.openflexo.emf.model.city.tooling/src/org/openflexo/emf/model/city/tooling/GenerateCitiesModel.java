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
import com.thalesgroup.openflexo.emf.model.city1.Resident;
import com.thalesgroup.openflexo.emf.model.city2.City2Factory;
import com.thalesgroup.openflexo.emf.model.city2.Mayor;

public class GenerateCitiesModel {

	// XMI Factory
	private static XMIResourceFactoryImpl  factory = new XMIResourceFactoryImpl();

	// Random numbers
	private static Random r = new Random();
	
	// Output Models
	private static String city1File = "models/test1.city1";
	private static String city2File = "models/test1.city2";

	// Input Data
	private static String cityDataFile = "data/villes_france.csv";
	private static String prenomsDataFile = "data/prenoms.csv";
	private static Integer MAX_PRENOMS = 500;
	private static String nomsDataFile = "data/noms_famille.csv";
	private static Integer MAX_NOMS = 250;


	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			// read lists of nom and Prenom
			List<String> listPrenoms = readInputData(prenomsDataFile);
			List<String> listNoms = readInputData(nomsDataFile);
			
			// Create EMF Resource
			City1Factory city1Factory = City1Factory.eINSTANCE; 
			City2Factory city2Factory = City2Factory.eINSTANCE; 

			Resource r1 = makeResource(city1File);
			Resource r2 = makeResource(city2File);
			com.thalesgroup.openflexo.emf.model.city1.City cit1 = null;
			com.thalesgroup.openflexo.emf.model.city2.City cit2 = null;
			Mayor mayor = null;
			Resident resident = null;

			// ReadFile
			File citiesFile = new File (cityDataFile);		
			if(citiesFile.canRead()){

				FileInputStream fstream;
				fstream = new FileInputStream(citiesFile);
				BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

				String line;

				while ((line = br.readLine()) != null){
					String[] data = line.split(",");
					String mayorName = listNoms.get(r.nextInt(MAX_NOMS)) + " " + listPrenoms.get(r.nextInt(MAX_PRENOMS));
					
					cit1 = city1Factory.createCity();
					resident = city1Factory.createResident();
					resident.setName(mayorName);
					city1Factory.createCity();
					cit1.setName(data[0]);
					cit1.setZipcode(new Integer(data[1]));
					cit1.getResidents().add(resident);
					r1.getContents().add(cit1);
					
					cit2 = city2Factory.createCity();
					cit2.setName(data[0]);
					mayor = city2Factory.createMayor();
					mayor.setName(mayorName);
					cit2.setMayor(mayor);
					r2.getContents().add(cit2);
					

				}

			}

			// Save Resources
			r1.save(null);
			r2.save(null);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}


	public static Resource makeResource  (String filename){

		URI uri = (org.eclipse.emf.common.util.URI.createFileURI(filename));

		Resource emfResource = factory.createResource(uri);

		return emfResource;
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
