package uk.ac.belfastmet.largestbuildings.service;

import java.util.ArrayList;

import uk.ac.belfastmet.largestbuildings.domain.BigFootBuilding;

public class FootBuildingService {

	public ArrayList<BigFootBuilding> getByFoot() {
		
		BigFootBuilding afa = new BigFootBuilding("Aalsmeer Flower Auction Building", "Netherlands", "Aalsmeer", "The auction building of the flower auction in Aalsmeer.", "", 
				"https://upload.wikimedia.org/wikipedia/commons/thumb/2/2f/Bloemenveiling_Aalsmeer1.jpg/220px-Bloemenveiling_Aalsmeer1.jpg", 518000, 740, 700);
		
		BigFootBuilding dubaiMall = new BigFootBuilding("The Dubai Mall", "United Arab Emirates", "Dubai", "", "", 
				"https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Dubai_mall_indoor.JPG/270px-Dubai_mall_indoor.JPG", 500000, 0, 0);
		
		BigFootBuilding tesla = new BigFootBuilding("Tesla Factory", "United States", "Fremont, California", "Automobile production facility of Tesla Motors", "", 
				"https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Tesla_auto_bots.jpg/220px-Tesla_auto_bots.jpg", 427354, 0, 0);
		
		BigFootBuilding boeing = new BigFootBuilding("Boeing Everett Factory", "United States", "Everett, Washington", "Boeing's assembly site for a selection of the company's largest aircraft, originally built for construction of the 747.", "", 
				"https://upload.wikimedia.org/wikipedia/commons/thumb/b/b1/Boeing_Everett_Plant.jpg/220px-Boeing_Everett_Plant.jpg", 398000, 900, 495);
		
		BigFootBuilding techPark = new BigFootBuilding("Daikin Texas Technology Park", "United States", "Waller, Texas", "Factory and distribution center for heating and air conditioning products", "", 
				"https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Relief_map_of_Texas.png/250px-Relief_map_of_Texas.png", 393000, 0, 0);
		
		ArrayList<BigFootBuilding> bigFootBuildings = new ArrayList<BigFootBuilding>() {{
			add(afa);		add(dubaiMall);
			add(tesla);		add(boeing);
			add(techPark);
		}};
		return bigFootBuildings;
	}
}
