package ua.logos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.logos.validator.CheckEmailExists;

@Entity
@Table(name = "login_data")
@NoArgsConstructor
@Getter
@Setter
public class LoginData extends BaseEntity{
	
	@CheckEmailExists
	@NotNull(message = "Email can't be null")
	@NotEmpty(message = "Email can't be empty")
	private String email;
	
	@NotNull(message = "Password can't be null")
	@NotEmpty(message = "Password can't be empty")
	private String password;
	
	@NotNull(message = "Password can't be null")
	@NotEmpty(message = "Password can't be empty")
	@Column(name = "password_confirm")
	private String passwordConfirm;
	
	@Column(name = "actor_id")
	private int actorId;
	
	@OneToOne
	@JoinColumn(name = "loginData_id")
	private Actor actor;

}
