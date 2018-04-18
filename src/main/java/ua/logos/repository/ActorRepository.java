package ua.logos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.logos.entity.Actor;

public interface ActorRepository extends JpaRepository<Actor, Integer> {

}
