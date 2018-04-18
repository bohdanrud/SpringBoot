package ua.logos.entity;


import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "category")
@NoArgsConstructor
@Getter
@Setter
public class Category extends BaseEntity{

	private String name;
}
