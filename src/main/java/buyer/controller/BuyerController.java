package buyer.controller;

import buyer.domain.Buyer;
import buyer.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import transfer.BuyerTo;

import java.util.List;

@RestController
@RequestMapping("/buyers")
public class BuyerController {

	@Autowired
	private BuyerService buyerService;

	@RequestMapping(value = "/",  method = RequestMethod.GET)
	public List<Buyer> getAllBuyers() {
		return buyerService.getAllBuyers();
	}

	@RequestMapping(value = "/saveBuyer",  method = RequestMethod.POST)
	public void saveBuyer(@RequestBody BuyerTo buyerTo) {
		buyerService.saveBuyer(buyerTo);
	}

}