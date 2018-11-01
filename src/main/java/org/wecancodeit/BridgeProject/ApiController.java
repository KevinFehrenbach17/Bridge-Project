package org.wecancodeit.BridgeProject;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@Autowired
	StateRepository stateRepo;

	@GetMapping("/api/states")
	public Iterable<State> showStates() {
		return stateRepo.findAll();
	}

	@GetMapping("/api/states/{abbr}")
	public State showStates(@PathVariable(value = "abbr") String abbr) {
		return stateRepo.findByAbbreviationIgnoreCase(abbr);
	}
}
