package ua.logos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.logos.entity.LoginData;

public interface LoginDataRepository extends JpaRepository<LoginData, Integer> {

}
