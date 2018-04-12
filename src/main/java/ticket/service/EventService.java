package ticket.service;

import buyer.domain.Buyer;
import buyer.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ticket.domain.Event;
import ticket.repository.EventRepository;
import transfer.EventTo;

import java.util.List;

@Service
public class EventService {

	@Autowired
	private BuyerService buyerService;

	@Autowired
	private EventRepository eventRepository;

	public void addNewEvent(EventTo eventTo) {
		Event event = new Event();
		event.setCategory(eventTo.getCategory());
		event.setName(eventTo.getName());
		eventRepository.save(event);
		notifyBuyers(event);
	}

	public void notifyBuyers(Event event){

		//get all buyers from repo
		List<Buyer> buyers = buyerService.getAllBuyers();

		//notify buyers
		buyers.stream().forEach(buyer -> {
			buyerService.notifyBuyer(buyer, event);
		});
	}

}
