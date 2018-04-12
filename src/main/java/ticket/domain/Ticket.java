package ticket.domain;

import io.swagger.annotations.ApiModel;

import javax.persistence.*;

@Table(name = "TICKET")
@Access(AccessType.PROPERTY)
@ApiModel(value = "Ticket", description = "Entity object used to persist a ticket in the database")
@Entity
public class Ticket {

	private Long id;

	private String category;

	private String name;

	private Double price;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "CATEGORY")
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "PRICE")
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
