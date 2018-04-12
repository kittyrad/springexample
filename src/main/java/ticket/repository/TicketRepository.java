package ticket.repository;

import org.springframework.data.repository.CrudRepository;
import ticket.domain.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Long> {

}
