package ticket.domain;

import javax.persistence.*;

@Entity
public class Event {

	private Long id;

	private String name;

	private String category;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy= GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
