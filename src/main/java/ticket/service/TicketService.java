package ticket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ticket.domain.Ticket;
import ticket.repository.TicketRepository;

@Service
public class TicketService {

	@Autowired
	private TicketRepository ticketRepository;

	public Ticket saveTicket(Ticket ticket) {
		return ticketRepository.save(ticket);
	}

}
