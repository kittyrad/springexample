package buyer.domain;

import buyer.domain.factory.FilmBuyerFactory;
import buyer.domain.factory.MusicBuyerFactory;
import buyer.domain.factory.NullObjectBuyerFactory;
import buyer.domain.factory.SportBuyerFactory;
import transfer.BuyerTo;

public abstract class AbstractBuyerFactory {

	public static AbstractBuyerFactory getFactory(String type){
		if ("film".equals(type)) {
			return  new FilmBuyerFactory();
		} else if("sport".equals(type)) {
			return new SportBuyerFactory();
		} else if("music".equals(type)) {
			return new MusicBuyerFactory();
		} else{
			return new NullObjectBuyerFactory();
		}
	}

	public abstract Buyer create(BuyerTo buyerTo);
	public abstract Buyer update(Buyer buyer, BuyerTo buyerTo);

}
