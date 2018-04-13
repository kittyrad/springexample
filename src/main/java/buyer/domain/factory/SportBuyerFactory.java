package buyer.domain.factory;

import buyer.domain.AbstractBuyerFactory;
import buyer.domain.Buyer;
import buyer.domain.SportsBuyer;
import transfer.BuyerTo;

public class SportBuyerFactory extends AbstractBuyerFactory {

	@Override
	public Buyer create(BuyerTo buyerTo) {
		SportsBuyer sportsBuyer = new SportsBuyer();
		sportsBuyer.setCnp(buyerTo.getCnp());
		sportsBuyer.setName(buyerTo.getName());
		sportsBuyer.setAge(buyerTo.getAge());
		sportsBuyer.setCategories(buyerTo.getCategories());
		sportsBuyer.setFavoriteSport(buyerTo.getFavoriteSport());
		sportsBuyer.setFavoriteSportPlayer(buyerTo.getFavoriteSportPlayer());
		return sportsBuyer;
	}

	@Override
	public Buyer update(Buyer buyer, BuyerTo buyerTo) {
		SportsBuyer sportsBuyer = (SportsBuyer) buyer;
		sportsBuyer.setCnp(buyerTo.getCnp());
		sportsBuyer.setName(buyerTo.getName());
		sportsBuyer.setAge(buyerTo.getAge());
		sportsBuyer.setCategories(buyerTo.getCategories());
		sportsBuyer.setFavoriteSport(buyerTo.getFavoriteSport());
		sportsBuyer.setFavoriteSportPlayer(buyerTo.getFavoriteSportPlayer());
		return sportsBuyer;
	}
}
