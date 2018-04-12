package buyer.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SportsBuyer")
public class SportsBuyer extends Buyer {

	private String favoriteSportPlayer;

	private String favoriteSport;

	public String getFavoriteSportPlayer() {
		return favoriteSportPlayer;
	}

	public void setFavoriteSportPlayer(String favoriteSportPlayer) {
		this.favoriteSportPlayer = favoriteSportPlayer;
	}

	public String getFavoriteSport() {
		return favoriteSport;
	}

	public void setFavoriteSport(String favoriteSport) {
		this.favoriteSport = favoriteSport;
	}

}
