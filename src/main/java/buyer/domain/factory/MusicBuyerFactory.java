package buyer.domain.factory;

import buyer.domain.AbstractBuyerFactory;
import buyer.domain.Buyer;
import buyer.domain.MusicBuyer;
import transfer.BuyerTo;

public class MusicBuyerFactory extends AbstractBuyerFactory {

	@Override
	public Buyer create(BuyerTo buyerTo) {
		MusicBuyer musicBuyer = new MusicBuyer();
		musicBuyer.setCnp(buyerTo.getCnp());
		musicBuyer.setName(buyerTo.getName());
		musicBuyer.setAge(buyerTo.getAge());
		musicBuyer.setCategories(buyerTo.getCategories());
		musicBuyer.setFavoriteMusicAlbum(buyerTo.getFavoriteMusicAlbum());
		musicBuyer.setFavoriteMusicCategory(buyerTo.getFavoriteMusicCategory());
		return musicBuyer;
	}

	@Override
	public Buyer update(Buyer buyer, BuyerTo buyerTo) {
		MusicBuyer musicBuyer = (MusicBuyer) buyer;
		musicBuyer.setCnp(buyerTo.getCnp());
		musicBuyer.setName(buyerTo.getName());
		musicBuyer.setAge(buyerTo.getAge());
		musicBuyer.setCategories(buyerTo.getCategories());
		musicBuyer.setFavoriteMusicAlbum(buyerTo.getFavoriteMusicAlbum());
		musicBuyer.setFavoriteMusicCategory(buyerTo.getFavoriteMusicCategory());
		return musicBuyer;
	}
}
