package ua.logos.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.logos.validator.CheckCountryNameExists;

@Entity
@Table(name = "country")
@NoArgsConstructor
@Getter
@Setter
public class Country extends BaseEntity{

	@CheckCountryNameExists
	@NotNull(message = "Country name can't be null")
	@NotEmpty(message = "Country name can't be empty")
	private String name;
	
}
