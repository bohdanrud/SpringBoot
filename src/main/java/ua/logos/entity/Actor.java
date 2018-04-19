package ua.logos.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "actor")
@NoArgsConstructor
@Getter
@Setter
public class Actor extends BaseEntity{
	
	@NotNull(message = "First name can't be null")
	@NotEmpty(message = "First name can't be empty")
	@Size(min = 2, max= 50, message = "Should be 2-50")
	@Column(name = "first_name")
	private String firstName;
	
	@NotNull(message = "Last name can't be null")
	@NotEmpty(message = "Last name can't be empty")
	@Size(min = 2, max= 50, message = "Should be 2-50")
	@Column(name = "last_name")
	private String lastName;
	
	private String gender;
	
	@NotNull(message = "First name can't be null")
	@NotEmpty(message = "First name can't be empty")
	@Size(min = 10, max= 10, message = "Should be 10")
	@Column(name = "date_of_bitrh")
	private String dateOfBirth;
	
	@ManyToMany
	@JoinTable(name = "film_actor", joinColumns = @JoinColumn(name = "actor_id"), inverseJoinColumns = @JoinColumn(name = "film_id"))
	private List<Film> films = new ArrayList<>();

}
