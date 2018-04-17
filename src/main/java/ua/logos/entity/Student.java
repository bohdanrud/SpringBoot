package ua.logos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student")
@NoArgsConstructor
@Getter
@Setter
public class Student extends BaseEntity{
	
	@Column(name = "full_name")
	private String fullName;
	
	private int age;
	
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;

}
