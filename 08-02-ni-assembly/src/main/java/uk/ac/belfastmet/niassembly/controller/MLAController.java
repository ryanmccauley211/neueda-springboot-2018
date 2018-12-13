package uk.ac.belfastmet.niassembly.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.niassembly.domain.AllMembersRoot;
import uk.ac.belfastmet.niassembly.domain.Member;

@Controller
public class MLAController {

	@GetMapping("members")
	public String getMLA(Model model) {
		
		String constituencyUrl = "http://data.niassembly.gov.uk/members_json.ashx?m=GetAllCurrentMembersByConstituencyId&constituencyId=1";
		
		RestTemplate restTemplate = new RestTemplate();
		AllMembersRoot allMembersRoot = restTemplate.getForObject(constituencyUrl, AllMembersRoot.class);
		
		model.addAttribute("members", allMembersRoot.getAllMembersList().getMembers());
		
		System.out.println(allMembersRoot.getAllMembersList().getMembers());
		
		return "members";
	}
	
}
