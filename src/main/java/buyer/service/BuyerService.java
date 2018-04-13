package buyer.service;

import buyer.domain.*;
import buyer.repository.BuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ticket.domain.Event;
import ticket.domain.Ticket;
import ticket.service.TicketService;
import transfer.BuyerTo;

import java.util.List;

@Service
public class BuyerService {

	@Autowired
	private TicketService ticketService;

	@Autowired
	private BuyerRepository buyerRepository;

	public void notifyBuyer(Buyer buyer, Event event) {
		if(isInterestedBuyer(buyer, event)) {
			Ticket ticket = new Ticket();
			ticket.setCategory(event.getCategory());
			ticket.setName(event.getName());
			ticket.setPrice(20d);
			Ticket savedTicket = ticketService.saveTicket(ticket);
			buyer.getTickets().add(savedTicket);
			buyerRepository.save(buyer);
		}
	}

	private boolean isInterestedBuyer(Buyer buyer, Event event) {
		return buyer.getCategories().contains(event.getCategory());
	}

	public List<Buyer> getAllBuyers() {
		return (List<Buyer>) buyerRepository.findAll();
	}

	public void saveBuyer(BuyerTo buyerTo) {
		AbstractBuyerFactory buyerFactory = AbstractBuyerFactory.getFactory(buyerTo.getType());
		Buyer buyer = buyerRepository.findByCnp(buyerTo.getCnp());
		if(buyer != null){
			Buyer existentBuyer = buyerFactory.update(buyer, buyerTo);
			buyerRepository.save(existentBuyer);
		} else {
			Buyer newBuyer =  buyerFactory.create(buyerTo);
			buyerRepository.save(newBuyer);
		}
	}
}
