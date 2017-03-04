package org.arezoo.springbootstarter.concert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConcertService {

	@Autowired
	private ConcertRepository concertRepository;
	
	private List<Concert> concerts = Arrays.asList(
			new Concert("Id1", "Artist1", "Venue1", 2017,4,1),
			new Concert("Id2", "Artist2", "Venue2", 2017,4,2),
			new Concert("Id3", "Artist3", "Venue3", 2017,4,3),
			new Concert("Id4", "Artist4", "Venue4", 2017,4,4),
			new Concert("Id5", "Artist5", "Venue5", 2017,4,5),
			new Concert("Id6", "Artist6", "Venue6", 2017,4,6),
			new Concert("Id7", "Artist7", "Venue7", 2017,4,7),
			new Concert("Id8", "Artist8", "Venue8", 2017,4,8),
			new Concert("Id9", "Artist9", "Venue9", 2017,4,9),
			new Concert("Id10", "Artist10", "Venue10", 2017,4,10)
			);
	
	public List<Concert> getAllConcerts(){
		
		initializeConcertDb();
		List<Concert> concerts = new ArrayList<>();
		concertRepository.findAll().forEach(concerts::add);
	    return concerts;
	}
	
	private void initializeConcertDb() {
		
		for(int i=0; i<concerts.size();i++){
			addConcert(concerts.get(i));
		}
		
	}

	public void addConcert(Concert concert){
		concertRepository.save(concert);
	}
}
