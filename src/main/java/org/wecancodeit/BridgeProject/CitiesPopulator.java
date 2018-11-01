package org.wecancodeit.BridgeProject;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class CitiesPopulator implements CommandLineRunner {

	@Resource
	CityRepository cityRepo;

	@Resource
	StateRepository stateRepo;

	@Override
	public void run(String... args) throws Exception {
		State ohio = new State("OH", "Ohio", "Birthplace of Aviation", null, "/api/states/oh/cities");
		ohio = stateRepo.save(ohio);
		City Cleveland = new City("Clevealnd", 100000, ohio);
		Cleveland = cityRepo.save(Cleveland);

		Fish cornfish = new Fish("Cornfish", "Icthius mays", "IMGURL");
		State indiana = new State("IN", "Indiana", "Land of Lincoln-Adjancent", cornfish, "/api/states/in/cities");
		indiana = stateRepo.save(indiana);
		City pawnee = new City("Pawnee", 6969, indiana);
		pawnee = cityRepo.save(pawnee);
	}

}