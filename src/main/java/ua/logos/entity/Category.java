package ua.logos.entity;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.logos.validator.CheckCategoryNameExists;

@Entity
@Table(name = "category")
@NoArgsConstructor
@Getter
@Setter
public class Category extends BaseEntity{

	@NotNull(message = "Name can't be null")
	@NotEmpty(message = "Name can't be empty")
	@CheckCategoryNameExists
	private String name;
}
