package ua.logos.service;

import java.util.List;

import ua.logos.entity.Actor;


public interface ActorService {

	void saveActor(Actor actor);
	
	Actor findActorById(int id);
	
	List<Actor> findAllActors();
}
