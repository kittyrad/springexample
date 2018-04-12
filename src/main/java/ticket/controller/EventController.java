package ticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ticket.service.EventService;
import transfer.EventTo;

@RestController
@RequestMapping("/events")
public class EventController {

	@Autowired
	private EventService eventService;

	@RequestMapping(value = "/saveEvent",  method = RequestMethod.POST)
	public void saveEvent(@RequestBody EventTo eventTo){
		eventService.addNewEvent(eventTo);
	}

}
