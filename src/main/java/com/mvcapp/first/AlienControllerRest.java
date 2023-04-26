package com.mvcapp.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlienControllerRest {

    @Autowired
    AlienRepo repo;
    @GetMapping("aliens")
    @ResponseBody
    public List<Alien> getAlien(){
        List<Alien> aliens = repo.findAll();
        return aliens; // viene convertito direttamente in JSON da jackson(?)

    }

    @GetMapping("alien/{aid}")
    @ResponseBody
    public Alien getAlien(@PathVariable("aid") int aid){
        return repo.findById(aid).orElse(new Alien(0, ""));
    }

    @PostMapping
    public Alien addAlien(Alien alien){
        repo.save(alien);
        return alien;
    }
}
