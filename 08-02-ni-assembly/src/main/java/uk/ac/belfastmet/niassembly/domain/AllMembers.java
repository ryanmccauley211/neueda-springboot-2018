package uk.ac.belfastmet.niassembly.domain;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AllMembers {

	@JsonProperty("Member")
	ArrayList<Member> members;
	
}
