package buyer.domain.factory;

import buyer.domain.AbstractBuyerFactory;
import buyer.domain.Buyer;
import transfer.BuyerTo;

public class NullObjectBuyerFactory extends AbstractBuyerFactory {

	@Override
	public Buyer create(BuyerTo buyerTo) {
		throw new IllegalArgumentException("illegal type");
	}

	@Override
	public Buyer update(Buyer buyer, BuyerTo buyerTo) {
		throw new IllegalArgumentException("illegal type");
	}
}
