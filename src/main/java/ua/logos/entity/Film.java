package ua.logos.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "film")
@NoArgsConstructor
@Getter
@Setter
public class Film extends BaseEntity{
	
	private String name;
	
	private String description;
	
	@Column(name = "release_year")
	private int releaseYear;
	
	@Column(name = "category_id")
	private int categoryId;
	
	@ManyToMany
	@JoinTable(name = "film_actor", joinColumns = @JoinColumn(name = "film_id"), inverseJoinColumns = @JoinColumn(name = "actor_id"))
	private List<Actor> actors = new ArrayList<>();
}
