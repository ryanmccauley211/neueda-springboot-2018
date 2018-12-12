package uk.ac.belfastmet.belevents.domain;

import java.util.ArrayList;
import java.util.Collections;

import lombok.Data;

@Data
public class AllEvents {
	
	private ArrayList<BelEvent> allEvents;
	
	public void sort() {
		Collections.sort(allEvents);
	}
}
