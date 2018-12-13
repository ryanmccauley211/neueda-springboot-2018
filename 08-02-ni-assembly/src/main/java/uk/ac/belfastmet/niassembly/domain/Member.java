package uk.ac.belfastmet.niassembly.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Member {
	
	private Integer personId;
	private Integer affiliationId;
	@JsonProperty("MemberName")
	private String name;
	@JsonProperty("MemberFirstName")
	private String firstName;
	@JsonProperty("MemberFullDisplayName")
	private String displayName;
	@JsonProperty("MemberSortName")
	private String sortName;
	@JsonProperty("MemberTitle")
	private String memberTitle;
	@JsonProperty("PartyName")
	private String partyName;
	@JsonProperty("PartyOrganisationId")
	private Integer partyOrganisationId;
	@JsonProperty("ConstituencyName")
	private String constituencyName;
	@JsonProperty("ConstituencyId")
	private Integer constituencyId;
	
}
