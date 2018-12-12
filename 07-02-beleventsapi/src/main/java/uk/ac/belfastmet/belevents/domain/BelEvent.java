package uk.ac.belfastmet.belevents.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class BelEvent<T> implements Comparable<T> {
	
	private Integer identifier;
	private String url;
	private String title;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date startDate;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date endDate;
	private String time;
	private String venue;
	private String venueUrl;
	private String image;
	private String audience;
	private String theme;
	private String cost;
	private String content;
	
	@Override
	public int compareTo(T obj) {
		
		try {
			BelEvent belEvent = (BelEvent) obj;
			if (this.getStartDate().before(belEvent.getStartDate())) {
				return -1;
			}
			else if (this.getStartDate().after(belEvent.getStartDate())) {
				return 1;
			}
		}
		
		catch (ClassCastException e) {
			return 0;
		}
		return 0;
	}
}