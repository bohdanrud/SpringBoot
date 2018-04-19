package ua.logos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import ua.logos.entity.LoginData;

public interface LoginDataRepository extends JpaRepository<LoginData, Integer> {

	@Query("SELECT e FROM LoginData e WHERE e.email = :email")
	LoginData findLDByEmail(@Param("email") String email);
	
	
}
