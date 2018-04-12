package buyer.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MusicBuyer")
public class MusicBuyer extends Buyer {

	private String favoriteMusicAlbum;

	private String favoriteMusicCategory;

	public String getFavoriteMusicAlbum() {
		return favoriteMusicAlbum;
	}

	public void setFavoriteMusicAlbum(String favoriteMusicAlbum) {
		this.favoriteMusicAlbum = favoriteMusicAlbum;
	}

	public String getFavoriteMusicCategory() {
		return favoriteMusicCategory;
	}

	public void setFavoriteMusicCategory(String favoriteMusicCategory) {
		this.favoriteMusicCategory = favoriteMusicCategory;
	}

}
