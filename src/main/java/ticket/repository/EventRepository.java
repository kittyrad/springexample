package ticket.repository;

import org.springframework.data.repository.CrudRepository;
import ticket.domain.Event;

public interface EventRepository extends CrudRepository<Event,Long> {

}
