package uk.ac.belfastmet.largestbuildings.service;

import java.util.ArrayList;

import uk.ac.belfastmet.largestbuildings.domain.BigFloorBuilding;
import uk.ac.belfastmet.largestbuildings.domain.BigFootBuilding;

public class AreaBuildingService {
	
	public ArrayList<BigFloorBuilding> getByFloor() {
		
		BigFloorBuilding ncgc = new BigFloorBuilding("New Century Global Center", "China", "Chengdu", "", "N/A", 
				"https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/%E7%8E%AF%E7%90%83%E4%B8%AD%E5%BF%83_-_panoramio_%286%29.jpg/240px-%E7%8E%AF%E7%90%83%E4%B8%AD%E5%BF%83_-_panoramio_%286%29.jpg", 1.760);
		
		BigFloorBuilding diat = new BigFloorBuilding("Dubai International Airport Terminal 3", "United Arab Emirates", "Dubai", "", "N/A", 
				"https://upload.wikimedia.org/wikipedia/commons/thumb/d/da/Arrivals_hall_in_DXB_Terminal_3_%283344510514%29.jpg/220px-Arrivals_hall_in_DXB_Terminal_3_%283344510514%29.jpg", 1.713);
		
		BigFloorBuilding abraj = new BigFloorBuilding("Abraj Al-Bait Endowment", "Saudi Arabia", "Mecca", "", "N/A", 
				"https://upload.wikimedia.org/wikipedia/en/thumb/f/f4/Abraj-al-Bait-Towers.JPG/275px-Abraj-al-Bait-Towers.JPG", 1.575);
		
		BigFloorBuilding centralWorld = new BigFloorBuilding("CentralWorld", "Thailand", "Bangkok", "", "N/A", 
				"https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/CW2015.jpg/300px-CW2015.jpg", 1.024);
		
		BigFloorBuilding afa = new BigFloorBuilding("Aalsmeer Flower Auction", "Netherlands", "Aalsmeer", "", "N/A", 
				"https://upload.wikimedia.org/wikipedia/commons/thumb/2/2f/Bloemenveiling_Aalsmeer1.jpg/220px-Bloemenveiling_Aalsmeer1.jpg", 0.99);
		
		ArrayList<BigFloorBuilding> bigFloorBuildings = new ArrayList<BigFloorBuilding>() {{
			add(ncgc);		add(diat);
			add(abraj);		add(centralWorld);
			add(afa);
		}};
		
		return bigFloorBuildings;
	}
}
