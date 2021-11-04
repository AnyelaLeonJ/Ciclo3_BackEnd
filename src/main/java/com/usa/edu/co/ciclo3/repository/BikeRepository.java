package com.usa.edu.co.ciclo3.repository;

import java.util.List;
import java.util.Optional;
import com.usa.edu.co.ciclo3.model.Bike;
import com.usa.edu.co.ciclo3.repository.crud.BikeCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BikeRepository {

    @Autowired
    private BikeCrudRepository CrudRepository;

    public List<Bike> getAll(){return (List<Bike>) CrudRepository.findAll();}
    public Optional <Bike> getBike (int id){return CrudRepository.findById(id);}
    public Bike save(Bike bike){return CrudRepository.save(bike);}
    public void delete(Bike bike) {CrudRepository.delete(bike);}
}