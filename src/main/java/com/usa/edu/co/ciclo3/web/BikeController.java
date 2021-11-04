package com.usa.edu.co.ciclo3.web;

import com.usa.edu.co.ciclo3.model.Bike;
import com.usa.edu.co.ciclo3.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Bike")
@CrossOrigin(origins= "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class BikeController {
    @Autowired
    private BikeService services;
    @GetMapping("/all")
    public List<Bike> getBikes(){
        return services.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Bike> getBike(@PathVariable("id")int idBike) {return services.getBike(idBike);}

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Bike save(@RequestBody Bike bike){
        return services.save(bike);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Bike update(@RequestBody Bike bike){return services.update(bike);}

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int bikeId){return services.deleteBike(bikeId);}
}