package buyer.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("FilmBuyer")
public class FilmBuyer extends Buyer {

	private String favoriteFilm;

	public String getFavoriteFilm() {
		return favoriteFilm;
	}

	public void setFavoriteFilm(String favoriteFilm) {
		this.favoriteFilm = favoriteFilm;
	}

}
