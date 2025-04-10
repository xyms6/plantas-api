package com.plantas.plantas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plantas.plantas.model.Plantas;
import com.plantas.plantas.repository.PlantasRepository;

@Service
public class PlantasService {

    @Autowired
    private PlantasRepository plantasRepository;

    public List<Plantas> findAll() {
        return plantasRepository.findAll();
    }

    public Plantas findById(Long id) {
        return plantasRepository.findById(id).orElse(null);
    }

    public Plantas save(Plantas plantas) {
        return plantasRepository.save(plantas);
    }
    
    public void delete(Long id) {
        plantasRepository.deleteById(id);
    } 

    public Plantas update(Plantas plantas) {
        return plantasRepository.save(plantas);
    }
}