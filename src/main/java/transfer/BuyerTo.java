package transfer;

import ticket.domain.Ticket;

import java.util.ArrayList;
import java.util.List;

public class BuyerTo {

	private String name;

	private int age;

	private String cnp;

	private List<Ticket> tickets = new ArrayList<>();

	private List<String> categories = new ArrayList<>();

	private String favoriteFilm;

	private String favoriteMusicAlbum;

	private String favoriteMusicCategory;

	private String favoriteSportPlayer;

	private String favoriteSport;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	public List<String> getCategories() {
		return categories;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

	public String getFavoriteFilm() {
		return favoriteFilm;
	}

	public void setFavoriteFilm(String favoriteFilm) {
		this.favoriteFilm = favoriteFilm;
	}

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

	public String getCnp() {
		return cnp;
	}

	public void setCnp(String cnp) {
		this.cnp = cnp;
	}
}
