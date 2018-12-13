package uk.ac.belfastmet.hackernews.domain;

import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Article {
	
	@JsonProperty("by")
	private String author;
	private Integer descendents;
	private Integer id;
	private ArrayList<Integer> kids;
	private Integer score;
	@JsonProperty("time")
	private Date date;
	private String title;
	@JsonProperty("type")
	private String category;
	private String url;

}
