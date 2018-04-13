package buyer.domain.factory;

import buyer.domain.AbstractBuyerFactory;
import buyer.domain.Buyer;
import buyer.domain.FilmBuyer;
import transfer.BuyerTo;

public class FilmBuyerFactory extends AbstractBuyerFactory{

	@Override
	public Buyer create(BuyerTo buyerTo){
		FilmBuyer filmBuyer = new FilmBuyer();
		filmBuyer.setCnp(buyerTo.getCnp());
		filmBuyer.setAge(buyerTo.getAge());
		filmBuyer.setCategories(buyerTo.getCategories());
		filmBuyer.setName(buyerTo.getName());
		filmBuyer.setFavoriteFilm(buyerTo.getFavoriteFilm());
		return filmBuyer;
	}

	@Override
	public Buyer update(Buyer buyer, BuyerTo buyerTo) {
		FilmBuyer filmBuyer = (FilmBuyer) buyer;
		filmBuyer.setCnp(buyerTo.getCnp());
		filmBuyer.setName(buyerTo.getName());
		filmBuyer.setAge(buyerTo.getAge());
		filmBuyer.setCategories(buyerTo.getCategories());
		filmBuyer.setFavoriteFilm(buyerTo.getFavoriteFilm());
		return filmBuyer;
	}
}
