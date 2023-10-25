package com.imen.tennis.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imen.tennis.entities.Stats;
import com.imen.tennis.entities.WTA_Tour;
import com.imen.tennis.repos.TennisRepository;

@Service
public class TennisImplServices implements TennisServices {

    @Autowired
    TennisRepository tennisRepository;
	@Override
	public WTA_Tour saveWTA_Tour(WTA_Tour t) {
	return tennisRepository.save(t);
	}
	@Override
	public WTA_Tour updateWTA_Tour(WTA_Tour t) { return tennisRepository.save(t);
	}
	@Override
	public void deleteWTA_Tour(WTA_Tour t) { tennisRepository.delete(t);
	}
	@Override
	public void deleteWTA_TourById(Long id) {
		tennisRepository.deleteById(id);
	}
	@Override
	public WTA_Tour getWTA_Tour(Long id) { return tennisRepository.findById(id).get();
	}
	@Override
	public List<WTA_Tour> getAllWTA_Tour() { return tennisRepository.findAll();
	}
	
	@Override
	public List<WTA_Tour> findByNamedot(String name, Double dot) {
		return tennisRepository.findByNamedot(name, dot);
	}
	@Override
	public List<WTA_Tour> findByStats(Stats stats) {
		return tennisRepository.findByStats(stats);
	}
	@Override
	public List<WTA_Tour> findByNameTour(String name) {
		return tennisRepository.findByNameTour(name);
	}
	@Override
	public List<WTA_Tour> findByNameTourContains(String name) {
		return  tennisRepository.findByNameTourContains(name);
	}
	@Override
	public List<WTA_Tour> findByStatsIdStat(Long idStat) {
		return tennisRepository.findByStatsIdStat(idStat);
	}
	@Override
	public List<WTA_Tour> findByOrderByNameTourAsc() {
		return tennisRepository.findByOrderByNameTourAsc();
	}
	@Override
	public List<WTA_Tour> trierWTA_TourNameDot() {
		return tennisRepository.trierWTA_TourNameDot();
	}
	}




