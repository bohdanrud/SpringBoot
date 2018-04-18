package ua.logos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "login_data")
@NoArgsConstructor
@Getter
@Setter
public class LoginData extends BaseEntity{
	
	private String email;
	
	private String password;
	
	@Column(name = "password_confirm")
	private String passwordConfirm;
	
	@Column(name = "actor_id")
	private int actorId;

}
