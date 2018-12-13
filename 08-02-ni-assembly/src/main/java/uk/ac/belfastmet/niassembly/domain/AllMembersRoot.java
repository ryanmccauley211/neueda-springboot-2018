package uk.ac.belfastmet.niassembly.domain;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AllMembersRoot {
	
	@JsonProperty("AllMembersList")
	AllMembers allMembersList;
	
	public String toString() {
		return this.allMembersList.toString();
	}

}
