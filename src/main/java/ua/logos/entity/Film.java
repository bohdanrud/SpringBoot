package ua.logos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
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
}
