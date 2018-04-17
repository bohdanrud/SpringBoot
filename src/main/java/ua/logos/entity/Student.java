package ua.logos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student")
@NoArgsConstructor
@Getter
@Setter
public class Student extends BaseEntity{
	
	@NotNull(message = "Field fullName can't be null")
	@NotEmpty(message = "Field fullName can't be empty")
	@Column(name = "full_name")
	private String fullName;
	
	@Min(value = 10, message = "Should be more than 10")
	@Max(value = 75, message = "Should be less than 10")
	private int age;
	
	@NotNull(message = "Can't be empty")
	@Size(min = 5, max= 50, message = "Should be 5-50")
	private String email;
	
	@NotNull(message = "Country should be selected")
	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;

}
