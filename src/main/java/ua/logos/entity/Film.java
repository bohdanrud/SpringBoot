package ua.logos.entity;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "film")
@NoArgsConstructor
@Getter
@Setter
public class Film extends BaseEntity{
	@NotNull(message = "Name can't be null")
	@NotEmpty(message = "Name can't be empty")
	@Size(min = 2, max= 50, message = "Should be 2-50")
	private String name;
	
	@NotNull(message = "Can't be null")
	@NotEmpty(message = "Can't be empty")
	@Size(min = 2, max= 50, message = "Should be 2-50")
	private String description;
	

	private int releaseYear;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	@ManyToMany
	@JoinTable(name = "film_actor", joinColumns = @JoinColumn(name = "film_id"), inverseJoinColumns = @JoinColumn(name = "actor_id"))
	private List<Actor> actors = new ArrayList<>();
}
