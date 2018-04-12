package buyer.service;

import buyer.domain.Buyer;
import buyer.domain.FilmBuyer;
import buyer.domain.MusicBuyer;
import buyer.domain.SportsBuyer;
import buyer.repository.BuyerRepository;
import org.apache.commons.lang3.StringUtils;
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
		Buyer buyer = buyerRepository.findByCnp(buyerTo.getCnp());
		if(buyer != null){
			if(buyer instanceof FilmBuyer) {
				FilmBuyer filmBuyer = (FilmBuyer) buyer;
				filmBuyer.setCnp(buyerTo.getCnp());
				filmBuyer.setName(buyerTo.getName());
				filmBuyer.setAge(buyerTo.getAge());
				filmBuyer.setCategories(buyerTo.getCategories());
				filmBuyer.setFavoriteFilm(buyerTo.getFavoriteFilm());
				buyerRepository.save(filmBuyer);

			} else if(buyer instanceof MusicBuyer) {
				MusicBuyer musicBuyer = (MusicBuyer) buyer;
				musicBuyer.setCnp(buyerTo.getCnp());
				musicBuyer.setName(buyerTo.getName());
				musicBuyer.setAge(buyerTo.getAge());
				musicBuyer.setCategories(buyerTo.getCategories());
				musicBuyer.setFavoriteMusicAlbum(buyerTo.getFavoriteMusicAlbum());
				musicBuyer.setFavoriteMusicCategory(buyerTo.getFavoriteMusicCategory());
				buyerRepository.save(musicBuyer);
			} else if (buyer instanceof SportsBuyer) {
				SportsBuyer sportsBuyer = (SportsBuyer) buyer;
				sportsBuyer.setCnp(buyerTo.getCnp());
				sportsBuyer.setName(buyerTo.getName());
				sportsBuyer.setAge(buyerTo.getAge());
				sportsBuyer.setCategories(buyerTo.getCategories());
				sportsBuyer.setFavoriteSport(buyerTo.getFavoriteSport());
				sportsBuyer.setFavoriteSportPlayer(buyerTo.getFavoriteSportPlayer());
				buyerRepository.save(sportsBuyer);
			}
		} else {
			if (StringUtils.isNotEmpty(buyerTo.getFavoriteFilm())) {
				FilmBuyer filmBuyer = new FilmBuyer();
				filmBuyer.setCnp(buyerTo.getCnp());
				filmBuyer.setAge(buyerTo.getAge());
				filmBuyer.setCategories(buyerTo.getCategories());
				filmBuyer.setName(buyerTo.getName());
				filmBuyer.setFavoriteFilm(buyerTo.getFavoriteFilm());
				buyerRepository.save(filmBuyer);
			} else if (StringUtils.isNotEmpty(buyerTo.getFavoriteMusicAlbum()) || StringUtils.isNotEmpty(buyerTo.getFavoriteMusicCategory())) {
				MusicBuyer musicBuyer = new MusicBuyer();
				musicBuyer.setCnp(buyerTo.getCnp());
				musicBuyer.setName(buyerTo.getName());
				musicBuyer.setAge(buyerTo.getAge());
				musicBuyer.setCategories(buyerTo.getCategories());
				musicBuyer.setFavoriteMusicAlbum(buyerTo.getFavoriteMusicAlbum());
				musicBuyer.setFavoriteMusicCategory(buyerTo.getFavoriteMusicCategory());
				buyerRepository.save(musicBuyer);
			} else if (StringUtils.isNotEmpty(buyerTo.getFavoriteSport()) || StringUtils.isNotEmpty(buyerTo.getFavoriteSportPlayer())) {
				SportsBuyer sportsBuyer = new SportsBuyer();
				sportsBuyer.setCnp(buyerTo.getCnp());
				sportsBuyer.setName(buyerTo.getName());
				sportsBuyer.setAge(buyerTo.getAge());
				sportsBuyer.setCategories(buyerTo.getCategories());
				sportsBuyer.setFavoriteSport(buyerTo.getFavoriteSport());
				sportsBuyer.setFavoriteSportPlayer(buyerTo.getFavoriteSportPlayer());
				buyerRepository.save(sportsBuyer);
			}
		}
	}
}
