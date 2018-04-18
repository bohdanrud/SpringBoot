package ua.logos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.logos.entity.Actor;
import ua.logos.repository.ActorRepository;
import ua.logos.service.ActorService;
@Service
public class ActorServiceImpl implements ActorService {


	@Autowired
	ActorRepository actorRepository;
	
	@Override
	public void saveActor(Actor actor) {
		// TODO Auto-generated method stub
		actorRepository.save(actor);
	}

	@Override
	public Actor findActorById(int id) {
		// TODO Auto-generated method stub
		return actorRepository.getOne(id);
	}

	@Override
	public List<Actor> findAllActors() {
		// TODO Auto-generated method stub
		return actorRepository.findAll();
	}

}
