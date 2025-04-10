package com.plantas.plantas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plantas.plantas.model.Plantas;
import com.plantas.plantas.service.PlantasService;

@RestController
@RequestMapping("/plantas")
public class PlantasController {

    @Autowired
    private PlantasService plantasService;

    @GetMapping
    public List<Plantas> findAll() {
        return plantasService.findAll();
    }

    @GetMapping("/{id}")
    public Plantas findById(@PathVariable Long id) {
        return plantasService.findById(id);
    }
    

    @PostMapping
    public Plantas save(@RequestBody Plantas plantas) {
        return plantasService.save(plantas);
    }

    @PutMapping("/{id}")
    public Plantas update(@PathVariable Long id, @RequestBody Plantas plantas) {
        return plantasService.update(plantas);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        plantasService.delete(id);
    }
}
